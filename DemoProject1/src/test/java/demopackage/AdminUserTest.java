package demopackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.Loginpage;
import utilites.FakeUtility;

public class AdminUserTest extends Base{
	@Test

	public  void AdminUserInformation()throws IOException
	{
		
		String user="admin";
		String pass="admin";
        Loginpage loginpage = new Loginpage(driver);
        loginpage.enterUsername(user);
        loginpage.enterPassword(pass);
        loginpage.clicksignInButton();

        AdminUserPage adminpage = new AdminUserPage(driver);
        adminpage.ClickMoreInfo();
        adminpage.clickNewButton();

        FakeUtility fakerutility = new FakeUtility();
        String username = fakerutility.creatARandomFirstName();
        String password = fakerutility.creatARandomFirstName();

        adminpage.enterUsername(username);
        adminpage.enterPassword(password);
        adminpage.selectUserType();
        adminpage.clickNewButton();

         boolean alertdisplayed = adminpage.isAlertDisplayed();
         Assert.assertTrue(alertdisplayed);
        
    }
}
	


