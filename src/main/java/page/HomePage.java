package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	//Object Repsitory
	
	@FindBy(xpath="//img[@alt='YouShd logo']")private WebElement logo;
	@FindBy(xpath="//div[@class='login-sign-para-top']") private WebElement text;
	@FindBy(xpath="//img[@alt='logindog']")private WebElement loginDog;
	@FindBy(xpath="//button[@class='btn-login btn-black']") private WebElement loginBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLogo()
	{
		return logo.isDisplayed();
	}
	
	public boolean verifyText()
	{
		return text.isDisplayed();
	}
	
	public boolean verifyloginDogLogo()
	{
		return loginDog.isDisplayed();
	}
	
	public void verifyLoginBtn()
	{
		loginBtn.click();
	}
}
