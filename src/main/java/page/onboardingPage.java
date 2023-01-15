package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class onboardingPage extends TestBase{
	
	//Object repository
	@FindBy(xpath="//button[text()='Continue']")private WebElement welcomeBtn;
	@FindBy(xpath="//button[text()='Continue']")private WebElement shopBtn;
	@FindBy(xpath="//button[text()='Continue']")private WebElement postBtn;
	@FindBy(xpath="//button[text()='Continue']")private WebElement earnBtn;
	
	
	public onboardingPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void verifyButtons()
	{
		welcomeBtn.click();
		shopBtn.click();
		postBtn.click();
		earnBtn.click();
	}
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}

}
