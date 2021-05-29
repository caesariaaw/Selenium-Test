package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class TC_08 extends Main{
	
	public static void VerifyPrice() throws InterruptedException {
		
	System.out.println();
	System.out.println("=========Verify Price========");
	System.out.println();
	
	new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='account_user_name hide_xs']"))).click();
	new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Orders']"))).click();
	
	
	WebElement buttonPlus = driver.findElement(By.className("footable-toggle"));
	buttonPlus.click();
	
	WebElement buttonDetails = driver.findElement(By.xpath("//div[@class='footable-row-detail-inner']//span[contains(.,'Details')]"));
	buttonDetails.click();
	
	String CostPerNight = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='product_original_price ']"))).getText();
	System.out.println("Cost Per Night = " +CostPerNight);
	CostPerNight = CostPerNight.replace(" ", "").replace(",", "").replace("Rp", "");
	int expCostPer4Night = Integer.valueOf(CostPerNight);
	expCostPer4Night= (expCostPer4Night*4);
	System.out.println("Cost Per 4 Night = " +expCostPer4Night);
	
	String CostPer4Night = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td:nth-of-type(9) > .text-left"))).getText();
	CostPer4Night = CostPer4Night.replace(" ", "").replace(",", "").replace("Rp", "");
	int actCostPer4Night = Integer.valueOf(CostPer4Night);
	System.out.println("Cost Per 4 Night = " +(actCostPer4Night));
	
	Assert.assertEquals(expCostPer4Night, actCostPer4Night);
	System.out.println("Price Match!");
	
	}
		
}

