import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HowToReadProperties {

	public static void main(String[] args) throws IOException {
		
		//Create an object for properties
		Properties prop = new Properties();
			 
		FileInputStream ip = new FileInputStream("C:\\Users\\PC User1\\git\\VedantAutomation\\"
				+ "VedantAutomation\\config.properties");
		
		prop.load(ip);
		
		System.out.print(prop.get("browser"));
		

	}


}