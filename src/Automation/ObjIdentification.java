package Automation;
import org.openqa.selenium.WebDriver;			//to import web driver class
import org.openqa.selenium.WebElement;			//to import web element class
import org.openqa.selenium.chrome.ChromeDriver;		//to import chrome driver class
import org.openqa.selenium.By;						//to import by class which selects the locator type
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class ObjIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			//driver is the object here..u can use anything 
		
		driver.get("https://www.amazon.ca");				//launch page  
		driver.manage().window().maximize();
		
	/*	WebElement cam = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container'][1]"));
		cam.click();
		*/
		
		List<WebElement> elements = driver.findElements(By.xpath("//"));
		
		System.out.print(Integer.toString(elements.size()));
		
		for(WebElement el:elements) {
			
			System.out.println(el.getTagName() + ":" +el.getText());
			
		}
		
	}

	private static String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

}
