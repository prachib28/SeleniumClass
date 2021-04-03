package PopUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		//driver.close();
		driver.quit();

	}

}
