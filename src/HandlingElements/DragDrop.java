package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {

//http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		 WebElement src = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		 WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		 
		 Actions a = new Actions(driver);
		 a.dragAndDrop(src,dest).perform();

	}

}
