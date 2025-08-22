package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	@FindBy(xpath="//input[@id='login-button']")WebElement login;
	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUsername( String user)
	{
		username.clear();
		username.sendKeys(user);
	}
	public void enterPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	public void clicksignInButton()
	{
		signin.click();
	}
	public boolean isHomepageLoaded()
	{
		return dashboard.isDisplayed();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
	
	
}
  
  

	

  

