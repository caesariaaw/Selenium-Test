package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_Precondition3 extends Main {
	public static void BackToHome() {
	WebElement pressBack = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
	pressBack.click();
	}
}
