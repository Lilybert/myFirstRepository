package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer  extends Base {
	
	// in this class we will define before Hooks and after hooks of cucumber
	// before hooks will run before each scenario
	//After hooks will run after each scenario
	
	@Before
	public void beforeHooks(Scenario scenario) {
		
		openBrowser(); // this method comes from base class and will launch browser
		openBrowser();// this method comes from Base class and will launch url

}
	
	private void openBrowser() {
		// TODO Auto-generated method stub
		
	}

	@After
	public void afterHooks (Scenario scenario) {
		tearDown();
		
	}

	private void tearDown() {
		// TODO Auto-generated method stub
		
	}
}
