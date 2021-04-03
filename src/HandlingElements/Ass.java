package HandlingElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
		Select se = new Select(element);
		List<String> originalList = new ArrayList();
		for (WebElement e : se.getOptions()) {
			originalList.add(e.getText());
		}
		//----logic block starts
		List<String> tempList= originalList;
		Collections.sort(tempList);
		//Assert.assertEquals(tempList, originalList);
	}

}
