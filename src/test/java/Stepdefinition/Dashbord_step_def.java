package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Dashboard;
import Pages.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.dashbordpom;
import utils.ConfigFileReader;
import utils.driverutils;

public class Dashbord_step_def extends driverutils 
{

	// public static WebDriver drive;

	login log = new login();
	Dashboard dashb = new Dashboard();

	@Given("^Verify user navigates to the S(\\d+)B home$")
	public void verify_user_navigates_to_the_S_B_home(int arg1) throws Throwable 
	{
		driver = driverutils.driver();
		login log = new login();
		String login="user000015";
		String group="uatsgee1";
		String password="dummyaaaa";
		log.Home(login, group, password);
	}

	@When("^Verify user navigates to S(\\d+)B home Menu$")
	public void verify_user_navigates_to_S_B_home_Menu(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		dashb.dash(driver);
		dashbordpom dash = new dashbordpom(driver);
		dash.getSettingsBtn().click();
		Thread.sleep(4000);
	}

	@When("^Verify user navigates to dashbord$")
	public void verify_user_navigates_to_dashbord() throws Throwable {
		dashbordpom dash = new dashbordpom(driver);
		dash.getManageDashBtn().click();
		Thread.sleep(4000);

	}

	@Then("^Verify user able to successfully customize the dashbord$")
	public void verify_user_able_to_successfully_customize_the_dashbord() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		  WebElement tile; 
		  tile=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@unique-widget-id='quick-payments2']/child::span")));
		 
		dashbordpom dash = new dashbordpom(driver);
		Thread.sleep(4000);
		
		  if(tile.isDisplayed()) 
		  { dash.getQuickPayBtn().click();
		  Thread.sleep(10000); 
		  
		  }else{
		  System.out.println("tileee"+tile.getText()); }
		 
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		builder.dragAndDrop(dash.getFromArea(), dash.getToArea()).build().perform();

		dash.getSaveBtn().click();

		Thread.sleep(20000);
		System.out.println(dash.getQuickPayTile().getText());
		if (dash.getQuickPayTile().getText().contains("QUICK PAYMENT")) {
			System.out.println("Quick Payment is successfully added to the dashbord");
		} else {
			Assert.fail("Quick Payment is successfully added to the dashbord");
		}
	}

}
