package googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import googlePages.GoogleHomePage;

public class GoogleBaseTest {
	private static GoogleBaseTest testBaseTest;
	WebDriver driver;
	GoogleHomePage homePage;
	
	
	private GoogleBaseTest() {
		
	}
	
	public static GoogleBaseTest getInstance() {
		if (testBaseTest == null) 
			testBaseTest = new GoogleBaseTest();
			return testBaseTest;
			
	}
	
	
	public void getBrowser(String driverValue) {
		if (driverValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Arif\\eclipse project\\GoogleTest.TestNg\\Browser\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}else if (driverValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Arif\\eclipse project\\GoogleTest.TestNg\\Browser\\geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
		
		
	}
	
	public GoogleHomePage getHomePage() {
		if (homePage == null) 
			homePage = new GoogleHomePage(driver);
		return homePage;
		
	}
	
	public void close() {
		if (driver != null) 
			driver.close();
		
	}
	
	
	
	
	
	
	
	
	

}
