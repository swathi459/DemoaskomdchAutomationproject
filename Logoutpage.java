package automationproject;

import org.openqa.selenium.By;

public class Logoutpage {

	public static void logoutdetails() {
	
		Driverscript.driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("Logout is successful:" +Driverscript.driver.getTitle());
		
	}

}
