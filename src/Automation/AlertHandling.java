package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement go = driver.findElement(By.name("proceed"));
		go.click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		String text=a.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("True");
		}
	
		//driver.quit();
		
		
		
		//alert.accept();
		a.accept();
		
		
		
		

	}

}
