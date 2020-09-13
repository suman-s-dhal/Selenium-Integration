package tests;

import static base.TestBase.initialization;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import util.TestUtil;

import static base.TestBase.browser;
	
public class LoginTest {
	LoginPage LoginPage;
	SoftAssert softAssert = new SoftAssert();
	  
	@BeforeClass
	public void setUp(){
		initialization();
	    LoginPage = new LoginPage();
	       
	    }

	@Test
	public void login() throws InterruptedException
	{
		pages.LoginPage.signin();	
		browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	//@AfterClass
    //public void tearDown() {
      // browser.quit();
    //}
}