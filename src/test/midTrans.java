package test;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.awt.Dimension;
import java.awt.Window;
import java.time.Duration;
import java.util.List;

public class midTrans {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		midTrans test = new midTrans();
		test.setBrowser("Firefox");
		test.setBrowserConfig();
		test.CreditPayment();
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

	
	private void CreditPayment() {
		
		driver.manage().window().maximize();

		String url = "https://demo.midtrans.com/";

		driver.get(url);

		WebElement buttonBuyNow = driver.findElement(By.xpath("//a[.='BUY NOW']"));
		buttonBuyNow.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement buttonCheckOut = driver.findElement(By.xpath("//div[@class='cart-checkout']"));
		buttonCheckOut.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement buttonContinue = driver.findElement(By.xpath("//a[.='Continue']"));
		buttonContinue.click();
//		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement buttonCredit = driver.findElement(By.xpath("//div[.='Credit/Debit Card']"));
		buttonCredit.click();
//		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement inputCCNumber = driver
				.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[1]/input"));
		inputCCNumber.click();
		inputCCNumber.clear();
		inputCCNumber.sendKeys("4811 1111 1111 1114");

		WebElement inputExpDate = driver.findElement(By.xpath("//div[@class='input-group col-xs-7']/input[1]"));
		inputExpDate.sendKeys("0125");

		WebElement inputCVV = driver.findElement(By.xpath("//div[@class='input-group col-xs-5']/input[1]"));
		inputCVV.sendKeys("123");

		WebElement buttonPayNow = driver.findElement(By.xpath("//a[.='Pay Now']"));
		buttonPayNow.click();

		List<WebElement> iframeElements1 = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements1.size());

		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement inputOTP = driver.findElement(By.xpath("//*[@id=\"PaRes\"]"));
		inputOTP.sendKeys("112233");

		WebElement buttonOK = driver.findElement(By.xpath("//*[@id=\"acsForm\"]/div[6]/div/button[1]"));
		buttonOK.click();

//		WebElement buttonDone = driver.findElement(By.cssSelector(".button-main-content"));
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
