package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.reader.ConfigFileReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.PageObjectMethod;
import reusableFunctions.BaseClass;

public class Stepdefinitions extends BaseClass {
	public static WebDriver driver;
	public static ConfigFileReader configreader;
	
	

	@Given("launch facebook page")
	public void launch_facebook_page() {
		configreader = new ConfigFileReader();
		urlLaunch();
		 
	}

	 @When("^Enter (.+) and (.+)$")
	    public void enter_and(String username, String password) throws Throwable {
		 PageObjectMethod pageObject = new PageObjectMethod(driver);
		   pageObject.Fbuser().sendKeys(username);
		    pageObject.Fbpass().sendKeys(password);
	    }

	@When("click login button")
	public void click_login_button() {
		PageObjectMethod pageObject = new PageObjectMethod(driver);
		   pageObject.logIn().click();
		  }
	
	@Then("Check application is launched")
	public void check_application_is_launched() {
	   String title = driver.getTitle();
	 boolean contains = title.contains("Facebook");
	 System.out.println(contains);
	}
	

	@Then("Check error is occured")
	public void check_error_is_occured() {
		
		WebElement error = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
		String text = error.getText();
		boolean contains = text.contains("isn't");
		System.out.println(contains);
		
	}
	
	

}
