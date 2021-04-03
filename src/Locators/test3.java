package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys.("esdwwq");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admingghfh");
		
	}

}
