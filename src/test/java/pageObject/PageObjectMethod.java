package pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableFunctions.BaseClass;

public class PageObjectMethod extends BaseClass {

	public WebDriver driver;
	public PageObjectMethod(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement fbuser;
	@FindBy(xpath="//input[@id='pass']")
	WebElement fbpass;
	@FindBy(xpath="//button[@name='login']")
	WebElement logIn;
	
	public WebElement Fbuser() {
		return fbuser;
	}
	public WebElement Fbpass() {
		return fbpass;
	}
	public  WebElement logIn() {
		return logIn;
	}
	
	

	
}
