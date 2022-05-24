package automationproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverscript {
	
	public static WebDriver driver;
	public static String URL = "https://askomdch.com/";

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sadusumilli3\\Downloads\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Readexcel.readexcelsheet();
		multiplereadexcel.readexcelsheet();
		Thread.sleep(1000);
       	driver.quit();
		
	}
   
}
