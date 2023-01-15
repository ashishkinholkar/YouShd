package page;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//p[text()='Please enter your phone number to get started']") private WebElement mobText;
	@FindBy(xpath="//div[@class='selected-flag']") private WebElement flagDropDown;
	@FindBy(xpath="//input[@class='search-box']") private WebElement searchBox;
	@FindBy(xpath="//li[@data-country-code='in']")private WebElement indianFlag;
	@FindBy(xpath="//input[@name='phoneNo']")private WebElement phoneNumber;
	@FindBy(xpath="//button[@class='button-continue ']")private WebElement continueBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyMobText()
	{
		return mobText.isDisplayed();
	}
	public void verifyDropDown()
	{
		flagDropDown.click();
		Actions a = new Actions(driver);
		a.moveToElement(searchBox).sendKeys("India").build().perform();
		a.moveToElement(indianFlag).click().build().perform();
		
		phoneNumber.sendKeys("1234567890");
	}
	
	public void verifyContinueBtn()
	{
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		myWait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();",continueBtn);
	    
	}
	
	
		

}
