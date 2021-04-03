package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement ele = driver.findElement(By.name("url"));
		
		Select s = new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Computers");
		Thread.sleep(2000);
		s.selectByValue("search-alias=electronics-intl-ship");
		Thread.sleep(2000);
		driver.close();

		
		/*
		 driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));

		Select s=new Select(ele);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("625");
		Thread.sleep(3000);
		s.selectByVisibleText("Crafts");
		Thread.sleep(3000);
		 */
	}

}
