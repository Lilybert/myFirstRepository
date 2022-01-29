package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;
	@FindBy(className = "btn btn-primary")
	private WebElement continueButton;
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUsIcon;
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformationIcon;
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement privacyPolicyIcon;
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termAndConditionIcon;

}
