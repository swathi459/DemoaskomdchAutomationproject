package automationproject;

import org.openqa.selenium.By;



public class Loginpage {
	
		
   	//public static void userdetails(String userid, String pwd) throws InterruptedException {
   		
   	   		
	  public static void userdetails() throws InterruptedException {
		  
		Driverscript.driver.findElement(By.linkText("Account")).click();
		
		Thread.sleep(1000);
		
		//Driverscript.driver.findElement(By.name("username")).sendKeys(userid);
		Driverscript.driver.findElement(By.name("username")).sendKeys(multiplereadexcel.username);
		
		Thread.sleep(1000);
		
		//Driverscript.driver.findElement(By.name("password")).sendKeys(pwd);
		Driverscript.driver.findElement(By.name("password")).sendKeys(multiplereadexcel.password);
		
		Thread.sleep(3000);
				
	    //at.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	    Driverscript.driver.findElement(By.xpath("//button[@name='login']")).click();
			
		Thread.sleep(3000);
		
	
	}
		
	
}
