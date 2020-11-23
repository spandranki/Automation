package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;


public class FormFilling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.manage().window().maximize();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");				//launch page  
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email::content"));
		email.sendKeys("sameera.pandranki1@outlook.com");
		
		WebElement pwd = driver.findElement(By.id("password::content"));
		pwd.sendKeys("Hasini@76");
		
		WebElement retypepwd = driver.findElement(By.id("retypePassword::content"));
		retypepwd.sendKeys("Hasini@76");
		
		WebElement fname = driver.findElement(By.id("firstName::content"));
		fname.sendKeys("Sameera");
		
		WebElement lname = driver.findElement(By.id("lastName::content"));
		lname.sendKeys("Pandranki");
		
		WebElement job = driver.findElement(By.id("jobTitle::content"));
		job.sendKeys("Student");
		
		WebElement wphone = driver.findElement(By.id("workPhone::content"));
		wphone.sendKeys("4389298796");
		
		WebElement company = driver.findElement(By.id("companyName::content"));
		company.sendKeys("MCIT");
		
		WebElement address = driver.findElement(By.id("address1::content"));
		address.sendKeys("1255 Robert B Street");
		
		WebElement city = driver.findElement(By.id("city::content"));
		city.sendKeys("Montreal");
		
		WebElement province = driver.findElement(By.id("state::content"));
		province.sendKeys("Quebec");
		
		WebElement postalcode = driver.findElement(By.id("postalCode::content"));
		postalcode.sendKeys("H2X2C8");
		
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"cb1\"]/a/span"));
		signup.click();
		
		
		
	}

}
