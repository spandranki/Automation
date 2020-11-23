package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testZeroBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			  
			  WebDriver driver;
				
			  
				  
				  //launching chrome
				  
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
					 driver = new ChromeDriver();
					 driver.get("http://zero.webappsecurity.com/");
					 
				 		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])")).click();
				 	
				 		String actualTitle = driver.getTitle();
				 		System.out.println(actualTitle);
				 		String expectedTitle = "Zero - Personal Banking - Loans - Credit Cards";
				 		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				 			
			  }
			  

	
}
