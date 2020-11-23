package Automation;

//To import webdriver class
import org.openqa.selenium.WebDriver;
//To import Chromedriver class
import org.openqa.selenium.chrome.ChromeDriver;
//To import webelement class
import org.openqa.selenium.WebElement;
//To import By class which selects the locator type
import org.openqa.selenium.By;

public class Clasfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//Create a new browser object
			WebDriver driver= new ChromeDriver();
			//launch page
			driver.get("http://www.amazon.ca");
			driver.manage().window().maximize();
			
			WebElement sitesearcher = driver.findElement(By.id("twotabsearchtextbox"));
			sitesearcher.sendKeys("shoes");
			
			//sitesearcher.click();
			
			WebElement sitesearchers = driver.findElement(By.className("nav-input"));
			sitesearchers.click();
			
			WebElement searchsubmit = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
			searchsubmit.click();
			
			WebElement cart = driver.findElement(By.id("add-to-cart-button"));
			cart.click();
			
			WebElement checkout =  driver.findElement(By.id("hlb-ptc-btn-native"));
			
			//WebElement checkout =  driver.findElement(By.linkText("Proceed to checkout (1 item)"));
			
			checkout.click();
			
			WebElement enterEmail = driver.findElement(By.id("ap_email"));
			enterEmail.sendKeys("sameera.pandranki76@gmail.com");
			
			
			
			WebElement continueClick = driver.findElement(By.className("a-button-input"));
			continueClick.click();
			
			WebElement enterPassword = driver.findElement(By.id("ap_password"));
			enterPassword.sendKeys("Hasini@76");
			
			WebElement clickSignin = driver.findElement(By.id("signInSubmit"));
			clickSignin.click();
			
			WebElement radio = driver.findElement(By.xpath("(//span//[contains text(),'Text a One Time Password (OTP) to +1********96'])"));
			radio.click();
			
			WebElement clickContinue = driver.findElement(By.className("a-button-input"));
			clickContinue.click();
		
		
			
		//	WebElement name = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][2]"));
			//name.click();
		}

	}




