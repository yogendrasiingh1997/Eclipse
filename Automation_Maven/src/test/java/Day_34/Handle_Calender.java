package Day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.traveluro.com/");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.svg']")).click();
	    driver.findElement(By.xpath("//span[@class='close-btn-img']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Paris");
	    Thread.sleep(5000);
	    
	    List<WebElement> List=driver.findElements(By.xpath("//ul[@id='searchInputAutocompleteList']//li//a"));
	    
	    //System.out.println(List.size());
	    
	    
	   
	    //Home Page
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
	    String month_year="December 2025";
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
	    	
	    
	    //select start date
	    
	    List<WebElement> dates=driver.findElements(By.xpath("//div[@class='calendar left']/div[@class='calendar-table']/table/tbody/tr/td"));
	  
        for(WebElement dt:dates)
        {
             if(dt.getText().equals(start_date))
             {
            	     {
            	    	 System.out.println("Check_in: " + dt.getText() +" " +month_year);  
            	    	 dt.click();
            	    	 break;
            	     }
        	 }

        }

        
      //select end date
        
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
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
