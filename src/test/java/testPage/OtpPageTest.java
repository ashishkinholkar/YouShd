package testPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;
import page.LoginPage;
import page.OtpPage;

public class OtpPageTest extends TestBase{
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
	}
	
	@Test (enabled=false)
	public void verifyOtpBoxTest() throws Exception
	{
		/*hp.verifyLoginBtn();
		lp.verifyDropDown();
		lp.verifyContinueBtn();*/
		otp.verifyOtpBox();
		Object a = otp.url();
		System.out.println(a);
		
	}
	
	
	@Test (enabled=true)
	public void verifyContinueBtnTest() throws Exception
	{
		/*hp.verifyLoginBtn();
		lp.verifyDropDown();
		lp.verifyContinueBtn();*/
		otp.verifyOtpBox();
		otp.verifyContinueBtn();
		Object a = otp.url();
		System.out.println(a);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
