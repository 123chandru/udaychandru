package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import reusableFunctions.BaseClass;

public class HooksClass extends BaseClass {
	public static WebDriver driver;
	@Before
	public void beforeExecution() {
		driver= browserLaunch();
	}
	@After
	public void afterexecution() {
		driver.close();

	}
	
}
