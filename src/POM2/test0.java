package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		test1 t1 = new test1(driver);
		driver.navigate().refresh();
		t1.login();
		
		Thread.sleep(5000);
		test2 t2 = new test2(driver);
		t2.email("user");
		t2.password("user");
		t2.logon();
			
			
				

	}

}
