package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_07 extends Main {
	
	public static void VerifyCodeBook() throws InterruptedException {
		
		System.out.println();
		System.out.println("=========Verify Reference Code========");
		System.out.println();
		
		
		
		WebElement OrderReference = driver.findElement(By.className("bold"));
		String ExpORfc = OrderReference.getText();
		System.out.println("Your Order Reference is : " +ExpORfc);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='account_user_name hide_xs']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Orders']"))).click();
		
	
	
		WebElement OrderRef = driver.findElement(By.className("color-myaccount"));
		String ActORfc = OrderRef.getText();
		System.out.println("Order Reference Texted : " +ActORfc);
		
		if (ActORfc.contentEquals(ExpORfc)) {
			System.out.println("Order Reference Found!");
		}else {
			System.out.println("Order Reference Not Found!");
		}
			
	}

}
