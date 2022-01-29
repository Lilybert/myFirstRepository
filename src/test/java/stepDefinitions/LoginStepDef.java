package stepDefinitions;



import core.Base;
import pageObjects.LoginPageObject;


public class LoginStepDef extends Base{

	// each step in scenario should have one 
	// java method associated with that step
	// we can have duplicate methods for
	//steps in scenario steps
	//In order to get access to POM class methods we need to create
	//object of LoginPageObject class
	
	LoginPageObject loginPageObject = new LoginPageObject();
	
	
}
