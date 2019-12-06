package Stepdefinition;

import java.io.IOException;

import org.testng.annotations.AfterClass;

import Pages.login;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.driverutils;

public class Hooks extends driverutils{


	 @AfterClass
	    public void afterScenario() throws IOException{
	     driverutils.driver().quit();
	 }
	
}
