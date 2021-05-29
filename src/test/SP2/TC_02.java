package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_02 extends Main {
	public static void SignIn() {
		System.out.println();
		System.out.println("========Sign In========");
		System.out.println();

		WebElement buttonSignIn = driver.findElement(By.className("hide_xs"));
		buttonSignIn.click();

		WebElement inputEmailReg = driver.findElement(By.id("email"));
		inputEmailReg.sendKeys("111@mailnesia.com");

		WebElement inputPW = driver.findElement(By.id("passwd"));
		inputPW.sendKeys("12345678");

		WebElement buttonSignIn1 = driver.findElement(By.xpath("//button[@id='SubmitLogin']/span[contains(.,'Sign in')]"));
		buttonSignIn1.click();
		
		WebElement buttonLogo = driver.findElement(By.xpath("//img[@alt='QA']"));
		buttonLogo.click();
		
		System.out.println("Welcome Back!");
		
		WebElement pressBack = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		pressBack.click();
		
	}
}