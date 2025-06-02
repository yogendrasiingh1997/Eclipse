package Day_35_Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover 
{

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.traveluro.com/");
	    driver.manage().window().maximize();
	    
	    WebElement currency=driver.findElement(By.xpath("//li[@id='Currency']"));
	    WebElement Eur= driver.findElement(By.xpath("//div[contains(text(),'(EUR) €')]"));
	    
	    Actions act=new Actions(driver);
	    
	    //act.moveToElement(currency).moveToElement(Eur).click().build().perform();
	    act.moveToElement(currency).moveToElement(Eur).click().perform();
	   
	    
	}

}
