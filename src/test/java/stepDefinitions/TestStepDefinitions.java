package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestPageObject;

public class TestStepDefinitions {

	TestPageObject testPageObject = new TestPageObject();
	
	@When("user seach ffor {string}")
	public void user_seach_ffor(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	@Then("iphone should be displayed")
	public void iphone_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
	
	
}


