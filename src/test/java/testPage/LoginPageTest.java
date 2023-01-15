package testPage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;
import page.LoginPage;

public class LoginPageTest  extends TestBase {
	LoginPage lp;
	HomePage hp;
	
	@BeforeMethod
	public void setup()
	{
		initialisation();
		hp = new HomePage();
		lp = new LoginPage();
	}
	
	@Test (enabled=false)
	public void verifyUrlTest()
	{
		hp.verifyLoginBtn();
		String actUrl = "https://app.youshd.com/login";
		String ExpUrl = lp.verifyUrl();
		Assert.assertEquals(actUrl, ExpUrl);
	}
	
	@Test (enabled=false)
	public void verifyTitleTest()
	{
		hp.verifyLoginBtn();
		String actTitle = "Youshd";
		String expTitle = lp.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test (enabled=false)
	public void verifyMobTextTest()
	{
		hp.verifyLoginBtn();
		lp.verifyMobText();
	}
	
	@Test(enabled=true)
	public void verifyDropDownTest()
	{
		hp.verifyLoginBtn();
		lp.verifyDropDown();
		lp.verifyContinueBtn();
	}
	@Test(enabled=false)
	public void verifyOtpBoxTest()
	{
		hp.verifyLoginBtn();
		lp.verifyContinueBtn();

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
