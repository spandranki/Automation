package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;


public class Walmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.manage().window().maximize();
		driver.get("https://www.walmart.ca/en");				//launch page  
		
	//	WebElement nav = driver.findElement(By.xpath("//*[@id=\"mobile-hamburger-button\"]/svg"));
	//	nav.click();
		
		WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a"));
		signin.click();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"login-form-email\"]"));
		username.sendKeys("arunsai1436@gmail.com");
		
	//	WebElement pwd = driver.findElement(By.xpath("(//input[contain(text(),'password')])"));
		WebElement pwd = driver.findElement(By.xpath("//*[@id=\"sign-in-page-form-wrap\"]/div[1]/section[3]/form/fieldset/label[3]/input"));
		pwd.sendKeys("Tata@1234");
		
		WebElement sign = driver.findElement(By.xpath("//*[@id=\"account-signin-btn\"]"));
		sign.click();
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
