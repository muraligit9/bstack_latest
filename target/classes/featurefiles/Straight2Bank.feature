Feature: Straight2Bank 	
@dashbord 
Scenario: Verify if user is able to customize the home screen by drag and drop the widgets 
	Given Verify user navigates to the S2B home 
	When Verify user navigates to S2B home Menu 
	And Verify user navigates to dashbord 
	Then Verify user able to successfully customize the dashbord 
	
@Messages 
Scenario: Verify the tooltip on Hover on Messages 
	Given Verify user navigates to the S2B Home Screen 
	When Verify user navigates to S2B Messages Screen 
	And Verify user able to filter messages
	And Verify selected message is displayed properly
	Then Verify message unread count is reduced from previous count 
@FundTransfer		
Scenario: Verify user can Search the pay From and Payee with a minimum search character of three and Add Invoice 
   
    Given user launch the url and enters on login page
    When user enter valid login credentials
    And user can able to navigate homepage
	And user on home page and able to navigate fundtransfers option
	And user can search with three letters of payee
	And user should add invoice details
	Then user should complete by pressing continue 
	
@Reports_Operating_Account_Details
Scenario: verify the column drag and drop, column edit and run the report for editable Operating Account Details report
	Given Verify user navigates to the S2B Home Screen report and alerts 
	When Verify user navigates to S2B reports Screen	
	Then verify the column drag and drop, column edit and run the report for editable Operating Account Details report 

@Reports_Operating_Account_Statement
Scenario: verify the column drag and drop, column edit and run the report for editable Operating Account Statement report
	Given Verify user navigates to the S2B Home Screen Operating Account Statement report
	When Verify user navigates to S2B reports Screen Operating Account Statement report	
	Then verify the column drag and drop, column edit and run the report for editable Operating Account Statement report 
			
	
@Reports_download 
Scenario: Verify user able to download the Operating Account Statement Report
	Given Verify user navigates to the S2B Home Screen REPORTS & ALERTS 
	When Verify user navigates to S2B REPORTS Screen	
	Then Verify user able to download the Operating Account Statement Report 
	
@Scb
Scenario: verifying Transaction list features
Given user on clicking menu in main page then navigated to cash tab to click on manage tab
#verifying if sorting buttons working in payments screen
When user is on payments screen and check sort button and verify the rows got sorted on clicking the sorted buttons 
Then user should be able to navigate between the columns
#clicking on filter button and validating whether user able to navigate till apply button by scrolling the page
When user is on transactions page and clicked on filter button
Then the user should be able to scroll till Apply button and again user should be able to close filter window
#navigating to payments section and clicking on payment reference to check payment summary is displayed
When user verified that there is page navigation bar
Then user should be able to navigate each page
#select multiple options
When user enable to select multiple options
Then user select the payment reference
When user click on action and verify options
#navigating to payments section and checking the menu under three dots
When user clicked on three dots prsent under any of the transaction
Then user is verifying whether any options displayed under menu of three dots and should be able to close that menu
#verifying export list validation by selecting required format to download the file
When user clicked on export list and navigated to separate window
Then user should be able to download the file by selecting required format after clicking on export
#navigating to payments section and clicking on payment reference to check payment summary is displayed
When user clicked on transactions and then clicked on first payment refrence
Then page should be navigated to paymeny summary and verify the details

	
	
	
    