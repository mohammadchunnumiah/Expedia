package mavPrac;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redfin {

	
	@Test
	public void homeSearch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Miah\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://redfin.com");
		
		
		Thread.sleep(200);
		driver.quit();

	}

}
