package Day_27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15)); //declaration
		 
        driver.get("https://www.traveluro.com/");
       
        driver.manage().window().maximize();
        
        WebElement mywait=(WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"refTopDestination\"]/div/div[3]/div[2]")));
        
        mywait.click();
        
       
        driver.findElement(By.xpath("//*[@id=\"refTopDestination\"]/div/div[3]/div[2]")).click();
  
	}
}
