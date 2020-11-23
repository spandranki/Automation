package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FireFoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sameera\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		//	driver.manage().deleteAllCookies();
		
	//	Thread.sleep(300);
	
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("email::content")))).sendKeys("sameera.pandranki1@outlook.com");
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email::content")));
		
	//	WebElement email = driver.findElement(By.id("email::content"));
	//	email.sendKeys("sameera.pandranki1@outlook.com");
		driver.findElement(By.id("password::content")).sendKeys("Sam@1234");
		driver.findElement(By.id("retypePassword::content")).sendKeys("Sam@1234");
		
		driver.findElement(By.id("firstName::content")).sendKeys("Sam");
		driver.findElement(By.id("lastName::content")).sendKeys("Sam");
		driver.findElement(By.id("jobTitle::content")).sendKeys("QA analyst");
		driver.findElement(By.id("workPhone::content")).sendKeys("4389298796");
		driver.findElement(By.id("companyName::content")).sendKeys("Mcit");
		driver.findElement(By.id("address1::content")).sendKeys("1255");
		driver.findElement(By.id("city::content")).sendKeys("mtl");
		//driver.findElement(By.id("state::content")).sendKeys("Quebec");
		Select dropState = new Select(driver.findElement(By.id("state::content")));
		dropState.selectByVisibleText("Quebec");
		
		driver.findElement(By.id("postalCode::content")).sendKeys("h2d5g3");
		driver.findElement(By.id("subscription1::content")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]/div/form/span[1]/span/div[2]/table/tbody/tr/td/table/tbody/tr[30]/td[2]/div/a/span")).click();
		
		
	
	}

}
