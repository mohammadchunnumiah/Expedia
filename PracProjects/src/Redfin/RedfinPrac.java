package Redfin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedfinPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Develop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://redfin.com");
		driver.findElement(By.cssSelector("#search-box-inputh")).sendKeys("11416");
		driver.findElement(By.cssSelector(
				"#homepageTabContainer > div > div.TabsContents > div.content.current > div > div > div > form > div.search-container.inline-block > button"))
				.click();

		driver.findElement(By.cssSelector(
				"#homepageTabContainer > div > div.TabsContents > div.content.current > div > div > div > form > div.search-container.inline-block > button"))
				.click();
	}

}
