package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.KnownElements;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class test2 {
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public test2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void email(String user)
	{
		emailtb.sendKeys(user);
	}
	public void password(String user)
	{
		passwordtb.sendKeys(user);
	}
	public void logon()
	{
		loginbtn.click();
	}
	
}
