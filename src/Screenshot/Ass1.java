package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

public class Ass1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
	    TakesScreenshot t = (TakesScreenshot) driver;
	    
	   File src=  t.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./photo/myntra.png");
	   FileUtils.copyFile(src,dest);
	   
		driver.close();
		

	}

}

//For Screenshot need Fileutils class which can be ccessed after importig jar :commons_io
//download apache utils link: 
//https://mvnrepository.com/artifact/commons-io/commons-io/2.6
