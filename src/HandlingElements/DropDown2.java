package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));

		Select s=new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("625");
		s.selectByVisibleText("Crafts");
		s.deselectAll();
		 //getting---java.lang.UnsupportedOperationException: You may only deselect all options of a multi-select---
		//becoz u can't deselect single dropdown we can if it is multidropdown
		
		

	}

}
