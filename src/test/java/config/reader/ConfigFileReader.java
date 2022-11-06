package config.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	public static Properties properties;
	public static String propertyFilePath = ".//ProprtiesFile//config.properties";

	public ConfigFileReader() {
		FileInputStream reader;
		try {
			reader = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}
	}
	
	public String getApplicationURL() {
		String URL = properties.getProperty("Url");
		if(URL!=null) return URL;
		else throw new RuntimeException("URL not specified in the config.properties file.");

	}
	
	public String getBrowser() {
		String Browser = properties.getProperty("Browser");
		if(Browser!=null) return Browser;
		else throw new RuntimeException("Browser not specified in the config.properties file.");
	}

}
