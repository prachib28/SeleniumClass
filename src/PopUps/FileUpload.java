package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/account/createaccount");
		
		driver.findElement(By.name("userType")).click();
		
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\Amdocs\\Documents\\SeleniumNotes\\Locators-w.docx");
	
		

	}

}
