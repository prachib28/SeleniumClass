package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class test1 {

	@FindBy(linkText="LOGIN")
	private WebElement loginbtn;
	
	public test1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void login()
	{
		loginbtn.click();
	}
	
}
