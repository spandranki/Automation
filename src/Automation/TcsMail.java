package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TcsMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://myapp.tcs.com");				//launch page  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		WebElement username = driver.findElement(By.id("Enter user name"));
		username.sendKeys("984789");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Certain@82");
		
		WebElement login = driver.findElement(By.id("Log_On"));
		login.click();
		
		
		
		
		
	}

}
