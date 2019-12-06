package Stepdefinition;


import org.openqa.selenium.WebDriver;

import Pages.login;
import Pages.payment_summary;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.driverutils;
 
public class Stepdefnition_SCB extends driverutils  {
	
	public static  WebDriver driver;
	payment_summary p;
	
	@Given("^user select \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//driver = JavaSample.getRemoteDriver(arg1, arg2, arg3, arg4);
		driver=driverutils.driver();
		
	}

	
	@When("^user enter the given url$")
	public void user_enter_the_given_url() throws Throwable {
		
		driver = driverutils.driver();
		login log = new login();
		String login="user000015";
		String group="uatsgee1";
		String password="dummyaaaa";
		log.Home(login, group, password);
		
		//log.createpayee();
		}
		

	@And("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
	    
	}

	@Then("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
	    
	}
	

	@Given("^user on clicking menu in main page then navigated to cash tab to click on manage tab$")
    public void user_on_clicking_menu_in_main_page_then_navigated_to_cash_tab_to_click_on_manage_tab() throws Throwable 
    {
		p=new payment_summary(driver);
		//muraliKrishna code
		p.clicking_on_menu();
		///yuvraj code
		/*p.clicking_on_menu();
		p.multiSelect();*/
    }

    @When("^user clicked on transactions and then clicked on first payment refrence$")
    public void user_clicked_on_transactions_and_then_clicked_on_first_payment_refrence() throws Throwable 
    {
    	p=new payment_summary(driver);
        p.click_transactions_click_payment_link();
    }

    @Then("^page should be navigated to paymeny summary and verify the details$")
    public void page_should_be_navigated_to_paymeny_summary_and_verify_the_details() throws Throwable
    {
    	p=new payment_summary(driver);
       p.verify_payment_summary();
    }

    
    @When("^user is on payments screen and check sort button and verify the rows got sorted on clicking the sorted buttons$")
    public void user_is_on_payments_screen_and_check_sort_button_and_verify_the_rows_got_sorted_on_clicking_the_sorted_buttons() throws Throwable 
    {
        // Write code here that turns the phrase above into concrete actions
    	p=new payment_summary(driver);
    	p.clicking_sorting_button();
    }

    @Then("^user should be able to navigate between the columns$")
    public void user_should_be_able_to_navigate_between_the_columns()
    {
    	p=new payment_summary(driver);
    	p.navigating_between_columns();
    }
    
    @When("^user is on transactions page and clicked on filter button$")
    public void user_is_on_transactions_page_and_clicked_on_filter_button() 
    {
        p=new payment_summary(driver);
        p.clicking_on_filter_button();
    }

    @Then("^the user should be able to scroll till Apply button and again user should be able to close filter window$")
    public void the_user_should_be_able_to_scroll_till_apply_button_and_again_user_should_be_able_to_close_filter_window() 
    {
    	 p=new payment_summary(driver);
         p.filter_pop_up_validation();
    }
 
    @When("^user clicked on three dots prsent under any of the transaction$")
    public void user_clicked_on_three_dots_prsent_under_any_of_the_transaction()
    {
    	p=new payment_summary(driver);
    	p.clicking_on_three_dots();
    }

    @Then("^user is verifying whether any options displayed under menu of three dots and should be able to close that menu$")
    public void user_is_verifying_whether_any_options_displayed_under_menu_of_three_dots_and_should_be_able_to_close_that_menu()
    {
    	p=new payment_summary(driver);
    	p.verifying_menu_present_under_three_dots_and_close_same();
    }

    @When("^user clicked on export list and navigated to separate window$")
    public void user_clicked_on_export_list_and_navigated_to_separate_window() 
    {
    	p=new payment_summary(driver);
    	p.clicking_on_export_list_button();
    }

    @Then("^user should be able to download the file by selecting required format after clicking on export$")
    public void user_should_be_able_to_download_the_file_by_selecting_required_format_after_clicking_on_export() 
    {
    	p=new payment_summary(driver);
    	p.selecting_drop_down_for_required_format_to_download_from_export_list();
    }


    @When("^user verified that there is page navigation bar$")
    public void user_verified_that_there_is_page_navigation_bar()
    {
    	p=new payment_summary(driver);
       //p.checking_navigation_bar_presence();
    }

    @Then("^user should be able to navigate each page$")
    public void user_should_be_able_to_navigate_each_page()
    {
    	p=new payment_summary(driver);
    	//p.navigating_through_navigation_bar();
    }
    
    @When("^user enable to select multiple options$")
    public void user_enable_to_select_multiple_options() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	p=new payment_summary(driver);
    	p.multiSelect();
    }

    @Then("^user select the payment reference$")
    public void user_select_the_payment_reference() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	p=new payment_summary(driver);
    	p.selectPaymentReference();
    }
    
    @When("^user click on action and verify options$")
    public void user_click_on_action_and_verify_options() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	p=new payment_summary(driver);
    	p.onActionsClick();
    }

}

