package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 extends Sample {

	/*public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}*/

	@Test
	public void getstarted()
	{
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();//first here we inspect with id but not foung element so updated failed 
		 String t = driver.getTitle();
		Reporter.log(t,true);
		 String u = driver.getCurrentUrl();
		 Reporter.log(u,true);
	}
	
	/*@AfterMethod
	public void closeapp()
	{
		driver.close();
	}*/
	
}

/*
Run testcase sequentially:
select all test cases
Right click select tesng & click on convert to testng
Testng.xml file generated

In @BeforeMethod & @AfterMethod code should be same we make it easy & code minization we create one sample class & fetch it
*/ 
