package Day_28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_Specific_browser_window {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
        driver.get("https://www.traveluro.com/search?check_in=2024-10-24&check_out=2024-10-25&rooms=1&destination=Las%20Vegas,%20Nevada,%20United%20States&type=R2008&party=%5B%7B%22adults%22:2,%22children%22:%5B%5D%7D%5D");
       
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[@id='hotel_328873']//div[@class='col-xs-6 search-result-content']")).click();
        
        
        Set<String>WindowIDs=driver.getWindowHandles();
        
        for (String winID:WindowIDs)
        {
        	String title=driver.switchTo().window(winID).getTitle();
        	System.out.println(title);
        	
        	if(title.equals("The D Hotel & Casino, Las Vegas - book your stay with Traveluro"))
        	{
        		driver.close();
        	}
        }
  
        
        
        
        
        
        
        
        
        
        

	}

}
