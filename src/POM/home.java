package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	
	
		@FindBy(id="logoutLink")
		private WebElement logoutbtn;
		
		public home(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		
	public void logout() {
		logoutbtn.click();
		
	}
}

