package Day_29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    
	    
	    
	    driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
	    
	    Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
	}

}
