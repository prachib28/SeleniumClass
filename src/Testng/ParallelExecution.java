package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");	
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}

	@Parameters({"browserName"})
	@Test
	public void login(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("GFHGHFGGHFGHG");
		driver.findElement(By.id("pass")).sendKeys("gdgchgghghgj");
		driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
		
		
		
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
}
