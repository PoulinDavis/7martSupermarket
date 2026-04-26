package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	HomePage homepage;
	@Test
	public void logoutSesson() throws IOException
	{
		
		String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
		//HomePage logoutpage=new HomePage(driver);
		//creating object to call methods in page class
		LogInPage loginpage=new LogInPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		homepage.clickOnAdmin().clickOnLogout();
		//homepage.clickOnLogout();
		boolean signin=homepage.isSignInButtonDisapled();
		Assert.assertTrue(signin);
	}
	

}
