package Day_22_locator;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://www.traveluro.com/");
		
		driver.manage().window().maximize();
		
		
		//id
		driver.findElement(By.id("myInput")).sendKeys("las");
		
		//name
		driver.findElement(By.name("Go")).click();
		
		
		//linktext
		//driver.findElement(By.linkText("Las Vegas")).click();	
		
		//class name
		
		Thread.sleep(1000);
		
	//driver.findElement(By.className("col-sm-4")).click();	
		
		//driver.findElement(By.className("app-promotion-close-icon close")).click();
		driver.findElement(By.className("close-btn-img")).click();
		
		List<WebElement>footerlinks=driver.findElements(By.className("footer-menu"));
		System.out.println(footerlinks.size());
		
		
		//tagname
		List<WebElement> total_links=driver.findElements(By.tagName("a"));
		System.out.println(total_links.size());
		
		List<WebElement> total_Images=driver.findElements(By.tagName("img"));
		System.out.println(total_Images.size());

	
		
	}

}
