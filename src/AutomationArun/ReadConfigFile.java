package AutomationArun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;


public class ReadConfigFile {
	
	static WebDriver driver;
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties propObject = new Properties();
		
		FileInputStream fileObject = new FileInputStream("C:\\Users\\sameera\\eclipse-workspace\\Automation\\src\\AutomationArun\\config.properties");
		
		
		propObject.load(fileObject);
		
		System.out.println(propObject.getProperty("firstname"));
		
		if(propObject.getProperty("sameera").equals("anrun"))
			{

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sameera\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();									
			}
		
		else if(propObject.get("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
				
		}
		driver.get(propObject.getProperty("url"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(propObject.getProperty("firstname_xpath"))).sendKeys(propObject.getProperty("fname"));
		

	}

}
