package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	HomePage homepage;
	AdminUserPage adminuserpage;
	@Test(retryAnalyzer=retry.Retry.class)
	public void enterAdminUser() throws IOException {
	String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
	String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
	//LogOutPage logoutpage=new LogOutPage(driver);
	//AdminUserPage adminuserpage=new AdminUserPage(driver);
	//creating object to call methods in page class
	LogInPage loginpage=new LogInPage(driver);
	loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
	//loginpage.enterPassword(passwordValue);
	homepage=loginpage.clickOnSignIn();
	adminuserpage=homepage.clickOnAdminUserMoreInfo().clickOnNew();
	//adminuserpage.clickOnNew();
	FakerUtility fakerutility=new FakerUtility();
	String username=fakerutility.createRandomFirstName();
	String password=fakerutility.generatePassword();
	adminuserpage.enterUserName(username).enterPassword(passwordValue).userTypeDropDown().clickOnSave();
	//adminuserpage.enterPassword(password);
	//adminuserpage.userTypeDropDown().clickOnSave();
	//adminuserpage.clickOnSave();
	boolean alertmesg=adminuserpage.isGreenAlertMsgDispalyed();
	Assert.assertTrue(alertmesg,Constant.VALIDADMINUSER);
	
	
	}

}
