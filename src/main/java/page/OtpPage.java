package page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class OtpPage extends TestBase {
	//@FindBy(xpath="//div[@class='primary-text']")private WebElement primaryText;
	//OTP
		@FindBy(xpath="//input[@aria-label='Please enter verification code. Digit 1']")private WebElement digit1;
		@FindBy(xpath="//input[@aria-label='Digit 2']")private WebElement digit2;
		@FindBy(xpath="//input[@aria-label='Digit 3']")private WebElement digit3;
		@FindBy(xpath="//input[@aria-label='Digit 4']")private WebElement digit4;
		@FindBy(xpath="//input[@aria-label='Digit 5']")private WebElement digit5;
		@FindBy(xpath="//input[@aria-label='Digit 6']")private WebElement digit6;
	    @FindBy(xpath="//button[@class='button-continue']")private WebElement continueButton;
	    HomePage hp = new HomePage();
	    LoginPage lp= new LoginPage();
	public OtpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyOtpBox()
	{
		hp.verifyLoginBtn();
		lp.verifyDropDown();
		lp.verifyContinueBtn();
		digit1.sendKeys("1");
		digit2.sendKeys("2");
		digit3.sendKeys("3");
		digit4.sendKeys("4");
		digit5.sendKeys("5");
		digit6.sendKeys("6");
		continueButton.click();
	}
	
	public void verifyContinueBtn()
	{
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		myWait.until(ExpectedConditions.elementToBeClickable(continueButton));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();",continueButton);
	}
	
	public Object url()
	{
		return driver.getCurrentUrl();
	}
}
