import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// YouTube Link: https://www.youtube.com/watch?v=PUanHXTSlR8&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=10

public class AlertPopupWindow {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC User1\\git\\VedantAutomation\\VedantAutomation\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		
		
		driver.close();
	}

}
