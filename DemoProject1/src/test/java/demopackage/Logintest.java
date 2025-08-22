package demopackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Logintest extends Base {
	
	@Test(priority=1,groups= {"regression"},retryAnalyzer=retry.Retry.class)
	public void loginwithvalidCredential()
	{
		String user="admin";
		String pass="admin";
		Loginpage loginpage= new Loginpage(driver);
	
		loginpage.enterUsername(user);
		loginpage.enterPassword(pass);
		loginpage.clicksignInButton();
		boolean ishomepageDisplayed=loginpage.isHomepageLoaded();
		Assert.assertTrue(ishomepageDisplayed);


	}
	@Test (priority=2)
	public void loginWithInvalidCredentials() {
		String user="adm";
		String pass="123";
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUsername(user);
		loginpage.enterPassword(pass);
		loginpage.clicksignInButton();
		
		boolean isAlertMessageDisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed);
		
		
		
	}
	@Test(groups={"regression"})
	public void loginUsernameIncorrectPasswordCorrect()
	{
		
		String user="1234";
		String pass="admin";
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterPassword(pass);
		loginpage.enterUsername(user);
		boolean isAlertMessageDisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed);

		
	}
	@Test(groups= {"regression"})
	public void loginUsernamaIncorrectPasswordCorrect()
	{
		String user="llll";
		String pass="ooo";
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterPassword(pass);
		loginpage.enterUsername(user);
		boolean isAlertMessageDisplayed=loginpage.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed);

		

	}
	


}
