package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy(className = "fa fa-phone")
	private WebElement phoneIcon;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login; 
	
	@FindBy(xpath = "//*[@id=\"wishlist-total\"]/i")
	private WebElement heartOfWishList;
	
	@FindBy(xpath = "//span[text()='Wish List (1)']")
	private WebElement wishList;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkout;
	
	@FindBy(className = "form-control input-lg")
	private WebElement searchBox;
	
	@FindBy(className = "fa fa-search")
	private WebElement searchButton;
	
	@FindBy(id = "cart-total")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooks;
	
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement component;
	
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;
	
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;
	
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesAndpdas;
	
	@FindBy(xpath ="//a[text()='Cameras']")
	private WebElement cameras;
	
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mP3Players;
	
	@FindBy(xpath = "//img[@xpath='1']")
	private WebElement mainImageHomePage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/span[2]")
	private WebElement wiperPaginationBullet;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinema30;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5D;
	
	@FindBy(xpath = "//div[@xpath='1']")
	private WebElement swiperButtonNext;
	
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement deliveryInformation;
	
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement privacyAndPolicy;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termAndConditions;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement returns;
	
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement siteMap;
	
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement brands;
	
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificates;
	
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement affiliate;
	
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement specials;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccount2;
	
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement orderHistory;
	
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishList2;
	
	@FindBy(xpath = "//a[text()='Newsletter']")
	private WebElement newsLetter;
	
	@FindBy(xpath = "//a[text()='OpenCart']")
	private WebElement openCart;
	

	

}
