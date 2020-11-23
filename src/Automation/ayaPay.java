package Automation;
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.WebElement;			
import org.openqa.selenium.chrome.ChromeDriver;		
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;						
import org.openqa.selenium.support.ui.Select;



public class ayaPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			 
		
		driver.get("https://ayapayments.com");				
		driver.manage().window().maximize();
		
		
	}

}
