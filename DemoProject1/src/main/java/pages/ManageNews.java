package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and@class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement clicknews;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement newstext;
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	@FindBy(xpath="//a[contains(@href,page_ad=1')]")WebElement update;
	@FindBy(xpath="//textarea[@id='news']")WebElement updatednews;
	@FindBy(xpath="//button[@type='submit']")WebElement updatebutton;
	
	

	public WebDriver driver ;
		

	
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickMoreInfo()
	{
	moreinfo.click();	

		

	}
	public void clicknews() {
		clicknews.click();
		
	}
	public void newsText(String news)
	{
     newstext.clear();
     newstext.sendKeys(news);
	}
	public void clickSaveButton()
	{
		savebutton.click();
	}
	public void clickUpdateButton()
	{
		update.click();
	}
	public void enterUpdatedNews(String news)
	{
		updatednews.clear();
		updatednews.sendKeys(news);
	}
	public void clickTheUpdateButton()
	{
		updatebutton.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}

	 

}
	
	
	
	
	
	
	
	
	


