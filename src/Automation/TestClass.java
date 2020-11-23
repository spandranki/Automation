package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.iga.net/en");				//launch page  
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
	//	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='shepherd-button shepherd-button-close'])")));
	
		List <WebElement> obj =driver.findElements(By.tagName("a")); // to find no of web elements
				System.out.println(obj.size());
				
				
				for(int i=0;i<obj.size();i++) //to print the elements i.e links here
				{
					System.out.println(obj.get(i).getText());
				}
				
		WebElement pop = driver.findElement(By.xpath("(//a[@class='shepherd-button shepherd-button-close'])"));
		pop.click();
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"header_0_SearchBox_TxtSearchKeywords\"]"));
		search.sendKeys("Butter");
		
		WebElement sclick = driver.findElement(By.xpath("//*[@id=\"header_0_SearchBox_BtnSearch\"]"));
		sclick.click();
		
		WebElement sort = driver.findElement(By.xpath("//*[@id=\"body_0_main_1_GrocerySearch_TemplateResult_SetSortOrder\"]"));
		sort.sendKeys("Best value");
		
		WebElement cookies = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button"));
		cookies.click();
	//	Thread.sleep(500);
		
		
		//WebElement viewproduct = driver.findElement(By.xpath("//*[@id=\"body_0_main_1_GrocerySearch_TemplateResult_SearchResultListView_ctrl0_ctl00_1_ProductImage_1\"]"));
			//viewproduct.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Salted Butter')]")).click(); // customised xpath using contains
		
		
	//	driver.findElement(By.xpath("//a[starts-with(aria-label,'Salted')]")).click();
		
		WebElement addtocart = driver.findElement(By.xpath("(//button[@class='btn  btn--dark  btn--full-width  relative'])"));
		addtocart.click();
		
	}

}
