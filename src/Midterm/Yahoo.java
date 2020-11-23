package Midterm;
import java.awt.List;

import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class


public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");				//launch page  
		
		WebElement fname = driver.findElement(By.id("usernamereg-firstName"));
		fname.sendKeys("Sameera");
		
		WebElement lname = driver.findElement(By.id("usernamereg-lastName"));
		lname.sendKeys("Pandranki");
		
		WebElement email = driver.findElement(By.name("yid"));
		email.click();
		
	java.util.List<WebElement> suggestion = driver.findElements(By.className("desktop-suggestion-list"));
		
		System.out.println(suggestion);
		
		for (WebElement suggest : suggestion) {
			
			if(suggest.getText().equals("spandranki")) {
				suggest.click();
				
			}
			
		}
		
		
		WebElement pwd = driver.findElement(By.id("usernamereg-password"));
		pwd.sendKeys("Hasini@76");
		
		WebElement phone  = driver.findElement(By.id("usernamereg-phone"));
		phone.sendKeys("4389298273");
		
		WebElement birthmonth = driver.findElement(By.id("usernamereg-month"));
		birthmonth.sendKeys("September");
		
		WebElement day = driver.findElement(By.id("usernamereg-day"));
		day.sendKeys("18");
		
		WebElement year = driver.findElement(By.id("usernamereg-year"));
		year.sendKeys("1994");
		
		WebElement gender = driver.findElement(By.name("freeformGender"));
		gender.sendKeys("Female");
		
	//	WebElement fwd = driver.findElement(By.id("reg-submit-button"));
	//	fwd.click();
		

	}

}
