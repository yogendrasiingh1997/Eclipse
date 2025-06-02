package Day_21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/* 1. launch browser
   2. open URL
   3. Validate title
   4.close browser
 */



public class First_test_case {

	public static void main(String[] args) throws InterruptedException {
		
		//1. launch browser
		
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://www.traveluro.com/");
		
		
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Hotel booking | Traveluro.com"))
		{
			System.out.println("Test is passes");
		
		}
		else
		{
			System.out.println("test is failed");
		}
		
		
		
		driver.quit();
		
		
		
		
				
	}

}
