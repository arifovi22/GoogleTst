package googleTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class GoogleSearchTest {
	GoogleBaseTest baseTest;
	
	
	@Parameters({"driverValue"})
	@BeforeTest
	public void init(String driverValue ) {
		baseTest = GoogleBaseTest.getInstance();
		baseTest.getBrowser(driverValue);
		baseTest.getHomePage()
		.url("https://www.google.com/");
		
	}
	@Parameters({"searchValue"})
	@Test
	public void search(String searchValue) {
		baseTest.getHomePage().searchElement(searchValue);
		baseTest.close();
	}
	
	
	
	
	
	

}
