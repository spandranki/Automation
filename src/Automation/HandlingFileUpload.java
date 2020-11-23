package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;

public class HandlingFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.smallpdf.com/pdf-to-word");
		driver.manage().window().fullscreen();
		
		//WebElement chooseFile = 
				driver.findElement(By.xpath("//*[@id=\"__picker-input\"]")).sendKeys("C:\\Users\\sameera\\Downloads\\Fido-Jan27_2020.pdf");
	//	driver.findElement(By.name("Scanned pages will appear as images.")).click();
		//driver.findElement(By.id("__rk0")).click();		(//div[@class='__-zhab'])
			
	//		WebElement radio = 	driver.findElement(By.cssSelector("#__-zhab"));
						
			WebElement radio = 	driver.findElement(By.cssSelector("#sc-18us72i-0 cnzToN"));	
			radio.click();
	}

}
