import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC User1\\git\\VedantAutomation\\VedantAutomation\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Create Actions object
		Actions action = new Actions(driver);
		
		//moveToElement is for hover over mouse functionality 
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(2000);
		
		//hover over and select value from the list
		driver.findElement(By.linkText("Seat + Meal Combo")).click();
		
		// 2 time hover over
		
		// 1st hover over
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform(); 
		Thread.sleep(3000);
		
		// 2nd hover over
		action.moveToElement(driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[14]/ul/li[2]/a"))).build().perform();
		Thread.sleep(2000);
		
		//3rd hover over
		driver.findElement(By.linkText("Sign up")).click();
		
		
		// selection value from drop down
		//populate the Title field
		Select select = new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
		select.selectByVisibleText("MS");
		
		//populate the First Name field
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys("Siya");
		
		// populate the Last Name field
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("Sain");
		
		// Populate the Country field
//		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListCountry"));
	//	select.selectByVisibleText("Canada");
	
		//Populate the Mobile# field
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstPhone")).sendKeys("1234567789");
		//Populate the Email address field
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys("Vtest@gmail.com");
		
		//Populate the card number
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXPANCARD")).sendKeys("0123456789");
		
		//Populate the Date of birth field
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBDay")).click();
		select.selectByVisibleText("5");
		
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBMonth"));
		select.selectByVisibleText("JAN");
		
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBYear"));
		select.selectByVisibleText("1983");
		
		
		// select the Agree checkbook
		
		
		
		
	//	driver.quit();

	}

}
