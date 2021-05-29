package test.SP2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_03 extends Main {
	public static void SearchHotel() {
		System.out.println();
		System.out.println("========Search Hotel========");
		System.out.println();

		WebElement InputDestination = driver.findElement(By.id("hotel_location"));
		InputDestination.sendKeys("Jakarta");
		String expectedDest = InputDestination.getAttribute("value");
		System.out.println("Hotel Location : " + expectedDest);

		WebElement ButtonSelectHotel = driver.findElement(By.id("id_hotel_button"));
		ButtonSelectHotel.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement ButtonResultHotel = driver.findElement(By.className("search_result_li"));
		ButtonResultHotel.click();

		WebElement CheckIn = driver.findElement(By.id("check_in_time"));
		CheckIn.sendKeys("04-12-2021");
		String expectedDateIn = CheckIn.getAttribute("value");
		System.out.println("Check in date : " + expectedDateIn);

		WebElement CheckOut = driver.findElement(By.id("check_out_time"));
		CheckOut.sendKeys("08-12-2021");
		String expectedDateOut = CheckOut.getAttribute("value");
		System.out.println("Check out date : " + expectedDateOut);


		WebElement buttonSearch = driver.findElement(By.xpath("//span[.='Search Now']"));
		buttonSearch.click();

		System.out.println("Waiting for the result..");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement ResultDestination = driver.findElement(By.id("hotel_location"));
		String actualDest = ResultDestination.getAttribute("value");
		System.out.println("Hotel Location Result : " + actualDest);

		if (actualDest.contentEquals(expectedDest)) {
			System.out.println("We've got what you are looking for");
		} else {
			System.out
					.println("Sorry, it seems like we dont get what you are looking for. Hotel location are not match");
		}

		// Add Star
		driver.findElement(By.xpath("//div[@class='col-sm-12 lf_sub_cont']//input[@value='5']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-12 lf_sub_cont']//input[@value='4']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-12 lf_sub_cont']//input[@value='3']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-12 lf_sub_cont']//input[@value='2']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-12 lf_sub_cont']//input[@value='1']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-12 lf_sub_cont']//input[@value='0']")).click();

		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='1']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='2']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='3']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='4']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='5']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='6']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='7']")).click();

		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='1']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='2']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='3']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='4']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='5']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='6']")).click();
		driver.findElement(By.xpath("//div[@id='filter_results']/div[1]//input[@value='7']")).click();

		WebElement ResultChekIn = driver.findElement(By.id("check_in_time"));
		String actualCheckIn = ResultChekIn.getAttribute("value");
		System.out.println("Hotel Location Result : " + actualCheckIn);

		if (actualCheckIn.contentEquals(expectedDateIn)) {
			System.out.println("Date of check in are match");
		} else {
			System.out.println("Date of check in are not match");
		}

		WebElement ResultChekOut = driver.findElement(By.id("check_out_time"));
		String actualCheckOut = ResultChekOut.getAttribute("value");
		System.out.println("Hotel Location Result : " + actualCheckOut);

		if (actualCheckOut.contentEquals(expectedDateOut)) {
			System.out.println("Date of check out are match");
		} else {
			System.out.println("Date of check out are not match");
		}

		
	}

}
