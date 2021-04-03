package HandlingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	  WebElement ele = driver.findElement(By.linkText("Fashion"));
	  
	  Actions a = new Actions(driver);

	  a.moveToElement(ele).perform();
	  
	 driver.findElement(By.linkText("Sneakers")).click();
	 
	 driver.close();
	  
	  
	  
	  /*
	   System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.linkText("Electronics"));
	
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.linkText("Apple")).click();
	   */
	  
	}

}
