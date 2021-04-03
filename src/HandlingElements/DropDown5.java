package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("99");
		
		List<WebElement> alloption = s.getOptions();
		System.out.println(alloption.size());
		
		
		for(WebElement b:alloption) {
			System.out.println(b.getText());
		}
		driver.close();

	}

}
