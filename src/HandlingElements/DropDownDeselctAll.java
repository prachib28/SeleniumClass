package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDeselctAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("99");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			s.deselectAll();
		}
		
		driver.close();

	}

}
