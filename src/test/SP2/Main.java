package test.SP2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Main test = new Main();
		test.setBrowser("Chrome");
		test.setBrowserConfig();
		TC_Precondition.NavigateToURL();
		TC_01.SignUp();
		TC_LogOut.SignOut();
		TC_02.SignIn();
		TC_Precondition3.BackToHome();
		TC_03.SearchHotel();
		TC_04.BookPayBank();
		TC_07.VerifyCodeBook();
		TC_08.VerifyPrice();
		TC_Precondition3.BackToHome();
		TC_03.SearchHotel();
		TC_05.BookPayCheck();
		TC_07.VerifyCodeBook();
		TC_08.VerifyPrice();
		TC_Precondition3.BackToHome();
		TC_06.SendTextOnContactMenu();
		TC_Precondition3.BackToHome();
		TC_LogOut.SignOut();
		TC_09.SignUpNegative();
		TC_Precondition3.BackToHome();
		TC_10.SearchHotelFailed();
		TC_Close.End();	
		TC_11.deleteAddress();
		TC_Close.End();

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

	
	
	

}
