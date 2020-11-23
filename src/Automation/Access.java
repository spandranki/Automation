package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;	


public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.access-research.com");				//launch page  
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.name("Login"));
		login.click();
		
		WebElement username = driver.findElement(By.name("logon"));
		username.sendKeys("45T");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("Hasini@76");
		
		WebElement proceed = driver.findElement(By.cssSelector("#content > form > table > tbody > tr > td:nth-child(3) > table > tbody > tr:nth-child(2) > td > table > tbody > tr:nth-child(3) > td > input[type=submit]"));
		proceed.click();
	
		//WebElement password = driver.findElement(By.xpath("//input[@type ='password'])"));
		
		//driver.close();
		
		
	/*	WebElement password = driver.findElement(By.cssSelector("#password-login"));
		password.sendKeys("Certain@82");
		
		
		WebElement submit = driver.findElement(By.id("form-submit"));
		submit.click();
		
		driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);
		
		*/

		
		WebElement text = driver.findElement(By.xpath("//h4[contains(text(), 'Employee Service Center')]"));
		String s1 = text.getText();
		System.out.println(s1);
		
		if(s1.equals("Employee Service Center")) {
			
		 System.out.println("test passed");
			
		}
		
		else {
			
			System.out.println("test failed");
			
		}
		
	}

}
