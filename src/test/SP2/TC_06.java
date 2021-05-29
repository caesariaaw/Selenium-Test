package test.SP2;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_06 extends Main {

	public static void SendTextOnContactMenu() throws InterruptedException {

		System.out.println("========Main Page========");
		System.out.println();
		System.out.println("========Change Language========");

		WebElement Language = driver.findElement(By.xpath("//div[@class='current']"));
		Language.click();

		Thread.sleep(3000);

		WebElement Indonesia = driver.findElement(By.xpath("//a[contains(.,'Indonesia')]"));
		Indonesia.click();

		Thread.sleep(3000);

		String expTitle = "Selamat datang";
		System.out.println("Expected Text : " + expTitle);

		WebElement titleInd = driver.findElement(By.xpath("//p[@class='header-desc-welcome']"));
		String actTitle = titleInd.getText();
		System.out.println("Actual Text : " + actTitle);

		if (actTitle.contentEquals(expTitle)) {
			System.out.println("The Language has successfully changed");
		} else {
			System.out.println("The Language only change partial or not at all.");
		}

		System.out.println();
		System.out.println("========Menu Feature Test========");
		System.out.println();

		Thread.sleep(3000);

		WebElement buttonMenu = driver.findElement(By.className("nav_toggle"));
		buttonMenu.click();

		WebElement buttonInterior = driver.findElement(By.xpath("//a[.='Interior']"));
		buttonInterior.click();

		WebElement InteriorTitle = driver.findElement(By.xpath("//p[.='Interior']"));
		String Title1 = InteriorTitle.getText();

		if (InteriorTitle.isDisplayed()) {
			System.out.println("Menu " + Title1 + " is on displayed");
		}

		WebElement buttonAmenities = driver.findElement(By.xpath("//a[.='Amenities']"));
		buttonAmenities.click();

		WebElement AmenitiesTitle = driver.findElement(By.xpath("//p[.='Amenities']"));
		String Title2 = AmenitiesTitle.getText();

		if (InteriorTitle.isDisplayed()) {
			System.out.println("Menu " + Title2 + " is on displayed");
		}

		WebElement buttonRooms = driver.findElement(By.xpath("//a[.='Rooms']"));
		buttonRooms.click();

		WebElement RoomsTitle = driver.findElement(By.xpath("//p[.='Our Rooms']"));
		String Title3 = RoomsTitle.getText();

		if (InteriorTitle.isDisplayed()) {
			System.out.println("Menu " + Title3 + " is on displayed");
		}

		WebElement buttonTesti = driver.findElement(By.xpath("//a[.='Testimonials']"));
		buttonTesti.click();

		WebElement TestiTitle = driver.findElement(By.xpath("//p[.='What our Guest say?']"));
		String Title4 = TestiTitle.getText();

		if (InteriorTitle.isDisplayed()) {
			System.out.println("Menu " + Title4 + " is on displayed");
		}

		Thread.sleep(3000);

		WebElement buttonLegal = driver.findElement(By.xpath("//li[6]/a[.='Kebijakan privasi dan hukum']"));
		buttonLegal.click();

		WebElement LegalTitle = driver.findElement(By.xpath("//h2[.='Kebijakan privasi dan hukum']"));
		String Title5 = LegalTitle.getText();
		String URL = driver.getCurrentUrl();

		if (LegalTitle.isDisplayed()) {
			System.out.println("You are on '" + URL + "' page. " + "Menu '" + Title5 + "' is on displayed");
		}

		WebElement buttonMenu2 = driver.findElement(By.xpath("//button[@class='nav_toggle']"));
		buttonMenu2.click();

		WebElement buttonAbtUs = driver.findElement(By.xpath("//li[7]/a[.='Tentang kami']"));
		buttonAbtUs.click();

		WebElement AbtUsTitle = driver.findElement(By.xpath("//h2[.='Tentang kami']"));
		String Title6 = AbtUsTitle.getText();
		String URL1 = driver.getCurrentUrl();

		if (AbtUsTitle.isDisplayed()) {
			System.out.println("You are on '" + URL1 + "' page. " + "Menu " + Title6 + " is on displayed");
		}

		WebElement buttonMenu3 = driver.findElement(By.className("nav_toggle"));
		buttonMenu3.click();

		WebElement buttonCntUs = driver.findElement(By.xpath("//a[.='Contact']"));
		buttonCntUs.click();

		WebElement CntUsTitle = driver.findElement(By.xpath("//p[@class='contact-header col-sm-offset-2 col-sm-8']"));
		String Title7 = CntUsTitle.getText();
		String URL2 = driver.getCurrentUrl();

		if (CntUsTitle.isDisplayed()) {
			System.out.println("You are on '" + URL2 + "' page. " + "Menu " + Title7 + " is on displayed");
		}

		System.out.println();
		System.out.println("========Send Message on 'Contact Us' Menu========");
		System.out.println();
		
		System.out.println("====Send Message to Customer Service====");
		System.out.println();
		
		WebElement SubjectField = driver.findElement(By.id("contact_type"));
		SubjectField.click();

		Thread.sleep(5000);

		WebElement CS = driver.findElement(By.xpath("//li[contains(.,'Customer service')]"));
		CS.click();

		WebElement inputEmail = driver.findElement(By.id("email"));
		inputEmail.clear();
		inputEmail.sendKeys("111@mailnesia.com");

		WebElement inputMessage = driver.findElement(By.id("message"));
		inputMessage.sendKeys("I didn't find the hotel location that I was looking for");

		WebElement buttonSend = driver.findElement(By.xpath("//span[.='Send Message']"));
		buttonSend.click();

		Thread.sleep(5000);
		
		try {
		WebElement SuccessMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
		if (SuccessMessage.isDisplayed()) {
			System.out.println("Your message has been successfully sent to our team.");
		} else {
			System.out.println("Terjadi error pada saat mengirimkan pesan.");
		}
		} catch (Exception e) {
			System.out.println("Terjadi error pada saat mengirimkan pesan.");
		}
		

		Thread.sleep(3000);
		System.out.println("====Send Message to WebMaster====");
		System.out.println();
		
		
		WebElement buttonMenu4 = driver.findElement(By.className("nav_toggle"));
		buttonMenu4.click();

		WebElement buttonCntUs1 = driver.findElement(By.xpath("//a[.='Contact']"));
		buttonCntUs1.click();

		WebElement SubjectField1 = driver.findElement(By.id("contact_type"));
		SubjectField1.click();

		try {
			Thread.sleep(5000);
			WebElement WebMaster = driver.findElement(By.xpath("//li[contains(.,'Webmaster')]]"));
			WebMaster.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			WebElement inputEmail1 = driver.findElement(By.id("email"));
			inputEmail1.clear();
			inputEmail1.sendKeys("111@mailnesia.com");

			WebElement inputMessage1 = driver.findElement(By.id("message"));
			inputMessage1.sendKeys("I didn't find the hotel location that I was looking for");

			WebElement buttonSend1 = driver.findElement(By.xpath("//span[.='Send Message']"));
			buttonSend1.click();
		}

		Thread.sleep(5000);
		
		try {
		WebElement SuccessMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
		if (SuccessMessage.isDisplayed()) {
			System.out.println("Your message has been successfully sent to our team.");
		} else {
			System.out.println("Terjadi error pada saat mengirimkan pesan.");
		}
		} catch (Exception e) {
			System.out.println("Terjadi error pada saat mengirimkan pesan.");
		}
	}

}
