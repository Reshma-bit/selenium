package demopackage;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageNews;
import utilites.ExcelUtility;


public class ManagementNewsTest extends Base {
	

	@Test(groups= {"regression"},description="to add a news")
	public void manageNews() throws IOException
	{
		/*String news="New news is added";
		String user="admin";
		String pass="admin";*/
		String user=ExcelUtility.getStringData(1, 0, "login page");
		String pass=ExcelUtility.getStringData(1, 1, "login page");
		String news=ExcelUtility.getStringData(1, 0,"ManageNews");
		
	Loginpage loginpage=new Loginpage(driver);
	loginpage.enterUsername(user);
	loginpage.enterPassword(pass);
	loginpage.clicksignInButton();
	ManageNews managepage=new ManageNews(driver);
	managepage.clickMoreInfo();
	managepage.clicknews();
	
	managepage.newsText(news);
	managepage.clickSaveButton();
	
	boolean alertdisplayed=managepage.isAlertDisplayed();
	Assert.assertTrue(alertdisplayed);
	
	}
	@Test
	public void newsUpdate()throws IOException
	{
		/*String news="This is the updated news";
		String user="admin";
		String pass="admin";*/
		String user=ExcelUtility.getStringData(1, 0,"login page");
		String pass=ExcelUtility.getStringData(1, 1,"login page");
		String news=ExcelUtility.getStringData(1, 1, "ManageNews");
	Loginpage loginpage=new Loginpage(driver);
	loginpage.enterUsername(user);
	loginpage.enterPassword(pass);
	loginpage.clicksignInButton();
	ManageNews managenews=new ManageNews(driver);
	managenews.clickMoreInfo();
	managenews.clickTheUpdateButton();
	managenews.enterUpdatedNews(news);
	managenews.clickSaveButton();
	
	boolean alertdisplayed=managenews.isAlertDisplayed();
	Assert.assertTrue(alertdisplayed);
}

}
	

	
	
	


	
		

	

		

		

	


