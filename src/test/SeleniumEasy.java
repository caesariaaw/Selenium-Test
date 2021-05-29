package test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEasy {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumEasy test = new SeleniumEasy();
		test.setBrowser("Firefox");
		test.setBrowserConfig();
		test.JQuery();
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
	private void JQuery() {
		
		driver.manage().window().maximize();

		String url = "https://www.seleniumeasy.com/test/";

		driver.get(url);
		String title = driver.getTitle(); String Str = new String(title);
		System.out.println(title);
		  
		System.out.print("String Length :" ); System.out.println(Str.length());
		  
		String Url = driver.getCurrentUrl(); 
		String expResult = url; 
		String actResult = "https://www.seleniumeasy.com/test/"; 
		Assert.assertEquals(actResult, expResult);
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement buttonXPopUp = driver.findElement(By.id("at-cv-lightbox-close"));
		if (buttonXPopUp.isDisplayed() && buttonXPopUp.isEnabled()) {
			buttonXPopUp.click();
		}else {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		WebElement progressBar = driver.findElement(By.linkText("Progress Bars"));
		progressBar.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement buttonDownloadProgressBar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[2]/li[1]/ul/li[1]/a"));
		buttonDownloadProgressBar.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		WebElement buttonDownload = driver.findElement(By.id("downloadButton"));
		buttonDownload.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement downloadProgress = driver.findElement(By.className("progress-label"));
		String actText = downloadProgress.getText();
		String expText = "Complete!";
		Assert.assertEquals(actText, expText);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement buttonClose = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button"));
		buttonClose.click();
		
		driver.quit();
	}
}
