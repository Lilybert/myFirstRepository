package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {

	// in this class we will store UI element of Login page
	// we will implement PageFactory.iniElement method to initialize
	// the page elements
	// We will use @FinBy annotations to store UI WebElements
	// We will store UI elements as Private WEbElements and
	// access them through public method and we will write the function
	// inside the public methods.

	// this constructor will use to initialize the Webelements inside this POM class
	// We will create PageFactory.initElements methos inside the constructor

	public LoginPageObject() {
		PageFactory.initElements(driver, this);

	}

	// pageFactory class provides an annotation @FindBy to find UI elements
	// @FindBy == driver.findElement()

	@FindBy(xpath = "//span[text()= 'My Account']")
	private WebElement MyAccount;
	
	@FindBy(xpath = "//a[text()= 'Login']")
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(xpath = "//input[@value= 'Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	

	public void clickOnMyAccount() {
		MyAccount.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}

	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
		
		
	}

	public void clickOnLoginButton() {
		loginButton.click();
		
	}
	
	public boolean myAccountTextisPresent() {
		if(myAccountText.isDisplayed())
			return true;
		else
			return false;
	}

	
	}
	
	
	
	
	
	
	


