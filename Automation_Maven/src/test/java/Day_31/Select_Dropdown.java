package Day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
	    
	    Select drpcountry=new Select (country);

	    //select option from the drop down
	    
	    //drpcountry.selectByVisibleText("Canada");
	    
	    //drpcountry.selectByValue("japan");
	    
	    
	  //  drpcountry.selectByIndex(2);
	    
	    
	    //capture the all option from dropdown
	    
	    List<WebElement> option=drpcountry.getOptions();
	    System.out.println(option.size());
	    
	    
	    //normal for loop
	    
	   /*  for(int i=0;i<option.size();i++)
	    {
	    	System.out.println(option.get(i).getText());
	    }
	    
	    */
	    
	    for(WebElement country_name:option)
	    {
	    	System.out.println(country_name.getText());
	    }
	    
	    
	    
	    
	    
	    
	}

}
