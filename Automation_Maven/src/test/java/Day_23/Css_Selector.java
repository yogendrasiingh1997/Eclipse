package Day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  //shortcut ctrl+shift+O

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.traveluro.com/");
		driver.manage().window().maximize();
	
		
		//driver.findElement(By.cssSelector("#refTopDestination > div > div:nth-child(3) > div:nth-child(2) > div > a")).click();
		
		//tag id combination
		//driver.findElement(By.cssSelector("input#myInput")).sendKeys("las");		
		//driver.findElement(By.cssSelector("#myInput")).sendKeys("las");		
		
		
		//tag class  tag.classname
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("cali");
		
		
		//tag attributes  tag[attributes="value"]
		//driver.findElement(By.cssSelector("input[placeholder="Where to?"])).sendKeys("paris");
		
		//tag class attributes
		
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Where to?\"]")).sendKeys("cali");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
