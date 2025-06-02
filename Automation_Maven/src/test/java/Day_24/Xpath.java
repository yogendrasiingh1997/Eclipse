package Day_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.traveluro.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"site-body\"]/app-root/app-cookie-banner/div/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"site-body\"]/app-root/app-footer/footer/div/div[1]/div[1]/div[3]/div/span/img")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
