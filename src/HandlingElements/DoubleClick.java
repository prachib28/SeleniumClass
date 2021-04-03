package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://demoapp.skillrary.com/");
		
		WebElement ele = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		WebElement btn = driver.findElement(By.id("add"));
		a.doubleClick(btn).perform();
		
		
 

	}

}
