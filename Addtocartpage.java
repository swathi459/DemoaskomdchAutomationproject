package automationproject;

import org.openqa.selenium.By;

public class Addtocartpage {

	public static void addtocartdetails() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Driverscript.driver.findElement(By.linkText("Women")).click();
		
		Thread.sleep(1000);
		
		Driverscript.driver.findElement(By.partialLinkText("Shorts")).click();
		
		Thread.sleep(1000);
		
		Driverscript.driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
		
		Thread.sleep(1000);
        
			}

}
