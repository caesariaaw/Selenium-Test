package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_05 extends Main {
	public static void BookPayCheck() throws InterruptedException {
		System.out.println();
		System.out.println("========Pay with Check========");
		System.out.println();
		
		Thread.sleep(3000);

		WebElement buttonBookNow = driver.findElement(By.xpath("//div[@id='category_data_cont']/div[2]//span[.='Book Now']"));
		buttonBookNow.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement buttonProceedToCheckOut = driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]"));
		buttonProceedToCheckOut.click();

		try {
			WebElement subHeading = driver.findElement(By.className("page-subheading"));

			if (subHeading.isDisplayed()) {

				WebElement inputCompany = driver.findElement(By.id("company"));
				inputCompany.sendKeys("Home");

				WebElement inputAddress1 = driver.findElement(By.id("address1"));
				inputAddress1.sendKeys("Jakarta Selatan");

				WebElement inputAddress2 = driver.findElement(By.id("address2"));
				inputAddress2.sendKeys("Jakarta Selatan");

				WebElement inputZip = driver.findElement(By.id("postcode"));
				inputZip.sendKeys("12345");

				WebElement inputCity = driver.findElement(By.id("city"));
				inputCity.sendKeys("Jakarta Selatan");

				Select inputState = new Select(driver.findElement(By.id("id_state")));
				inputState.selectByValue("245");

				WebElement inputPhone = driver.findElement(By.id("phone"));
				inputPhone.sendKeys("089999999999");

				WebElement inputHP = driver.findElement(By.id("phone_mobile"));
				inputHP.sendKeys("089999999999");

				WebElement inputFuture = driver.findElement(By.id("alias"));
				inputFuture.click();

				WebElement buttonSave = driver.findElement(By.id("submitAddress"));
				buttonSave.click();

				//////////////////////////////////////////////////////////////////

			} else {
				System.out.println("Address has been Added");
			}

		} catch (

		Exception e) {
			
			Thread.sleep(3000);

			WebElement buttonProceed = driver
					.findElement(By.xpath("//div[@class='col-sm-12 proceed_btn_block']//span[contains(.,'Proceed')]"));
			buttonProceed.click();

			WebElement buttonProceed2 = driver
					.findElement(By.xpath("//div[@id='collapse-guest-info']//span[contains(.,'Proceed')]"));
			buttonProceed2.click();

			WebElement buttonATerms = driver.findElement(By.id("cgv"));
			buttonATerms.click();
			
			Thread.sleep(3000);

			WebElement buttonPayCheck = driver.findElement(By.className("cheque"));
			buttonPayCheck.click();

			WebElement buttonConfirm1 = driver.findElement(By.xpath("//span[contains(.,'I confirm my order')]"));
			buttonConfirm1.click();
						
			Thread.sleep(5000);
			String Alert = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='alert alert-success']"))).getText();
			System.out.println();
			System.out.println("====== "+Alert + " ======");
			System.out.println();
			

			
		}
	}

}
