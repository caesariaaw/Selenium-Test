package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTestingChrome {
	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String expectedTitle = "OrangeHRM";
		String actualTitle = "";

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
	}
}
