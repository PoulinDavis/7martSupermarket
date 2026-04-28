package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LogInPage;
import utilities.ExcelUtility;

public class LogInTest extends Base {
	HomePage homepage;
	@Test(priority=1,groups= {"regression"},description="verifyTheUserisAbleToSignInUsingValidCredentials")
	public void verifyTheUserisAbleToSignInUsingValidCredentials() throws IOException
	{
		//String usernameValue="admin";
		//String passwordValue="admin";
		String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
		LogInPage loginpage=new LogInPage(driver);//creating object to call methods in page class
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean homePage=loginpage.isHomePageDispalyed();
		Assert.assertTrue(homePage,Constant.VALIDCREDENTIALS);
	}
	
	@Test(description="verifyTheUserisAbleTosignInUsingInValidCredentials")
	public void verifyTheUserisAbleTosignInUsingInValidCredentials() throws IOException
	{
		//String usernameValue="User";
		//String passwordValue="User";
		String usernameValue=ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "loginpage");
		LogInPage loginpage=new LogInPage(driver);//creating object to call methods in page class
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean alertmsg=loginpage.isAlertMsgDispalyed();
		Assert.assertTrue(alertmsg,Constant.INVALIDCREDENTIALS);
	}
	
	@Test(description="verifyTheUserisAbleToSignInUsingValidUsernameAndInvalidPassword")
	public void verifyTheUserisAbleToSignInUsingValidUsernameAndInvalidPassword() throws IOException
	{
		//String usernameValue="admin";
		//String passwordValue="User";
		String usernameValue=ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "loginpage");
		LogInPage loginpage=new LogInPage(driver);//creating object to call methods in page class
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean alertmsg=loginpage.isAlertMsgDispalyed();
		Assert.assertTrue(alertmsg,Constant.INVALIDCREDENTIALS);
	}
	
	@Test(description="verifyTheUserisAbleToSignInUsingInValidUsernameAndValidPassword")
	public void verifyTheUserisAbleToSignInUsingInValidUsernameAndValidPassword() throws IOException
	{
		//String usernameValue="User";
		//String passwordValue="admin";
		String usernameValue=ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(4, 1, "loginpage");
		LogInPage loginpage=new LogInPage(driver);//creating object to call methods in page class
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		boolean alertmsg=loginpage.isAlertMsgDispalyed();
		Assert.assertTrue(alertmsg,Constant.INVALIDCREDENTIALS);
	}

}
