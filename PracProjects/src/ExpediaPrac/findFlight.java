/**
 * 
 */
package ExpediaPrac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

/**
 * @author Miah
 *
 */
public class findFlight {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Develop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.expedia.com/");
		Thread.sleep(2000);

	
		//driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys("JFK");
		
		
		//driver.close();

	}

}
