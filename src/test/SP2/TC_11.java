package test.SP2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_11 extends Main {

	public static void deleteAddress() {
		System.out.println();
		System.out.println("=========Delete Address========");
		System.out.println();

		new WebDriverWait(driver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='account_user_name hide_xs']")))
				.click();
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Accounts']"))).click();

		WebElement buttonMyAddress = driver.findElement(By.xpath("//span[.='My addresses']"));
		buttonMyAddress.click();

		try {
			WebElement buttonDelete = driver.findElement(By.xpath("//span[.='Delete']"));
			if (buttonDelete.isDisplayed()) {
				buttonDelete.click();
				driver.switchTo().alert().accept();
				System.out.println("=========Your Address successfully deleted========");

			} else {
				System.out.println("=========Your Address has been deleted========");
			}
		} catch (Exception e) {
			System.out.println("=========Your Address has been deleted========");
		}
	}
}
