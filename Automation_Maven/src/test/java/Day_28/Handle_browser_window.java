package Day_28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_browser_window {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
        driver.get("https://www.traveluro.com/search?check_in=2024-10-24&check_out=2024-10-25&rooms=1&destination=Las%20Vegas,%20Nevada,%20United%20States&type=R2008&party=%5B%7B%22adults%22:2,%22children%22:%5B%5D%7D%5D");
       
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[@id='hotel_328873']//div[@class='col-xs-6 search-result-content']")).click();
        
        
        Set<String>WindowIDs=driver.getWindowHandles();
        
        
        //Approach 1 covert set string to list string because extract the individual ids
        
        /* 
        List<String> windowlist=new ArrayList(WindowIDs);
        
        String parent=windowlist.get(0);
        String child=windowlist.get(1);
        
        
        //switch to child window
        
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        
        
        //switch to parent window
        
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
        */
        
        //Approach 2
        
        for (String winID:WindowIDs)
        {
        	String title=driver.switchTo().window(winID).getTitle();
        	if(title.equals("Hotels in Las Vegas, Nevada, United States - book your hotel with Traveluro")) 
        	{
        		System.out.println(driver.getCurrentUrl());
        	}
        }
        
        
        
        
        
        
        
	}

}
