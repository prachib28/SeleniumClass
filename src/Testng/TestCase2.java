package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 extends Sample {
	/*public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}*/

	@Test
	public void forgotPassword()
	{
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("84756423165");
		driver.findElement(By.id("did_submit")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
	}
	
	/*@AfterMethod
	public void closeapp()
	{
		driver.close();
	}*/
}
