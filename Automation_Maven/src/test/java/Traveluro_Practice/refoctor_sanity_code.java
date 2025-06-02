package Traveluro_Practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class refoctor_sanity_code {

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://www.traveluro.com/");
        driver.manage().window().maximize();

        closePopups(driver);
        selectDestination(driver, "Paris");
        selectDates(driver, "May 2025", "20", "21");
        driver.findElement(By.xpath("//div[@id='search-booking-form']//div[@class='btn-effect go-btn']")).click();

        // Hotel results page
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='sprites bg-close-icon-white alert-close']"))).click();
        sortResultsByPrice(driver);

        // Select hotel and switch to new window
        driver.findElement(By.xpath("//div[@class='col-xs-3 secondary-details-contnet']//a")).click();
        switchToNewWindow(driver);

        closeVioPopup(driver);
        handleCookiesBanner(driver);
        selectFreeCancellationDeal(driver);
        
        // Payment page
        fillGuestDetails(driver);
        selectExtras(driver);
        enterPaymentDetails(driver);
        finalizeBooking(driver);
        
        // Printing check-in and check-out dates
        String checkInDate = "Check-in Date: May 20, 2025";
        String checkOutDate = "Check-out Date: May 21, 2025";
        System.out.println(checkInDate);
        System.out.println(checkOutDate);
        
        System.out.println("Trip Number: " + driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText());
    }

    private static void closePopups(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.svg']")).click();
            driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
        } catch (Exception e) {
            System.out.println("Popups not present.");
        }
    }

    private static void selectDestination(WebDriver driver, String destination) throws InterruptedException {
        driver.findElement(By.id("myInput")).sendKeys(destination);
        Thread.sleep(5000);
        for (WebElement location : driver.findElements(By.xpath("//ul[@id='searchInputAutocompleteList']//li//a"))) {
            if (location.getText().contains(destination)) {
                location.click();
                break;
            }
        }
    }

    private static void selectDates(WebDriver driver, String monthYear, String startDate, String endDate) {
        driver.findElement(By.xpath("//div[@class='checkin-checkout-input bookingdate-desktop']")).click();
        while (!driver.findElement(By.xpath("//div[@class='calendar left']//th[@class='month']")).getText().equals(monthYear)) {
            driver.findElement(By.xpath("//th[@class='next available']")).click();
        }
        selectDate(driver, startDate);
        selectDate(driver, endDate);
    }

    private static void selectDate(WebDriver driver, String date) {
        for (WebElement day : driver.findElements(By.xpath("//div[@class='calendar left']//td"))) {
            if (day.getText().equals(date)) {
                day.click();
                break;
            }
        }
    }

    private static void sortResultsByPrice(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Relevance']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Price low to high']")).click();
        Thread.sleep(5000);
    }

    private static void switchToNewWindow(WebDriver driver) {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windowHandles);
        driver.switchTo().window(windowList.get(1));
        System.out.println("Hotel Name: " + driver.getTitle());
    }

    private static void closeVioPopup(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//div[@id='myModalVIO']//button[@type='button']")).click();
        } catch (Exception e) {
            System.out.println("Vio popup not present.");
        }
    }

    private static void handleCookiesBanner(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
        } catch (Exception e) {
            System.out.println("Cookies banner not present.");
        }
    }

    private static void selectFreeCancellationDeal(WebDriver driver) {
        for (WebElement deal : driver.findElements(By.xpath("//div[@class='room-book-now']/div"))) {
            if (deal.getText().contains("Free Cancellation By")) {
                deal.findElement(By.className("book-now-col")).click();
                break;
            }
        }
    }

    private static void fillGuestDetails(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("FirstName")).sendKeys("Yogendra");
        driver.findElement(By.id("LastName")).sendKeys("Singh");
        driver.findElement(By.id("Email")).sendKeys("yogendra@holisto.com");
        driver.findElement(By.id("EmailConfirm")).sendKeys("yogendra@holisto.com");
        driver.findElement(By.id("PhoneNumber")).sendKeys("3455462100");
        driver.findElement(By.id("ZipCode")).sendKeys("32456");
        driver.findElement(By.xpath("//div[@class='guest-details-section guest-details-secondary']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();
        Thread.sleep(5000);
    }

    private static void selectExtras(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//div[@class='service-packages basic-services']/div/div[@class='d-flex justify-content-end']")).click();
        } catch (Exception e) {
            System.out.println("VIP not selected.");
        }
        try {
            if (driver.findElement(By.xpath("//li[@class='clearfix']/div[@class='non-cancelation clearfix']")).isDisplayed()) {
                driver.findElement(By.xpath("//label[contains(text(),'No thanks, I’ll risk it')]")).click();
                driver.findElement(By.xpath("//a[@class='btn-effect btn-lg btn-payment-continue']")).click();
            }
        } catch (Exception e) {
            System.out.println("No insurance option present.");
        }
        driver.findElement(By.id("No_Tip")).click();
    }

    private static void enterPaymentDetails(WebDriver driver) {
        driver.findElement(By.xpath("//a[contains(@class,'payment-method-credit-card')]")).click();
        driver.findElement(By.id("CardNumber")).sendKeys("5555555555554444");
        driver.findElement(By.id("MonthPaymentPage")).sendKeys("05");
        driver.findElement(By.id("YearPaymentPage")).sendKeys("2026");
        driver.findElement(By.id("CVV")).sendKeys("123");
    }

    private static void finalizeBooking(WebDriver driver) {
        try {
            driver.findElement(By.id("book-room")).click();
        } catch (Exception e) {
            driver.findElement(By.id("book-room")).click();
        }
        System.out.println("Booking finalized.");
    }
}
