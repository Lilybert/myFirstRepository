package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNoteBookss;
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065Icon;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookIcon;
	
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAirIcon;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProIcon;
	
	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVaioIcon;
	
}


