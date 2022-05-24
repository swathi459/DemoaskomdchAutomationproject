package automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {

	public static void checkoutdetails() throws InterruptedException {
		
		Driverscript.driver.findElement(By.xpath("//a[@title ='View your shopping cart']")).click();
		Driverscript.driver.findElement(By.className("wc-proceed-to-checkout")).click();
		WebElement firstname = Driverscript.driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		firstname.clear();
		firstname.sendKeys("Test");
		Thread.sleep(1000);
		WebElement lastname = Driverscript.driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		lastname.clear();
		lastname.sendKeys("user");
		Thread.sleep(1000);
		Select country = new Select(Driverscript.driver.findElement(By.xpath("//*[@id='billing_country']")));;
		country.selectByVisibleText("India");
		Thread.sleep(1000);
		WebElement address = Driverscript.driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		address.clear();
		address.sendKeys("testaddress1");
		Thread.sleep(1000);
		WebElement city = Driverscript.driver.findElement(By.xpath("//input[@id='billing_city']"));
		city.clear();
		city.sendKeys("testuser");
		Thread.sleep(1000);
		Select state = new Select(Driverscript.driver.findElement(By.xpath("//*[@id='billing_state']")));;
		state.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(1000);
		WebElement code = Driverscript.driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		code.clear();
		code.sendKeys("530012");
		Thread.sleep(3000);
		Driverscript.driver.findElement(By.xpath("//input[@value='cod']")).click();
		Driverscript.driver.findElement(By.xpath("//button[@id='place_order']")).click();
		Thread.sleep(1000);
	
		
	}
}
