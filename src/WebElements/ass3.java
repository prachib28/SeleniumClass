package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.actitime.com/login.do");
		  
		  WebElement ele = driver.findElement(By.xpath("//div[@class='productNameContainer']"));
		  System.out.println(ele.getText());
		  
		
		
		

	}

}
