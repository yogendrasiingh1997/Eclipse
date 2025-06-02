package Day_27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wait_Command {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 
	        driver.get("https://www.traveluro.com/");
	        Thread.sleep(1000);
	        driver.manage().window().maximize();
	        
	        Thread.sleep(10000);
	     
	           
	        
	        driver.findElement(By.xpath("//a[contains(text(),'Las Vegas')]")).click();
	  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

	}

}
