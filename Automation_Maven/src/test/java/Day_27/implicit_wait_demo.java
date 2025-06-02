package Day_27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
        driver.get("https://www.traveluro.com/");
       
        driver.manage().window().maximize();
        
        
     
        driver.findElement(By.xpath("//*[@id=\"refTopDestination\"]/div/div[3]/div[2]")).click();
  
	}

}
