package Day_26_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_method {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		        driver.get("https://www.traveluro.com/");
		        driver.manage().window().maximize();
		        
		        
		        //is displayed
		        WebElement logo=driver.findElement(By.xpath("//span[@class='logo sprites4 bg-logo']"));
		        System.out.println(logo.isDisplayed());
		        
		        boolean status=driver.findElement(By.xpath("//span[@class='logo sprites4 bg-logo']")).isDisplayed();
		        System.out.println(status);
		        
		        //is enabled
		        boolean enable=driver.findElement(By.xpath("//input[@id='myInput']")).isDisplayed();
				        System.out.println(enable);
;
	}

}
