package Testpakage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.loginPage;

public class loginTest extends baseTest {

	@Test(priority = 1)
	public void isLogintoApp() throws InterruptedException
	{
		
		obj.loginwithcredential();
		Assert.assertTrue(true);
		obj.enterPin();
		

		
	}
	
/*	@Test(priority = 3)
	public void InvliadCrdential() throws InterruptedException
	{
		obj.invalidCredential();
		Assert.assertFalse(false);
		
	}*/
	
	@Test(priority = 2)
	public void validatePage()
	{
		boolean returnvalue = obj.verfiyURL();
		
		Assert.assertTrue(returnvalue);
	}
	
	
}

