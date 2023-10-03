package project3_SwagLabs.SwagLabs_SauceDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ElementsAndMethods extends Baseclass {
	
	//LoginPage
	@FindBy(xpath = "//input[@name='user-name']")WebElement username;
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	@FindBy(xpath = "//input[@name='login-button']")WebElement loginBT;
	@FindBy(xpath = "//div[@class='app_logo']")WebElement site_Logo;
	
	//Products
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")WebElement product_BackpackP1;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")WebElement product_JacketP2;
	@FindBy(xpath = "//button[text()='Add to cart']")WebElement addToCartBT;
	@FindBy(xpath = "//button[@id='back-to-products']")WebElement backToProductsBT;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")WebElement cartIconBT;
	
	//OptionsInCart
	@FindBy(xpath = "//button[@name='continue-shopping']")WebElement continue_ShoppingBT;
	@FindBy(xpath = "//button[@name='checkout']")WebElement checkoutBT;
	
	//CheckOutDetails
	@FindBy(xpath = "//input[@name='firstName']")WebElement first_Name;
	@FindBy(xpath = "//input[@name='lastName']")WebElement last_Name;
	@FindBy(xpath = "//input[@name='postalCode']")WebElement postalCode;
	@FindBy(xpath = "//input[@name='continue']")WebElement continue_checkout;
	
	@FindBy(xpath = "//button[@name='finish']")WebElement finishBT;
	@FindBy(xpath = "//button[text()='Back Home']")WebElement backToHomeBT;
	
	
	
	
	ElementsAndMethods(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);}
	
	
	public void Login(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginBT.click();
	}
	public void  handleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.switchTo().defaultContent();
	}
	public void verifySite() {
		boolean sLogo = site_Logo.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(sLogo, true);
	}
	public void addP1ToCart() {
		product_BackpackP1.click();
		addToCartBT.click();
	}
	public void addP2ToCart() {
		product_JacketP2.click();
		addToCartBT.click();
	}
	public void clickBAckToProducts() {
		backToProductsBT.click();
	}
	public void clickCartIcon() {
		cartIconBT.click();
	}
	public void verifyProductsAreAdded() {
		boolean p1 = product_BackpackP1.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(p1, true);
		boolean p2 = product_JacketP2.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(p2, true);
	}
	public void clickContinueShopping() {
		continue_ShoppingBT.click();
	}
	public void clickCheckOut() {
		checkoutBT.click();
	}
	public void typeCheckoutDetailsAndContinue(String fname, String lname, String pcode) {
		first_Name.sendKeys(fname);
		last_Name.sendKeys(lname);
		postalCode.sendKeys(pcode);
		continue_checkout.click();
	}
	public void clickFinish() {
		finishBT.click();
	}
	public void clickBackHome() {
		backToHomeBT.click();
	}

}
