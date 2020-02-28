package googlePages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleHomePage {
	WebDriver driver;
	
	
	
	
	
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void url(String url) {
		driver.get(url);
	}
	
	public void searchElement(String value) {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(value, Keys.ENTER);
	}
	
	
	
	

}
