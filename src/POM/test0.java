package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// WebElement ele=driver.findElement(By.id("username"));

		test1 t = new test1(driver);

		driver.navigate().refresh();

		t.username("admin");
		t.password("manager");
		t.loginbutton();
		
		Thread.sleep(7000);
		home h=new home(driver);
		h.logout();
	
	}

}
