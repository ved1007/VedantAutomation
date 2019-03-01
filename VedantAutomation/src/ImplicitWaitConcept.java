import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\VedantAutomation\\src\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies
		
		driver.get("https://half.ebay.com");
		
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // this wait 40 seconds
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // this wait is for all the elements within the page
		
		
		
		
	}

}
