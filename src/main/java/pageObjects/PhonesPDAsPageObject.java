package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "")
	private WebElement components;
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement htcTouchHDicon;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphoneIcon;
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProIcon;
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccountIcon;
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement orderHistoryIcon;
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishListIcon;
	@FindBy(xpath = "//a[text()='Newsletter']")
	private WebElement newLetterIcon;
	
	
	

}
