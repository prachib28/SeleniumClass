package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class test1 {
	
	
	//Initialization
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	//Declaration
	public test1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void username(String name) {
		usernametb.sendKeys(name);
		}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	
	
	}

}
