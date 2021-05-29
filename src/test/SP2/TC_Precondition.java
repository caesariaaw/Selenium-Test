package test.SP2;

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



public class TC_Precondition extends Main {

	public static void NavigateToURL() {
		System.out.println("========Navigate To URL========");
		String url = "http://128.199.90.160/en/";
		driver.get(url);
		String title = driver.getTitle();
		String Str = new String(title);
		System.out.println("You are on " + title + " Website. Welcome!");

		System.out.print("String Length :");
		System.out.println(Str.length());

		driver.get("http://128.199.90.160/en/");
		String expectedTitle = "QA";
		String actualTitle = "";
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("You are on the right website!");
		} else {
			System.out.println("Sorry something went wrong.");
		}
	}

}
