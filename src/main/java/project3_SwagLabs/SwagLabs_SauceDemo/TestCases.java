package project3_SwagLabs.SwagLabs_SauceDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



public class TestCases extends Baseclass {
	ElementsAndMethods use;
	EleAndMeth2 use2;
	
	@Test(priority = 1, dataProvider = "dataData")
	public void TC1(String uid, String pass, String fname, String lname, String pcode) throws Exception{
		use = new ElementsAndMethods(driver);
		use.Login(uid, pass);
		//use.handleAlert();
		use.verifySite();
		use.addP1ToCart();
		use.clickBAckToProducts();
		use.clickCartIcon();
		use.clickContinueShopping();
		use.addP2ToCart();
		use.clickCartIcon();
		use.verifyProductsAreAdded();
		use.clickCheckOut();
		use.typeCheckoutDetailsAndContinue(fname, lname, pcode);
		use.verifyProductsAreAdded();
		use.clickFinish();
		use.clickBackHome();
		use.verifySite();
	}
	
	@Test(priority = 2, dataProvider = "dataData2")
	public void TC2(String uid, String pass) throws Exception{
		use = new ElementsAndMethods(driver);
		use2 = new EleAndMeth2(driver);
		use.Login(uid, pass);
		use2.clickSortBT();
		use2.clickA_ZSort(); use2.clickSortBT();
		use2.clickZ_ASort(); use2.clickSortBT();
		use2.clickLo_HiSort(); use2.clickSortBT();
		use2.clickHi_LoSort();
	}
	@Test(priority = 3, dataProvider = "dataData2")
	public void TC3(String uid, String pass) throws Exception{
		use = new ElementsAndMethods(driver);
		use2 = new EleAndMeth2(driver);
		use.Login(uid, pass);
		use2.clickTwittert();  use2.switchBackToPreviousTab();
		use2.clickFacebook();  use2.switchBackToPreviousTab();
		use2.clickLinkedIn();  use2.switchBackToPreviousTab();
		
	}
	
	@DataProvider (name = "dataData")
	public Object[][] data() {
		return new Object[][] {{"standard_user", "secret_sauce", "Excel", "RRRR", "454545"}};
	}
	@DataProvider (name = "dataData2")
	public Object[][] data2() {
		return new Object[][] {{"standard_user", "secret_sauce"}};
	}

}
