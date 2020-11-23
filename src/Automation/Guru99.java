package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");				//launch page  
		
		Thread.sleep(3000);
		
		WebElement clickhere = driver.findElement(By.xpath("(//a[@href='../articles_popup.php'])"));
		clickhere.click();
		
		String winHandleBefore = driver.getWindowHandle();
		for (String winhandle: driver.getWindowHandles()) {
		    driver.switchTo().window(winhandle);
		    Thread.sleep(1000);

		}
		
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("sameera.pandranki7@gmail.com");
		
		WebElement submit = driver.findElement(By.name("btnLogin"));
		submit.click();
		
		// driver.close();
		
		driver.switchTo().window(winHandleBefore);
		


		
		
	}

}
