package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {



public ComponentsPageObject () {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[text()='Components']")
private WebElement componentsIcon;
@FindBy(xpath = "(//a[contains(text(),'Mice and Trackballs (0)')]")
private WebElement miceAndTrackballs;
@FindBy(xpath = "//a[contains(text(),'Monitors (2)')]")
private WebElement monitorsIcon;
@FindBy(xpath = "//a[contains(text(),'Printers (0)')]")
private WebElement printersIcon;
@FindBy(xpath = "//a[contains(text(),'Scanners (0)')]")
private WebElement scannersIcon;
@FindBy(xpath = "//a[contains(text(),'Web Cameras (0)')]")
private WebElement webCamerasIcon;





}