package Day_28;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigational_command {

	public static void main(String[] args) throws MalformedURLException 
	
	
	{
	    WebDriver driver=new ChromeDriver();
			 
	     //driver.get("https://www.traveluro.com/");    //accept URL only string format 
	       
	     //driver.manage().window().maximize();
	     
	     driver.navigate().to("https://www.traveluro.com/");  //accept URL in both object and string format 
	     
	     //URL myurl=new URL("https://www.traveluro.com/");
	     
	     //driver.navigate().to(myurl);
	     
	     driver.navigate().to("https://www.traveluro.com/search?check_in=2024-10-24&check_out=2024-10-25&rooms=1&destination=Las%20Vegas,%20Nevada,%20United%20States&type=R2008&party=%5B%7B%22adults%22:2,%22children%22:%5B%5D%7D%5D");
	  
	     driver.navigate().back();
	     System.out.println(driver.getCurrentUrl());
	     
	     driver.navigate().forward();
	     System.out.println(driver.getCurrentUrl());
	     
	     driver.navigate().refresh();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
