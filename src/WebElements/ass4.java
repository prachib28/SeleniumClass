package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.actitime.com/login.do");
		  
		  /*WebElement ele = driver.findElement(By.id("username"));
		  if(ele.isDisplayed())
		  {
			  System.out.println("Pass: Element is displayed");
			  ele.sendKeys("admin");
		  }
		  else
		  {
			  System.out.println("Fail: Element is not displayed");
		  }
		  WebElement ele1 = driver.findElement(By.name("pwd"));
		  if(ele1.isDisplayed())
		  {
			  System.out.println("Pass: Element is displayed");
			  ele1.sendKeys("admin");
		  }
		  else
		  {
			  System.out.println("Fail: Elemetnt is not displayed");
		  }*/
		  WebElement ele2 = driver.findElement(By.xpath("//div[text()='Login ']"));
		  if(ele2.isEnabled())
		  {
			  System.out.println("Pass: Element is enabled");
		  }
		  else
		  {
			  System.out.println("Fail: Element is not displayed");
			  
		  }
		  
		  WebElement ele3 = driver.findElement(By.name("remember"));
		  if(ele3.isSelected())
			  
		  {
			  System.out.println("Pass: Element is selected");
		  }
		  else
		  {
			  System.out.println("Fail: Element is not selected");
			  
		  }
		  
		  
		  
		  

	}

}
