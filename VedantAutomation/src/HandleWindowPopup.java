import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;



public class HandleWindowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC User1\\git\\VedantAutomation\\VedantAutomation\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		 
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		//What is Iterator
		Iterator<String> it = handler.iterator();
		
		 String paentWinodwID = it.next();
		System.out.println("pararent" + paentWinodwID);
		
		
		String childwindow = it.next();
		System.out.println("chaildwindowid" + childwindow);
		
		driver.switchTo().window(childwindow);
		
		System.out.println("Child Window Popup title" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(paentWinodwID);
		
		System.out.println("parent Window Popup title" + driver.getTitle());
		
		
		
	
		

	}

}
