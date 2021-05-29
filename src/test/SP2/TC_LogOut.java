package test.SP2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_LogOut extends Main{
	public static void SignOut() {
		
		
		WebElement buttonUser = driver.findElement(By.id("user_info_acc"));
		buttonUser.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		WebElement buttonLogout = driver.findElement(By.xpath("//a[.='Logout']"));
		buttonLogout.click();
		
		System.out.println("You are already Sign Out");
	}

}
