package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testStandardUser() {
		LoginPage myLoginPage = new LoginPage(driver);
		myLoginPage.enterUsername("standard_user");
		myLoginPage.enterPassword("secret_sauce");
		myLoginPage.clickLogin();
		
		System.out.println("Title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	

}
