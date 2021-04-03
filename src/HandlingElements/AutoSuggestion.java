package HandlingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	    WebElement ele = driver.findElement(By.name("q"));    //findElement return tye WebElement
	    ele.sendKeys("pythonseleni");
	    Thread.sleep(3000);
	    
	    List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));    //FindElements return type list<WebElement>
	    System.out.println(ele1.size());   //get size
	    
	    for(WebElement b:ele1)
	    {
	    	System.out.println(b.getText());  //get all text in that list
	    }
	    driver.findElement(By.xpath("//b[text()='selenium interview questions']")).click();
	    driver.close();
	    
	    
	    
	    
	    
	    
	    /*
	     System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		
		Thread.sleep(3000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
          System.out.println(ele1.size());
          
          for(WebElement b:ele1) {
        	  System.out.println(b.getText());
          }
         driver.findElement(By.xpath("//b[text()='um interview questions']")).click(); 
	
	driver.close();
	*/
	     
	    
	 
	 
	}

}
