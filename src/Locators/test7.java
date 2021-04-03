package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("SkillRary Ecommerce")) {
			System.out.println("Pass:Home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		
		
		
	}
	
}
