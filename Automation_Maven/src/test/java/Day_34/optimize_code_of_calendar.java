package Day_34;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class optimize_code_of_calendar {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://www.traveluro.com/");
        driver.manage().window().maximize();

        closePopups(driver);
        selectDestination(driver, "Paris");
        selectDates(driver, "December 2024", "20", "21");

        driver.quit(); // Close the browser
    }

    // Close any pop-up dialogs if present
    private static void closePopups(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.svg']")).click();
            driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
        } catch (Exception e) {
            System.out.println("No pop-ups to close.");
        }
    }

    // Select a destination from the autocomplete list
    private static void selectDestination(WebDriver driver, String destination) {
        driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(destination);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> locations = driver.findElements(By.xpath("//ul[@id='searchInputAutocompleteList']//li//a"));
        for (WebElement location : locations) {
            if (location.getText().contains(destination)) {
                System.out.println("Selected Destination: " + location.getText());
                location.click();
                break;
            }
        }
    }

    // Select check-in and check-out dates from the calendar
    private static void selectDates(WebDriver driver, String monthYear, String startDate, String endDate) {
        // Open the calendar
        driver.findElement(By.xpath("//div[@id='search-booking-form']//div[@class='checkin-checkout-input bookingdate-desktop']")).click();

        // Navigate to the desired month
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//div[@class='calendar left']//th[@class='month']")).getText();
            if (currentMonth.equals(monthYear)) {
                break;
            }
            driver.findElement(By.xpath("//th[@class='next available']")).click();
        }

        // Select the start date
        selectDate(driver, startDate, "Check-in");

        // Select the end date
        selectDate(driver, endDate, "Check-out");
    }

    // Helper method to select a date
    private static void selectDate(WebDriver driver, String date, String action) {
        List<WebElement> dates = driver.findElements(By.xpath("//div[@class='calendar left']//td[not(contains(@class, 'off'))]"));
        for (WebElement day : dates) {
            if (day.getText().equals(date)) {
                System.out.println(action + " Date: " + day.getText());
                day.click();
                break;
            }
        }
    }
}
