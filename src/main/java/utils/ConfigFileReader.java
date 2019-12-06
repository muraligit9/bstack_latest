package utils;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ConfigFileReader {
	public  static WebDriver driver;
	
	private Properties properties;
	private final String propertyFilePath= System.getProperty("user.dir")+"//config.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
		
	
	public String getApplicationUrl() {
		String url = properties.getProperty("URL");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String isLocal() {
		String local = properties.getProperty("local");
		if(local != null) return local;
		else throw new RuntimeException("driver not specified in the Configuration.properties file.");
		
	}
	
	public WebElement getExpWait(WebElement element)
	{
		String webEle = element.toString();
		WebDriverWait wait=new WebDriverWait(driver, 50);
		WebElement tile;
		tile= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webEle)));
		return tile;
	}

}