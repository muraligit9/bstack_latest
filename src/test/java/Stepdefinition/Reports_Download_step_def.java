package Stepdefinition;

import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Dashboard;
import Pages.Reports;
import Pages.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.Reportspom;
import utils.driverutils;

public class Reports_Download_step_def extends driverutils {
	login log = new login();
	Dashboard dashb = new Dashboard();
	Reports report = new Reports();

	@Given("^Verify user navigates to the S(\\d+)B Home Screen REPORTS & ALERTS$")
	public void verify_user_navigates_to_the_S_B_Home_Screen_REPORTS_ALERTS(int arg1) throws Throwable {
		driver = driverutils.driver();
		login log = new login();
		String login = "user000015";
		String group = "uatsgee1";
		String password = "dummyaaaa";
		log.Home(login, group, password);
	}

	@When("^Verify user navigates to S(\\d+)B REPORTS Screen$")
	public void verify_user_navigates_to_S_B_REPORTS_Screen(int arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		dashb.dash(driver);

		// report nav
		Reportspom rep = new Reportspom(driver);
		rep.getCashBtn().click();
		Thread.sleep(2000);
		rep.getViewBtn().click();
		Thread.sleep(2000);
		rep.getReportBtn().click();

		// notifi
		report.notification();

	}

	@Then("^Verify user able to download the Operating Account Statement Report$")
	public void verify_user_able_to_download_the_Operating_Account_Statement_Report() throws Throwable {
		// report download
		report.reportdownload();
	}

}
