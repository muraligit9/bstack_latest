package Pages;


import java.util.concurrent.TimeUnit;

import pageFactory.loginpom;
import utils.ConfigFileReader;
import utils.driverutils;



public class login extends driverutils {	
	ConfigFileReader util =new ConfigFileReader();  	  	 
	public void Home(String login ,String group, String password) throws InterruptedException {
		
		driver.get(util.getApplicationUrl());
		//driver.get("https://s2bssotest.standardchartered.com/unifiedlogin/v2.0/login/index.html?language=en");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		loginpom obj =new loginpom(driver);
		obj.getUserID().sendKeys(login);
		obj.getGroupID().sendKeys(group);
		obj.getRemCk().click();
		obj.getContBtn().click();
		obj.getPassword().sendKeys(password);
		obj.getLoginbtn().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		
}