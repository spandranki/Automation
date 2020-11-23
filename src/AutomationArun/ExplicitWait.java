package AutomationArun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.iga.net/en");				//launch page  
		driver.manage().window().maximize();
		//Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@class='shepherd-button btn btn--light btn--full-width']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn--danger js-accept-cookie-policy']")).click();
		
		WebElement Myacc = driver.findElement(By.xpath("//a[@id='body_0_main_1_third_two_right3f6e7f9835e24866adf62e7428b8b4ad_0_GroceryListControl_GroceryItems_GroceryTemplate_0_NavigateTo_0']"));
		Click(driver , Myacc , 5);
		
		WebElement Searchbar= driver.findElement(By.xpath("//input[@name='header_0$SearchBox$TxtSearchKeywords']"));
		Sendinput(driver, Searchbar, 4, "Butter");

		Click(driver, driver.findElement(By.id("header_0_SearchBox_BtnSearch")), 2 ); //another way of calling the function(without creating any object like we did for above 2)
	}
	
	// we create static method(doesnt need any object to call them) to use explicit wait as below
	public static void Click(WebDriver driver, WebElement locator , int timeout ) //this method can be used for webelements that are clickable
	{
		
		new WebDriverWait(driver,timeout) //WebDriverWait is already present in the selenium library
		.until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
	
	}
	
	public static void Sendinput(WebDriver driver ,WebElement locator, int timeout, String input )  //this method can be used for webelements that can take input from user
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(input);
		
	}
	

}
