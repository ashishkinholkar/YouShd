package testPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;


public class HomePageTest extends TestBase{
	HomePage hp;
	
	@BeforeMethod
	public void setup()
	{
		initialisation();
		hp = new HomePage();
	}
	
	
	@Test (enabled=false)
	public void verifyUrlTest()
	{
		String expUrl ="https://app.youshd.com/";
		String actUrl = hp.verifyUrl();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	@Test (enabled=false)
	public void verifyTitleTest()
	{
		String actTitle ="Youshd";
		String expTitle =hp.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test (enabled=false)
	public void verifyLogoTest()
	{
		boolean pic = hp.verifyLogo();
		Assert.assertEquals(pic, true);

	}
	@Test(enabled=false)
	public void verifyTextTest()
	{
		 boolean txt = hp.verifyText();
		 Assert.assertEquals(txt, true);
	}
	@Test (enabled=false)
	public void verifyloginDogLogoTest()
	{
		hp.verifyloginDogLogo();
	}
	
	@Test (enabled=true)
	public void verifyLoginBtnTest() 
	{
		hp.verifyLoginBtn();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
