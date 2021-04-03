package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	  
	    driver.get("https://www.amazon.com/");
	    
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    
	    
			}

}
