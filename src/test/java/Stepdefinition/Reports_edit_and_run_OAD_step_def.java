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

public class Reports_edit_and_run_OAD_step_def extends driverutils {
	login log = new login();
	Dashboard dashb = new Dashboard();
	Reports report = new Reports();
	@Given("^Verify user navigates to the S(\\d+)B Home Screen report and alerts$")
	public void verify_user_navigates_to_the_S_B_Home_Screen_report_and_alerts(int arg1) throws Throwable {
		driver = driverutils.driver();
		login log = new login();
		String login = "user000015";
		String group = "uatsgee1";
		String password = "dummyaaaa";
		log.Home(login, group, password);
	}

	@When("^Verify user navigates to S(\\d+)B reports Screen$")
	public void verify_user_navigates_to_S_B_reports_Screen(int arg1) throws Throwable {
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

	@Then("^verify the column drag and drop, column edit and run the report for editable Operating Account Details report$")
	public void verify_the_column_drag_and_drop_column_edit_and_run_the_report_for_editable_Operating_Account_Details_report() throws Throwable {
	    report.oadReportaddcolumn();
	}
}
