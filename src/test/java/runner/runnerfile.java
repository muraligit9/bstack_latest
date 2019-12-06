package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "resources\\featurefiles" },glue = {
		"Stepdefinition"},
//tags={"@dashbord"},
//tags={"@Messages"},
//tags={"@FundTransfer"},
//tags={"@Reports_Operating_Account_Details"},
//tags= {"@Scb"},
//tags={"@Reports_Operating_Account_Statement"},
//tags={"@Reports_download"},
plugin = {"html:target/cucumber-html-report"})
public class runnerfile { 

}