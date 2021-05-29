package test.SP2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;


public class TC_01 extends Main{
	
	

	public static void SignUp() {
		System.out.println();
		System.out.println("========Sign Up========");
		System.out.println();
		
		WebElement buttonSignIn = driver.findElement(By.className("hide_xs"));
		buttonSignIn.click();
		
		String rand1 =  RandomStringUtils.randomAlphabetic(5);
		WebElement inputEmail = driver.findElement(By.id("email_create"));
		inputEmail.sendKeys(rand1 + "@mailnesia.com");
		String expectedText =  inputEmail.getAttribute("value");
		System.out.println("You just entered an email : " + expectedText);
		
				
		WebElement buttonCreate = driver.findElement(By.id("SubmitCreate"));
		buttonCreate.click();
		
		

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement buttonCheckGender = driver.findElement(By.id("id_gender2"));
		buttonCheckGender.click();
		
		WebElement inputFirstName = driver.findElement(By.id("customer_firstname"));
		inputFirstName.sendKeys("xxx");
		
		WebElement inputLastName = driver.findElement(By.id("customer_lastname"));
		inputLastName.sendKeys("xyz");
		
		WebElement inputEmail1 = driver.findElement(By.id("email"));
		String actualText =  inputEmail1.getAttribute("value");
		System.out.println("This is automatically texted : " + expectedText);
		
		Assert.assertEquals(expectedText, actualText);
		
		System.out.println("Email match!");
		
		WebElement inputPass = driver.findElement(By.id("passwd"));
		inputPass.sendKeys("12345678");
		
		Select inputDay = new Select(driver.findElement(By.id("days")));
		inputDay.selectByValue("10");
		
		Select inputMonth = new Select(driver.findElement(By.id("months")));
		inputMonth.selectByValue("5");
				
		
		Select inputYear = new Select(driver.findElement(By.id("years")));
		inputYear.selectByValue("1999");
		
		
		WebElement buttonReg = driver.findElement(By.xpath("//span[contains(.,'Register')]"));
		buttonReg.click();
		
		String Url = driver.getCurrentUrl(); 
		System.out.println("SignUp Success!");
		
	}
}
