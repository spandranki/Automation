package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;



public class SuggestHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");				//launch page  
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Sameera");
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement> sugg = driver.findElements(By.className("sbtc"));
		
		System.out.println(sugg.size());
					
		for (WebElement suggest : sugg) {
			
			if(suggest.getText().equals("sameera khan")) {
				
				suggest.click();
				
			}
			
		}
		
	}

}
