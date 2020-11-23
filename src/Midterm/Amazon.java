package Midterm;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca");				//launch page  
		
		WebElement bestseller = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		bestseller.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement electronics = driver.findElement(By.xpath("//a[@href='https://www.amazon.ca/Best-Sellers-Electronics/zgbs/electronics/ref=zg_bs_nav_0']"));
		electronics.click();
		
		WebElement item = driver.findElement(By.xpath("//div[contains(text(),'TP-Link WiFi Range Extender TL-WA850RE - Wireless Signal Booster, WiFi Extender, N300…')]"));
		item.click();
		
		WebElement addtocart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])"));
		addtocart.click();
		
		WebElement checkout = driver.findElement(By.xpath("(//a[@id='hlb-ptc-btn-native'])"));
		String actual = checkout.getText();
		//System.out.println(actual);
		String expeceted = "Proceed to checkout (1 item)";
		
		if(actual.equals(expeceted)) {
			
			System.out.println("text is verified and case is passed");
			
		}
		
		else {
			
			System.out.println("text is verified and case is failed ");
			
		}
		
		driver.findElement(By.xpath("(//button[@id='signin_button'])")).click();
		System.out.println(driver.getTitle());
		
	}

}
