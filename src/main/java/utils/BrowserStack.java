package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack {
	
	public static final String USERNAME = "muralikrishna28";
	  public static final String AUTOMATE_KEY = "yemyBPXo33yuGeParsv7";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  //static WebDriver remoteDriver = null;

	  public static WebDriver getRemoteDriver(String browser, String version, String os, String os_version) throws MalformedURLException {

	    DesiredCapabilities desiredCap = new DesiredCapabilities();
		desiredCap.setCapability("browserstack.local", true);
		desiredCap.setCapability("browserstack.autoWait", 0);
		desiredCap.setCapability("project", "SCB");
		desiredCap.setCapability("browserstack.localIdentifier", "Test123");
		desiredCap.setCapability("acceptSslCerts", "true");
		desiredCap.setCapability("name", "Bstack-[Java] Sample Test");
	    
		desiredCap.setCapability("browser", browser);
		desiredCap.setCapability("browser_version", version);
		desiredCap.setCapability("os", os);
		desiredCap.setCapability("os_version", os_version);
		desiredCap.setCapability("resolution", "1024x768");
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), desiredCap);
	    return driver;

	  }
}
