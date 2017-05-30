/**
 * 
 */
package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Miah
 *
 */
public class mainpage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
					System.setProperty("webdriver.firefox.marionett",
					"C:\\Users\\Miah\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();

//			Thread.sleep(3000);
			driver.get("https://www.expedia.com/");
			

		}

	}


