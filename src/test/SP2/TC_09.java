package test.SP2;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_09 extends Main{

	public static void SignUpNegative() {
		System.out.println();
		System.out.println("========Negative Sign Up========");
		System.out.println();
		
		WebElement buttonSignIn = driver.findElement(By.className("hide_xs"));
		buttonSignIn.click();
		
		String rand1 =  RandomStringUtils.randomAlphabetic(5);
		WebElement inputEmail = driver.findElement(By.id("email_create"));
		inputEmail.sendKeys(rand1 + "@mailnesia.com");
						
		WebElement buttonCreate = driver.findElement(By.id("SubmitCreate"));
		buttonCreate.click();
		
		

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement buttonCheckGender1 = driver.findElement(By.id("id_gender2"));
		buttonCheckGender1.click();
		
		WebElement inputLastName1 = driver.findElement(By.id("customer_lastname"));
		inputLastName1.sendKeys("xyz");
				
		WebElement buttonReg1 = driver.findElement(By.xpath("//span[contains(.,'Register')]"));
		buttonReg1.click();
		
		String ErrorMessage1 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ol > li"))).getText();
		System.out.println(ErrorMessage1);
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement buttonCheckGender2 = driver.findElement(By.id("id_gender2"));
		buttonCheckGender2.click();
		
		WebElement inputFirstName2 = driver.findElement(By.id("customer_firstname"));
		inputFirstName2.sendKeys("xxx");
		
		WebElement inputLastName2 = driver.findElement(By.id("customer_lastname"));
		inputLastName2.sendKeys("xyz");
		
		WebElement buttonReg2 = driver.findElement(By.xpath("//span[contains(.,'Register')]"));
		buttonReg2.click();
		String ErrorMessage2 = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ol > li"))).getText();
		System.out.println(ErrorMessage2);
		
		System.out.println("Create account failed.");
		
		System.out.println();
	}
}