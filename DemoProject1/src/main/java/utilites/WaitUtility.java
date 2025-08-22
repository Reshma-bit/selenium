package utilites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final int IMPLICTWAIT=5;
	public static final int EXPLICTWAIT=10;

	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICTWAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
    public void waitForElementToBeSelected(WebDriver driver,WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICTWAIT));
    	wait.until(ExpectedConditions.elementToBeSelected(element));
    }
    public void waitForAlertIsPresent(WebDriver driver,WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICTWAIT));
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    	

    }
    public void waitForVisibilityofElement(WebDriver driver,WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICTWAIT));
	    wait.until(ExpectedConditions.visibilityOf(element));
    }
    
}
