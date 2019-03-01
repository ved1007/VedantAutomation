import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\VedantAutomation\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		 
		driver.get("https://www.google.com/");
		
		//take screenshot and store as a file format
		// we can take a screenshot by getscreenshotAs method
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screenshot to desired location using copyFile //method
		//where do you want to store your screenshot \\ in C: driver for src folder
		FileUtils.copyFile(src, new File ("C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\VedantAutomation\\src\\google.png"));
		
		driver.quit();
		
	}

}
