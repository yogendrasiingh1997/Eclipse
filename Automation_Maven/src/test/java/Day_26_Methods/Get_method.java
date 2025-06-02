package Day_26_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		//get(url)	
	        driver.get("https://www.traveluro.com/");
	        
	    //get title ()
	        
	        System.out.println(driver.getTitle());
			
	        //get current url
	        
	        System.out.println(driver.getCurrentUrl());

	        
	        //get page source
	        //System.out.println(driver.getPageSource());
	        
	       // driver.getWindowHandle()
	        
	        String id=driver.getWindowHandle();
	        System.out.println(id);
	       
			

	}

}
