package Stepdefinition;

import Pages.Messages;
import Pages.login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.driverutils;

public class Messages_step_def extends driverutils {
	login log = new login();
	Messages msgscr = new Messages();

	@Given("^Verify user navigates to the S(\\d+)B Home Screen$")
	public void verify_user_navigates_to_the_S_B_Home_Screen(int arg1) throws Throwable {
		driver = driverutils.driver();
		login log = new login();
		String login="user000015";
		String group="uatsgee1";
		String password="dummyaaaa";
		log.Home(login, group, password);
	}

	@When("^Verify user navigates to S(\\d+)B Messages Screen$")
	public void verify_user_navigates_to_S_B_Messages_Screen(int arg1) throws Throwable {
		Thread.sleep(3000);
		msgscr.messagebtn();		
		Thread.sleep(3000);
		msgscr.countreset();
		Thread.sleep(3000);
		msgscr.messagecount();
		
		/*
		 * Thread.sleep(3000); msgscr.messagefilter(); msgscr.readmessage();
		 * msgscr.messagecountVal();
		 */
	}

	@When("^Verify user able to filter messages$")
	public void verify_user_able_to_filter_messages() throws Throwable {

		Thread.sleep(3000);
		msgscr.messagefilter();
	}

	@When("^Verify selected message is displayed properly$")
	public void verify_selected_message_is_displayed_properly() throws Throwable {
		Thread.sleep(3000);
		msgscr.readmessage();
	}

	@Then("^Verify message unread count is reduced from previous count$")
	public void verify_message_unread_count_is_reduced_from_previous_count() throws Throwable {
		Thread.sleep(3000);
		msgscr.messagecountVal();

	}

}
