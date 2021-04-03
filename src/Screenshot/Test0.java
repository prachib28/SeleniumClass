package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//typecasting
		TakesScreenshot t = (TakesScreenshot) driver;
		//call the method photo is taken and stored in RAM
		File src = t.getScreenshotAs(OutputType.FILE);
		//Specify the location
		File dest = new File("./photo/amozn.png");
	    //copy the photo from src to dest location
		FileUtils.copyFile(src,dest);
		driver.close();
		
		
				

	}

}
