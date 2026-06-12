package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest {
	
	@Test
	public void testStandardUser() {
		
		Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test");
		LoginPage myLoginPage = new LoginPage(driver);
		test.info("Navigated to login page");
		
		Log.info("Adding credentials");
		myLoginPage.enterUsername("standard_user");
		myLoginPage.enterPassword("secret_sauce");
		myLoginPage.clickLogin();
		test.info("Entered credentials and clicked login");
		
		
		System.out.println("Title of the page is: " + driver.getTitle());
		Log.info("Verifying page title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		test.pass("Login Successful");
	}
	
	
	@Test
	/*public void testInvalidCredentials() {
		
		Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test with invalid credentials");
		LoginPage myLoginPage = new LoginPage(driver);
		test.info("Navigated to login page");
		
		Log.info("Adding credentials");
		myLoginPage.enterUsername("standard_user123456");
		myLoginPage.enterPassword("secret_sauce123456");
		myLoginPage.clickLogin();
		test.info("Entered credentials and clicked login");
		
		
		System.out.println("Title of the page is: " + driver.getTitle());
		Log.info("Verifying page title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Swag Labs123");
		test.pass("Login Successful");
	}*/
	

}
