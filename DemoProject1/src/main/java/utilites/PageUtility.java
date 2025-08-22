package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectBYVisibleText(WebElement element,String visibleText)
	{
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);
	}
 public void selectBYValue(WebElement element,String value)
 {
	 Select  select=new Select(element);
	 select.selectByValue(value);
 }
 public void selectBYIndex(WebElement element,int index)
 {
	 Select select=new Select(element);
	 select.selectByIndex(index);
 }
 public void selectByMouseOver(WebDriver driver,WebElement element)
 {
	 Actions actions=new Actions(driver);
	 actions.moveToElement(element).perform();
	 
 }
 public void dragAndDrop(WebDriver driver,WebElement element)
 {
	 Actions actions=new Actions(driver);
	 actions.dragAndDrop(element, element);

 }
 public void rightClick(WebDriver driver,WebElement element)
 {
	 Actions actions=new Actions(driver);
    actions.contextClick();
	
 }
 public void click(WebDriver driver,WebElement element)
 {
	 Actions actions=new Actions(driver);
	 actions.click();

 }
}
