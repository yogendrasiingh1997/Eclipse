package Day_32;
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

public class Auto_Suggestion {

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
	    
	    
	   /*
	    for(int i=0;i<List.size();i++)
	    {
	    	System.out.println(List.get(i).getText());
	    	if(List.get(i).getText().contains("Paris"))
	    	{
	    		List.get(i).click();
	    		break;
	    	}
	    }
	    
	    */
	   
	    //Home Page
	    for(WebElement location:List)
	    {
	    	System.out.println(location.getText());
	    	Thread.sleep(5000);
	    	if(location.getText().contains("Paris"))
	    	{
	    		location.click();
	    		break;
	    	}
	    }
	    
	    
	    driver.findElement(By.xpath("//div[@id='search-booking-form']//div[@class='btn-effect go-btn']")).click();
	    
	    
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
	    
	    //switch window for BA page
	    Set<String>WindowIDs=driver.getWindowHandles();
        List<String> windowlist=new ArrayList(WindowIDs);
        String parent=windowlist.get(0);
        String child=windowlist.get(1);
        
     
		driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        
	    
	    //Book now button on BA page
        driver.findElement(By.xpath("//a[@class='btn-dark-blue btn-effect1 btn-booknow']")).click();
        
        
        //Payment Page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Yogendra");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yogendra@holisto.com");
        driver.findElement(By.xpath("//input[@id='EmailConfirm']")).sendKeys("yogendra@holisto.com");
        driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys("32456");
        driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("3455462100");
        driver.findElement(By.xpath("//div[@class='guest-details-section guest-details-secondary']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();
	    
       
        //Extras
        
        try {
        Thread.sleep(10000);
	    driver.findElement(By.xpath("//div[contains (@class,'service-packages basic-services')]")).click();
	    Thread.sleep(5000);
        }
        catch(Exception e)
        {
        	System.out.println("vip is not selected");
        }
        
        
	    driver.findElement(By.xpath("//label[contains(text(),'No thanks, I’ll risk it')]")).click();
        driver.findElement(By.xpath("//div[@class='trip-protection-section position-relative']//a[@class='btn-effect btn-lg btn-payment-continue btn-block text-center'][normalize-space()='Continue']")).click();
	    driver.findElement(By.xpath("//button[@id='No_Tip']")).click();
	    
	    
	    //CC details
	    driver.findElement(By.xpath("//a[contains(@class,'payment-method payment-method-credit-card')]")).click();
	    driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("5555555555554444");
	    driver.findElement(By.xpath("//input[@id='MonthPaymentPage']")).sendKeys("05");
	    driver.findElement(By.xpath("//input[@id='YearPaymentPage']")).sendKeys("2026");
	    driver.findElement(By.xpath("//input[@id='CVV']")).sendKeys("123");
	    
	    driver.findElement(By.xpath("//button[@id='book-room']")).click();
	    System.out.println(driver.getTitle());
	    
	    		
	    
	    
	    //a[@class='payment-method payment-method-credit-card disable-btn active']
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
