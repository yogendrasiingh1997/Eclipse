package Traveluro_Practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BA_page {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url=new String ("https://www.traveluro.com/hotel/317486?start_date=2024-10-29&end_date=2024-10-30&num_rooms=1&ts=traveluro_organic_us&data_key=NDlfVVNEXzEzNV80NV9Hb29nbGUyXzIwMjQtMTAtMTUgMTA6MDY6MTlfUk9fTl9fMF9ERVNLVE9QX180NV9VU0RfMjAyNC0xMC0xNSAxMDoxNjoxMV80M19VU0Q%3D&hotel_index=4&party=%5B%7B%22adults%22:2,%22children%22:%5B%5D%7D%5D&previousHotelPrice=43&click=1");
		
		driver.navigate().to(url);
	    driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//close vio 
          try 
			{
				driver.findElement(By.xpath("//div[@id='myModalVIO']//button[@type='button']//span//*[name()='svg']")).click();
				
			}
			catch (Exception e)
			{
				System.out.println("Vio is not available");
			}
		
		//show more deals
		
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//a[@class='showmore-btn']")).click();
		
		driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();

		
		/*
		  List<WebElement> getDeals = driver.findElements(By.xpath("//div[@class='room-book-now']/div"));
        
        // Iterate through the deals
        for (WebElement deal : getDeals) 
        {
        	
            if (deal.getText().contains("Free Cancellation By"))
            {
                System.out.println("Free Cancellation deals");
                deal.findElement(By.xpath("div/a")).click();
                
            } 
            else 
            {
                System.out.println("Non Refundable deals");
            }
          
	     }
	      */
		
       List<WebElement> tag=driver.findElements(By.xpath("//div[@class='room-book-now']/div"));
		
		System.out.println(tag.size());
		
		
				try {
					for(WebElement deal:tag)
				{
					if(deal.getText().contains("Free Cancellation By"))
					{
						System.out.println("Free Cancellation deals");
						deal.findElement(By.xpath("/html/body/app-root/app-hotel/div/div[1]/div/div/div/div/app-room-types/section/div/div/div/div/div/div/div/div/div[5]/a")).click();
					}
				}
				}
				catch (Exception e) 
				{
					System.out.println("Timeout error");
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


