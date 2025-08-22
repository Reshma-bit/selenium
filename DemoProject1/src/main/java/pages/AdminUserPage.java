package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilites.PageUtility;


public class AdminUserPage {
	WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassociates.com/admin/list-admin' and @class='small-box-footer']")WebElement moreinfo;   
    @FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newbutton;    
    @FindBy(xpath = "//input[@id='username']")WebElement usernametext; 
    @FindBy(xpath = "//input[@id='password']")WebElement passwordtext;
    @FindBy(xpath = "//select[@id='user_type']") WebElement usertypeselect; 
    @FindBy(xpath = "//button[@type='submit' and @name='Create']") WebElement savebutton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
    

public void ClickMoreInfo()
{
	moreinfo.click();
}
public void clickNewButton()
{
	newbutton.click();
}
public void enterUsername(String username)
{
   usernametext.clear();
   usernametext.sendKeys(username);
}
public void enterPassword(String password) {
	passwordtext.clear();
	passwordtext.sendKeys(password);
}
public void selectUserType() 
{
  usertypeselect.click();
 Select select = new Select(usertypeselect);
	select.selectByVisibleText("Admin");
	PageUtility pageutility = new PageUtility();
	pageutility.selectBYVisibleText(usertypeselect," Admin");
}
public void clickSaveButton()
{
	savebutton.click();
}
public boolean isAlertDisplayed() {

	return alert.isDisplayed();
}
}
