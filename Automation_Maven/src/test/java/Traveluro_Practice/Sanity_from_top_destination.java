package Traveluro_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanity_from_top_destination {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.traveluro.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 200);");

	    driver.manage().window().maximize();
	    
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.svg']")).click();
	    driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"refTopDestination\"]/div/div[3]/div[2]/div/a")).click();
		
        Thread.sleep(5000);
        
        
        //HAC Page
		
		//sorting for price form low to high
		driver.findElement(By.xpath("//span[@class='sprites bg-close-icon-white alert-close']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Relevance']")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Price low to high']")).click();
		
		Thread.sleep(5000);
		
		
		
		
		//BA page
	    driver.findElement(By.xpath("//div[@class='col-xs-3 secondary-details-contnet']//a")).click();
	    
	    //switch window for BA page
	    Set<String>WindowIDs=driver.getWindowHandles();
        List<String> windowlist=new ArrayList(WindowIDs);
        String parent=windowlist.get(0);
        String child=windowlist.get(1);
        
     
		driver.switchTo().window(child);
        //System.out.println(driver.getTitle());
        
	    
	    //Book now button on BA page
       // driver.findElement(By.xpath("//a[@class='btn-dark-blue btn-effect1 btn-booknow']")).click();
        
      //close vio 
        try 
			{
				driver.findElement(By.xpath("//div[@id='myModalVIO']//button[@type='button']//span//*[name()='svg']")).click();
				
			}
			catch (Exception e)
			{
				System.out.println("Vio is not available");
			}
        Thread.sleep(10000);
		//show more deals
		
		//driver.findElement(By.xpath("//a[@class='showmore-btn']")).click();
		
		try
		{
			driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
		}
		catch(Exception e)
		{
			System.out.println("no cookies banner");
		}
		
		List<WebElement> getDeals = driver.findElements(By.xpath("//div[@class='room-book-now']/div"));
 		for (WebElement deal : getDeals) 
 		{
 		    
 		        if (deal.getText().contains("Free Cancellation By")) 
 		        {
 		            System.out.println("Yes!! we have free cancellation deals");
 		            deal.findElement(By.className("book-now-col")).click();
							Thread.sleep(5000);
							
							//Payment Page
					        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Yogendra");
					        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
					        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yogendra@holisto.com");
					        driver.findElement(By.xpath("//input[@id='EmailConfirm']")).sendKeys("yogendra@holisto.com");
					        driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys("32456");
					        driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("3455462100");
					        driver.findElement(By.xpath("//div[@class='guest-details-section guest-details-secondary']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();
						    
					       
					        //Extras
					         
					        //VIP
					        try 
					        {
					        Thread.sleep(10000);
						    driver.findElement(By.xpath("//div[@class='service-packages basic-services']/div/div[@class='d-flex justify-content-end']")).click();
						    Thread.sleep(5000);
					        }
					        
					        catch(Exception e)
					        {
					        	System.out.println("vip is not selected");
					        }
					        
					        
					        
					        //CG
					        try {
 						        if(driver.findElement(By.xpath("//li[@class='clearfix']/div[@class='non-cancelation clearfix']")).isDisplayed())
 						        {
 						        	driver.findElement(By.xpath("//label[contains(text(),'No thanks, I’ll risk it')]")).click();
 						        	driver.findElement(By.xpath("//div[@class='trip-protection-section position-relative']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();
 						        }
 						        
 						        else
 						        {
 						        	System.out.println("No insurance is present");
 						        }
 						        }
 						        catch (Exception e)
 						        {
 						        	System.out.println("No insurance is present");
 						        }
					        
					        
					        //TIP
					        driver.findElement(By.xpath("//button[@id='No_Tip']")).click();
						    
						    
						    //CC details
					        
					        //Credit card option
					        if(driver.findElement(By.xpath("//div[@id='GooglePay']")).isDisplayed())
					        {
					        	 driver.findElement(By.xpath("//a[contains(@class,'payment-method payment-method-credit-card')]")).click();
					        }
					        else
					        {
					        	driver.findElement(By.xpath("//a[contains(@class,'payment-method payment-method-credit-card')]")).click();
					        }
					        
					        
						    driver.findElement(By.xpath("//a[contains(@class,'payment-method payment-method-credit-card')]")).click();
						    driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("5555555555554444");
						    driver.findElement(By.xpath("//input[@id='MonthPaymentPage']")).sendKeys("05");
						    driver.findElement(By.xpath("//input[@id='YearPaymentPage']")).sendKeys("2026");
						    driver.findElement(By.xpath("//input[@id='CVV']")).sendKeys("123");
						    
						    driver.findElement(By.xpath("//button[@id='book-room']")).click();
						    System.out.println(driver.getTitle());
						    Thread.sleep(10000);
						    
						    System.out.println("Trip_number: " + driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText());
						    
						}

					  }
					
				
			
		


}
}
