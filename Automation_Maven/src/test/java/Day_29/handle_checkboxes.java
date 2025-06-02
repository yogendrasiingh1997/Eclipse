package Day_29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_checkboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 
	     
	     
	     driver.navigate().to("https://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();

	     //select specific checkbox
	     //driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
	    
	     //select all checkboxes
	     
	    
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	     
	    /* for(int i=0;i<checkboxes.size();i++)
	     {
	    	 checkboxes.get(i).click();
	     }
	   */
		
		  /*  
		   for(WebElement checkbox:checkboxes)
		     {
		    	 checkbox.click();
		     }
		  */
		  
		
		//last 3 check box
		
		for (int i = 0; i <= checkboxes.size(); i++) 
		{
		    if (i >= checkboxes.size() - 3 && i <= checkboxes.size()) 
		    {
		        checkboxes.get(i).click();
		    }
		}
	   
		
	   
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
