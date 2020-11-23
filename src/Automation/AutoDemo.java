
package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class
import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;

public class AutoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.facebook.com");				//launch page  
		driver.manage().window().maximize();
		
		//enter details
		
		WebElement Fname = driver.findElement(By.name("firstname"));
		Fname.sendKeys("Sami");
		WebElement Lname = driver.findElement(By.name("lastname"));
		Lname.sendKeys("Arun");
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("sameera.pandranki1@outlook.com");
		WebElement reentermail = driver.findElement(By.id("u_0_u"));
		reentermail.sendKeys("sameera.pandranki1@outlook.com");
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("Arun@123");
		WebElement month = driver.findElement(By.name("birthday_month"));
		month.sendKeys("Sep");
		WebElement day = driver.findElement(By.name("birthday_day"));
		day.sendKeys("18");
		WebElement year = driver.findElement(By.name("birthday_year"));
		year.sendKeys("1994");
		WebElement gender = driver.findElement(By.id("u_0_6"));
		gender.click();
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
		
		driver.get("https://outlook.live.com/owa/");				//launch page  
		driver.manage().window().maximize();
		//WebElement signin = driver.findElement(By.xpath("//[@href='./?nlp=1']"));
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		//WebElement signin = driver.findElement(By.className("internal sign-in-link"));
		signin.click();
		WebElement emailid = driver.findElement(By.name("loginfmt"));
		emailid.sendKeys("sameera.pandranki1@outlook.com");
		WebElement next = driver.findElement(By.xpath("(//[@class='btn btn-block btn-primary'])"));
		next.click();
		
	//	Select next = (Select) driver.findElement(By.id("idSIButton9"));
	//	next.selectByValue("Next");
		WebElement epwd = driver.findElement(By.xpath("(//*[@id=\"i0118\"])"));
		epwd.sendKeys("Hasini@76");	
		WebElement mailsubmit = driver.findElement(By.id("idSIButton9"));
		mailsubmit.click();
		
		
		
	}

}
