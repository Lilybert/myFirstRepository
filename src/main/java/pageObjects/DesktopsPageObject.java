package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "compare-total")
	private WebElement productCompare;
	@FindBy(id = "input-sort")
	private WebElement defaultIcon;
	@FindBy(xpath = "//label[text()='Show:']")
	private WebElement show;
	@FindBy(xpath = "//label[text()='Sort By:']")
	private WebElement soryByIcon;
	@FindBy(id = "input-limit")
	private WebElement numberlimitIcon;
	@FindBy(className = "fa fa-th-list")
	private WebElement listIcon;
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement gridIcon;
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCimena30Icon;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOSicon;
	@FindBy(xpath = "//a[text()='Product 8']")
	private WebElement product8Icon;
	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterICon;
	
}
