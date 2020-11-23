package AutomationArun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("http://www.popuptest.com/");				//launch page  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
		
		Set<String> object = driver.getWindowHandles();
		
		Iterator<String> it = object.iterator();
		
		String parentWindow = it.next();
		System.out.println("parent window id is:" +parentWindow);
		Thread.sleep(1000);
		
		String childWindow1= it.next();
		System.out.println("child window id is :" +childWindow1);
		Thread.sleep(3000);
		
		driver.switchTo().window(childWindow1);
		
		Thread.sleep(3000);
		
		
		String childWindow2= it.next();
		System.out.println("child window id is :" +childWindow2);
		driver.switchTo().window(childWindow2);
		
		System.out.println("child window title is :"+ driver.getTitle());
		
		driver.close();
		
	
		
		


	}

}
