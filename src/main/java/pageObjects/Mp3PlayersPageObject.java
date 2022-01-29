package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"product-category\"]/ul/li[2]/a")
	private WebElement mP3Players;
	
	@FindBy(className = "img-thumbnail")
	private WebElement mP3PlayerImage;
	
	@FindBy(xpath = "//a[@xpath='1']")// add more that this items there are many
	private WebElement test11;
	
	@FindBy(className = "fa fa-th-list")
	private WebElement listIcon;
	
	@FindBy(id = "grid-view")
	private WebElement gridIcon;
	
	@FindBy(id = "compare-total")
	private WebElement productCompare;
	
	@FindBy(xpath = "//label[text()='Sort By:']")
	private WebElement sortBy;
	
	@FindBy(id = "input-sort")
	private WebElement sortByStaticDropdown;
	
	@FindBy(xpath = "//label[text()='Show:']")
	private WebElement show;
	
	@FindBy(id = "input-limit")
	private WebElement showStaticDropdown;
	
	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement ipodClassic;
	
	@FindBy(xpath = "//img[@xpath='1']")
	private WebElement ipodClassicImage;
	
	@FindBy(xpath = "//span[@xpath='1']")
	private WebElement addToCartIcon;
	
	@FindBy(xpath = "//i[@xpath='1']")
	private WebElement addToWishList; 
	
	@FindBy(xpath = "//button[@xpath='1']")
	private WebElement compareThisProduct;
	
	
	
	
	
	
	
	
	
	
	

}
