/**
 * 
 */
package mavPageObjectFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Miah
 *
 */
public class ebayLoginPage {

	By signinClick = By.xpath(".//*[@id='gh-ug']/a");
	By staysigninClick = By.id("csi");
	By username = By.id("#523357128");
	By password = By.xpath(".//*[@id='1748810576']");
	By signinButtonClick = By.name("sgnBt");

	// reference variable WebDriver
	WebDriver driver;

	// Create constructor
	public ebayLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginToEbay(String userid, String pass) {
		driver.findElement(signinClick).click();
		driver.findElement(staysigninClick).click();
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signinButtonClick).click();

	}

	// create methods
	public void clickOnSignin() {
		driver.findElement(signinClick).click();
	}

	public void clickOnStaySingIn() {
		driver.findElement(staysigninClick).click();
	}

	public void typeUserName() {
		driver.findElement(username).sendKeys("mcmiahus@gmail.com");
	}

	public void typePassword() {
		driver.findElement(password).sendKeys("miah123");
	}

	public void clickOnSigninButton() {
		driver.findElement(signinButtonClick).click();
	}

}
