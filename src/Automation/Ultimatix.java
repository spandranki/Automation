package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ultimatix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.ultimatix.net");				//launch page  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		WebElement username = driver.findElement(By.id("form1"));
		username.sendKeys("984789");
		
		WebElement proceed= driver.findElement(By.id("proceed-button"));
		proceed.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password-login\"]"));
		password.sendKeys("Certain@82");
		
		WebElement submit = driver.findElement(By.id("form-submit"));
		submit.click();
		
		
		
		
	}

}
