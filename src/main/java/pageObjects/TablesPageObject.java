package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablesPageObject extends Base{
	public TablesPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;
	@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyIcon;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsIcon;
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement returnsIcon;
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement siteMapIcon;
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement brandsIcon;
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertIcon;
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement affiliateIcon;
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement specialsIcon;
	

}
