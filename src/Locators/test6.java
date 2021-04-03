package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("prachi.bhadale98@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Prachi@28");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Facebook - log in or sign up")) {
			System.out.println("Pass:Home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}

		driver.close();


		}


	

}
