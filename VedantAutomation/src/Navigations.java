import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\VedantAutomation\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		
		driver.navigate().to("http://amzon.com");
		
		// this concept call back and forward simulation
		driver.navigate().back(); // navigate back to the Google page
		Thread.sleep(2000);
		
		driver.navigate().forward(); // navigate back to the Amazon site
		Thread.sleep(2000);
		
		driver.navigate().back(); // back to Google page
		
		driver.navigate().to("http://www.yahoo.com"); // navigate back to the Yahoo page.
		
		driver.navigate().back(); // back to the google page
		
		driver.navigate().refresh(); // page will be refresh
		
		driver.quit();
		
	

	}

}
