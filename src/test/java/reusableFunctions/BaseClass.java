package reusableFunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.reader.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public WebDriver driver;
	public static  ConfigFileReader configReader;
	 
	public WebDriver  browserLaunch() {
		configReader = new ConfigFileReader();
		try {
			switch (configReader.getBrowser().toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				break;				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				driver.manage().window().maximize();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				break;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return driver;
	}
	public void urlLaunch() {
		driver.get(configReader.getApplicationURL());
		
	}
	public void impWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
