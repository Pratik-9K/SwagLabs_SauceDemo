package project3_SwagLabs.SwagLabs_SauceDemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class EleAndMeth2 extends Baseclass{
	
	//Sort
	@FindBy(xpath = "//select[@class='product_sort_container']")WebElement sortBT;
	@FindBy(xpath = "//option[@value='az']")WebElement a_z;
	@FindBy(xpath = "//option[@value='za']")WebElement z_a;
	@FindBy(xpath = "//option[@value='lohi']")WebElement lo_hi;
	@FindBy(xpath = "//option[@value='hilo']")WebElement hi_lo;
	
	//Sicial Media Pages
	@FindBy(xpath = "//a[text()='Twitter']")WebElement twitter;
	@FindBy(xpath = "//a[text()='Facebook']")WebElement facebook;
	@FindBy(xpath = "//a[text()='LinkedIn']")WebElement linkedIn;
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[1]/h1/a/div/svg/g/path")WebElement twitterLogo;
	@FindBy(xpath = "/html/body/div[1]/header/nav/a/icon/svg")WebElement linkedInLogo;
	@FindBy(xpath = "//*[@id=\"mount_0_0_1v\"]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/i")WebElement closeFacebookLogin;
	@FindBy(xpath = "//*[@id=\"mount_0_0_1v\"]/div/div[1]/div/div[2]/div[2]/div[1]")WebElement facebookLogo;
	
		EleAndMeth2(WebDriver d){
			driver=d;
			PageFactory.initElements(driver, this);}

		public void clickSortBT() {
			sortBT.click();
		}
		public void clickA_ZSort() {
			a_z.click();
		}
		public void clickZ_ASort() {
			z_a.click();
		}
		public void clickLo_HiSort() {
			lo_hi.click();
		}
		public void clickHi_LoSort() {
			hi_lo.click();
		}
		
		public void switchBackToPreviousTab() {
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
		}
		public void clickTwittert() {
			twitter.click();
		}
		public void clickFacebook() {
			facebook.click();
		}
		public void clickLinkedIn() {
			linkedIn.click();
		}
		
}
