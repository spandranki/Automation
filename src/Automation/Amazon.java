package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.amazon.ca");				//launch page  
		driver.manage().window().maximize();
		
		WebElement cam = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container'][1]"));
		cam.click();
		
		WebElement item = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[1]"));
		item.click();
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	//	Alert alert = driver.switchTo().alert();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				
		
		for (String winhandle: driver.getWindowHandles()) {
		    driver.switchTo().window(winhandle);
		    System.out.println("Window Switch");        
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//*[@id=\"a-popover-8\"]/div/header/button")).click();
		}
		
		
		

	//	alert.dismiss();
		
	//	WebElement close = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-close')"));
	//	close.click();
		
		//WebElement Nothanks = driver.findElement(By.xpath(" //button[@data-action='a-popover-close']"));
		//Nothanks.click();
		
		//WebElement Nothank = driver.findElement(By.id("siNoCoverage-announce"));
		//Nothank.click();
		
		
	/*	WebElement cvrg = driver.findElement(By.xpath("(//*span/[contains(text(),'No Thanks'])"));
		if (cvrg.isDisplayed()) 
		{
			cvrg.click();
		}
		  */
	//	WebElement cvrg = driver.findElement(By.xpath("(//button[@id='siNoCoverage-announce']"));
	//	cvrg.click();
	
	//	WebElement cvrg = driver.findElement(By.className("a-button-close a-declarative"));
		
		
		
		
		
		
	}

}
