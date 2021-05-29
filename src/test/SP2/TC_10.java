package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TC_10 extends Main{
	

	public static void SearchHotelFailed() throws InterruptedException {
		System.out.println();
		System.out.println("========Failed Search Hotel========");
		System.out.println();


		WebElement buttonSearch = driver.findElement(By.xpath("//span[.='Search Now']"));
		buttonSearch.click();
		
		WebElement border = driver.findElement(By.xpath("//input[@id='hotel_location']"));
		String borderColor = border.getCssValue("border");
		borderColor = borderColor.replace("2px solid ", "");
		System.out.println(borderColor);
		
		driver.navigate().to("https://www.google.com/");
		
		WebElement InputText = driver.findElement(By.xpath("//input[@name='q']"));
		InputText.sendKeys(borderColor);
		InputText.sendKeys(Keys.ENTER);
		
		Thread.sleep(15000);
		
		driver.navigate().back();
		
		driver.navigate().back();


		
		
		
	
		
	}
}
