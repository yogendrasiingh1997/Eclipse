package Traveluro_Practice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sanity {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.traveluro.com/");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.svg']")).click();
	    driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Paris");
	    Thread.sleep(5000);
	    
	    List<WebElement> List=driver.findElements(By.xpath("//ul[@id='searchInputAutocompleteList']//li//a"));
	    
	    System.out.println(List.size());
	    
	    
	   
	    for(WebElement location:List)
	    {
	    	//System.out.println(location.getText());
	    	Thread.sleep(5000);
	    	if(location.getText().contains("Paris"))
	    	{
	    		System.out.println("Destination: " + " "+location.getText());
	    		location.click();
	    		break;
	    	}
	    }
	    

	    //calendar
	    
	    //Step 1 open calendar
	    
	    driver.findElement(By.xpath("//div[@id='search-booking-form']//div[@class='checkin-checkout-input bookingdate-desktop']")).click();
	    
	    
	    
	    //Step 2 
	    String month_year="May 2025";
	    String start_date="20";
	    String end_date="21";
	    
	    
	    String current_date=driver.findElement(By.xpath("//div[@class='calendar left']/div[@class='calendar-table']/table/thead/tr/th[@class='month']")).getText();

	    while(true)
	    {
	    	String current_month=driver.findElement(By.xpath("//div[@class='calendar left']/div[@class='calendar-table']/table/thead/tr/th[@class='month']")).getText();
	        
	        if(current_month.equals(month_year))
	        {
	        	break;
	        }
	        
	        
	        //next month
	        driver.findElement(By.xpath("//th[@class='next available']")).click();
	    }
	    	
	    
	    //select date
	    
	    List<WebElement> check_in=driver.findElements(By.xpath("//div[@class='calendar left']/div[@class='calendar-table']/table/tbody/tr/td"));
	  
        for(WebElement start:check_in)
        {
             if(start.getText().equals(start_date))
             {
            	     {
            	    	 System.out.println("Check_in: " + start.getText() +" " +month_year);  
            	    	 start.click();
            	    	 break;
            	     }
        	     }

        }

        
        List<WebElement> check_out=driver.findElements(By.xpath("//div[@class='calendar left']/div[@class='calendar-table']/table/tbody/tr/td"));
        for(WebElement end:check_out)
        {
             if(end.getText().equals(end_date))
             {
            	     {
            	    	 System.out.println("Check_out: " + end.getText() +" " +month_year);
            	    	 end.click();
            		     break;
            	     }
        	     }

        }
	    
	    driver.findElement(By.xpath("//div[@id='search-booking-form']//div[@class='btn-effect go-btn']")).click();
	    
	    //HAC Page
		Thread.sleep(5000);
		
		//sorting for price form low to high
		driver.findElement(By.xpath("//span[@class='sprites bg-close-icon-white alert-close']")).click();
		
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Relevance']")).click();
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Relevance']")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Price low to high']")).click();
		
		Thread.sleep(5000);
		
		
		
	
		//BA page
	    driver.findElement(By.xpath("//div[@class='col-xs-3 secondary-details-contnet']//a")).click();
	    
	    String mainWindow=driver.getWindowHandle(); //main window
	    
	    //switch window for BA page
	    Set<String>WindowIDs=driver.getWindowHandles();
        List<String> windowlist=new ArrayList<>(WindowIDs);
        String parent=windowlist.get(0);
        String child=windowlist.get(1);
        
     
		driver.switchTo().window(child);
		//driver.switchTo().window(windowlist.get(0));
        System.out.println("Hotel name: "+ "" +driver.getTitle());
        
	    
        
        
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
         
         
         //Cokkies banner
 		
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

 							//payment page
 	 						driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Yogendra");
 						        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
 						        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yogendra@holisto.com");
 						        driver.findElement(By.xpath("//input[@id='EmailConfirm']")).sendKeys("yogendra@holisto.com");
 						        driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys("32456");
 						        driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("3455462100");
 						        driver.findElement(By.xpath("//div[@class='guest-details-section guest-details-secondary']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();
 						        Thread.sleep(10000);
 						       
 						        //Extras
 						         
 						        //VIP
 						        try 
 						        {
 						        	driver.findElement(By.xpath("//div[@class='service-packages basic-services']/div/div[@class='d-flex justify-content-end']")).click();
 							        //driver.findElement(By.xpath("//div[@class='service-packages basic-services']/div")).click();
 							    
 						            Thread.sleep(5000);
 						        }
 						        
 						        catch(Exception e)
 						        {
 						        	System.out.println("vip is not selected");
 						        }
 						        
 						        
 						        
 						        //CG
 						        try 
 						        {
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
 							    
 							    try
 							    {
 							    	driver.findElement(By.xpath("//button[@id='book-room']")).click();
 							    }
 							    catch(Exception e)
 							    {
 							    	driver.findElement(By.xpath("//button[@id='book-room']")).click();
 							    }
 							    
 							    System.out.println(driver.getTitle());
 							    
 							    Thread.sleep(10000);
 							    
 							    System.out.println("Trip_number: " + driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText());
 		        }
	    
	}

	}
}
