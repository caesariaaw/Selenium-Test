package test;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.apache.http.util.Asserts;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class SeleniumModularOrangeHRM {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumModularOrangeHRM test = new SeleniumModularOrangeHRM();
		test.setBrowser("Chrome");
		test.setBrowserConfig();
		test.verifyTitle();
		test.Login();
		test.clickAdmin();
		test.LogOut();
	}

	public void setBrowser(String browser) {
		this.browser = browser;

	}

	public void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");

		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test

	public void verifyTitle() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		String title = driver.getTitle();
		String Str = new String(title);
		System.out.println(title);

		System.out.print("String Length :");
		System.out.println(Str.length());

		driver.get("https://opensource-demo.orangehrmlive.com/");
		String expectedTitle = "OrangeHRM";
		String actualTitle = "";
		actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Assert passed");

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Assert passed");
		} else {
			System.out.println("Assert failed");
		}
	}

	@Test
	public void Login() {
		WebElement inputUname = driver.findElement(By.id("txtUsername"));
		inputUname.sendKeys("Admin");

		WebElement inputPass = driver.findElement(By.id("txtPassword"));
		inputPass.sendKeys("admin123");

		WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
		buttonLogin.click();

	}

	public void clickAdmin() {
		WebElement buttonAdmin = driver.findElement(By.xpath("//b[.='Admin']"));
		buttonAdmin.click();

		String url = driver.getCurrentUrl();
		String expResult = url;
		String actResult = "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		Assert.assertEquals(actResult, expResult);

	}

	public void LogOut() {
		WebElement buttonWelcome = driver.findElement(By.id("welcome"));
		buttonWelcome.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement buttonLogOut = driver.findElement(By.xpath("//a[.='Logout']"));
		buttonLogOut.click();

	}

}
