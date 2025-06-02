package Day_36_Keyboard_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_handle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.holisto.com/destinations/paris?checkIn=2024-10-29&checkOut=2024-10-31&occupancy=%5B%7B%22adults%22%3A2%2C%22children%22%3A%5B%5D%7D%5D&placeId=R2734&placeType=city&map=false");
	    driver.manage().window().maximize();
	    
	    Actions act=new Actions(driver);
	    
	    
	    WebElement min=driver.findElement(By.xpath("//div[@class='MuiStack-root filters-section-content__component filters-section-content__component--9 price-per-night-panel css-19r9joa']//span[3]"));
	    
	    
	    System.out.println("location of min price range slider" +min.getLocation());
	    
	    
	    act.dragAndDropBy(min, 20, 0).perform();
	    
	    System.out.println("location of min price range slider after moving: " +min.getLocation());
	    
	    
	    act.keyDown(Keys.CONTROL).keyDown(Keys.SUBTRACT).keyUp(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();
	    
	    
	    
	    
	}

}
