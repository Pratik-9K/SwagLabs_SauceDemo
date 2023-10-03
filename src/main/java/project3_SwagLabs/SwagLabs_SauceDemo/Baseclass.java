package project3_SwagLabs.SwagLabs_SauceDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Baseclass {

	 WebDriver driver;
	 //Upto5 use;
	 
	 
	 @BeforeMethod
		public void startBrowser() throws Exception {
			System.setProperty("webdriver.edge.driver", 
					"E:\\ST by Manas\\JARs\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
}
