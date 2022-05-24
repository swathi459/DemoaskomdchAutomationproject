package automationproject;

import org.openqa.selenium.By;


public class Orderhistory {

	public static void orderhistorydetails() throws InterruptedException {
		
		Driverscript.driver.findElement(By.linkText("Account")).click();
		Driverscript.driver.findElement(By.linkText("Orders")).click();
		Driverscript.driver.findElement(By.linkText("VIEW")).click();
		
		}

}
