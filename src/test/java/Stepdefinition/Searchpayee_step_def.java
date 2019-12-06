package Stepdefinition;



import Pages.login;
import Pages.searchpayee;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.driverutils;

 
public class Searchpayee_step_def extends driverutils{
	
@Given("^user launch the url and enters on login page$")
public void user_launch_the_url_and_enters_on_login_page() throws Throwable {
    
    driverutils.driver();
}

@When("^user enter valid login credentials$")
public void user_enter_valid_login_credentials() throws Throwable {
	driver = driverutils.driver();
	login log = new login();
	String login="user000015";
	String group="uatsgee1";
	String password="dummyaaaa";
	log.Home(login, group, password);
}

@When("^user can able to navigate homepage$")
public void user_can_able_to_navigate_homepage() throws Throwable {

    
    searchpayee payee1 = new searchpayee(driver);
	payee1.verifylogin();
}

@When("^user on home page and able to navigate fundtransfers option$")
public void user_on_home_page_and_able_to_navigate_fundtransfers_option() throws Throwable {
  
    
    searchpayee payee1 = new searchpayee(driver);
    payee1.navigateFundtransfers();
	
}

@When("^user can search with three letters of payee$")
public void user_can_search_with_three_letters_of_payee() throws Throwable {
   
    
    searchpayee payee1 = new searchpayee(driver);
    payee1.searchpaye();
}
@When("^user should add invoice details$")
	public void user_should_add_invoice_details() throws Throwable {
	  
		 searchpayee payee1 = new searchpayee(driver);
		    payee1.invoiceselect();
	}

	@Then("^user should complete by pressing continue$")
	public void user_should_complete_by_pressing_continue() throws Throwable {
		searchpayee payee1 = new searchpayee(driver);
		payee1.verifypayment();
}
	}


