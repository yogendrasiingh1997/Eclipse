package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Automation {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.traveluro.com/");

	}

}
