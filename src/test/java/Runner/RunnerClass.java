package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ADMIN\\eclipsechu\\Cucumber\\src\\test\\resources\\featurefiles\\Opengoogle.feature",
glue = "stepdefinitions", 
dryRun=false, monochrome=true,  plugin= {"pretty", 
		"html:target/cucumber-reports", "json:target/jsonreport.json" })
public class RunnerClass {
	

}
