package Traveluro_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refactor_sanity_from_top_destination {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://www.traveluro.com/");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
        driver.manage().window().maximize();

        // Close initial pop-ups
        closePopUps(driver);

        // Navigate to top destination deals
        driver.findElement(By.xpath("//*[@id=\"refTopDestination\"]/div/div[3]/div[2]/div/a")).click();
        Thread.sleep(5000);

        // Sort deals by price
        sortDeals(driver);

        // Click on the first available deal
        driver.findElement(By.xpath("//div[@class='col-xs-3 secondary-details-contnet']//a")).click();
        switchToChildWindow(driver);

        // Handle VIO modal
        closeVioModal(driver);
        Thread.sleep(10000);
        
        // Close cookies banner if present
        closeCookiesBanner(driver);
        
        // Get deals and proceed with booking if free cancellation is available
        List<WebElement> getDeals = driver.findElements(By.xpath("//div[@class='room-book-now']/div"));
        for (WebElement deal : getDeals) {
            if (deal.getText().contains("Free Cancellation By")) {
                System.out.println("Yes!! we have free cancellation deals");
                deal.findElement(By.className("book-now-col")).click();
                Thread.sleep(5000);
                fillPaymentDetails(driver);
                break; // Assuming we only want the first deal
            } 
        }

        // Print check-in and check-out dates
        printCheckInAndCheckOutDates(driver);

        // Do not close the browser
        // driver.quit();
    }

    private static void closePopUps(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.svg']")).click();
            driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
        } catch (Exception e) {
            System.out.println("Pop-ups are not available");
        }
    }

    private static void sortDeals(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='sprites bg-close-icon-white alert-close']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Relevance']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Price low to high']")).click();
        Thread.sleep(5000);
    }

    private static void switchToChildWindow(WebDriver driver) {
        Set<String> WindowIDs = driver.getWindowHandles();
        List<String> windowlist = new ArrayList<>(WindowIDs);
        driver.switchTo().window(windowlist.get(1)); // Switch to child window
    }

    private static void closeVioModal(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//div[@id='myModalVIO']//button[@type='button']//span//*[name()='svg']")).click();
        } catch (Exception e) {
            System.out.println("Vio is not available");
        }
    }

    private static void closeCookiesBanner(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
        } catch (Exception e) {
            System.out.println("No cookies banner");
        }
    }

    private static void fillPaymentDetails(WebDriver driver) throws InterruptedException {
        // Fill in payment information
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Yogendra");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yogendra@holisto.com");
        driver.findElement(By.xpath("//input[@id='EmailConfirm']")).sendKeys("yogendra@holisto.com");
        driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys("32456");
        driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("3455462100");
        driver.findElement(By.xpath("//div[@class='guest-details-section guest-details-secondary']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();

        // Handle extras and tips
        handleExtrasAndTips(driver);

        // Enter credit card details
        enterCreditCardDetails(driver);
    }

    private static void handleExtrasAndTips(WebDriver driver) throws InterruptedException {
        // VIP selection
        try {
            Thread.sleep(10000);
            driver.findElement(By.xpath("//div[@class='service-packages basic-services']/div/div[@class='d-flex justify-content-end']")).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("VIP is not selected");
        }

        // Cancellation Insurance
        try {
            if (driver.findElement(By.xpath("//li[@class='clearfix']/div[@class='non-cancelation clearfix']")).isDisplayed()) {
                driver.findElement(By.xpath("//label[contains(text(),'No thanks, I’ll risk it')]")).click();
            } else {
                System.out.println("No insurance is present");
            }
        } catch (Exception e) {
            System.out.println("No insurance is present");
        }

        // Tip selection
        driver.findElement(By.xpath("//button[@id='No_Tip']")).click();
    }

    private static void enterCreditCardDetails(WebDriver driver) {
        driver.findElement(By.xpath("//a[contains(@class,'payment-method payment-method-credit-card')]")).click();
        driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("5555555555554444");
        driver.findElement(By.xpath("//input[@id='MonthPaymentPage']")).sendKeys("05");
        driver.findElement(By.xpath("//input[@id='YearPaymentPage']")).sendKeys("2026");
        driver.findElement(By.xpath("//input[@id='CVV']")).sendKeys("123");
        driver.findElement(By.xpath("//button[@id='book-room']")).click();
        System.out.println(driver.getTitle());
    }

    private static void printCheckInAndCheckOutDates(WebDriver driver) {
        try {
            String checkInDate = driver.findElement(By.xpath("//p[@class='checkin-selected-date']")).getText();
            String checkOutDate = driver.findElement(By.xpath("//p[@class='checkout-selected-date']")).getText();
            System.out.println("Check-in Date: " + checkInDate);
            System.out.println("Check-out Date: " + checkOutDate);
        } catch (Exception e) {
            System.out.println("Could not retrieve check-in and check-out dates.");
        }
    }
}
