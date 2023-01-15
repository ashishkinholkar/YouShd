package testPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;
import page.LoginPage;
import page.OtpPage;
import page.onboardingPage;

public class onboardingPageTest extends TestBase{
	onboardingPage obp ;
	OtpPage otp;
	LoginPage lp;
	HomePage hp;
	
	@BeforeMethod
	public void setup()
	{
		initialisation();
		hp = new HomePage();
		lp = new LoginPage();
		otp = new OtpPage();
		obp = new onboardingPage();
	}
	
	@Test()
	public void verifyButtonsTest()
	{
		hp.verifyLoginBtn();
		lp.verifyDropDown();
		lp.verifyContinueBtn();
		otp.verifyOtpBox();
		otp.verifyContinueBtn();
		obp.verifyButtons();
		
		obp.verifyUrl();
		String actUrl="";
		String expUrl=obp.verifyUrl();
		Assert.assertEquals(actUrl, expUrl);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
