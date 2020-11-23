package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//MOUSE MOVEMENTS WILL BE HANDLED BY "ACTIONS" CLASS

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		
		Actions action = new Actions(driver); //We import interactions library from selenium to handle mousehover capabilities on webelements
		action.moveToElement(driver.findElement(By.id("header-addons"))).build().perform();
		
		Thread.sleep(2000);// we give this command to ensure the outcome of the previous step is achieved and the elements-
		//-are loaded on the page for the next action to invoke.
		driver.findElement(By.linkText("Visa Services")).click();
		
		
		
		//driver.findElement(By.id("header-addons")).click();
		
		

	}

}
