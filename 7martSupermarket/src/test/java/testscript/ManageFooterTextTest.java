package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageFooterTextTest extends Base {
	HomePage homepage;
	ManageFooterTextPage managefooterpage;
	
	@Test(description="Checking whether admin able to manage footer text")
	public void isAdminAbleToManageFooterTextMethod() throws IOException
	{
		
			String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
			String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
			//LogOutPage logoutpage=new LogOutPage(driver);
			
			//creating object to call methods in page class
			LogInPage loginpage=new LogInPage(driver);
			loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
			//loginpage.enterPassword(passwordValue);
			homepage=loginpage.clickOnSignIn();
			//ManageFooterTextPage managefooterpage=new ManageFooterTextPage(driver);
			managefooterpage=homepage.clickOnManageFooterTestPageMoreInfo();
			managefooterpage.clickOnAction();
			FakerUtility fakerutility=new FakerUtility();
			String addressvalue=fakerutility.generateAddress();
			String emailValue=fakerutility.generateEmail();
			String phonNumber=ExcelUtility.getStringData(0, 0, "footerPhone");
			managefooterpage.enterAddress(addressvalue).enterEmail(emailValue).enterPhoner(phonNumber).clickOnUpdate();
			//managefooterpage.enterEmail(emailValue)
			//managefooterpage.enterPhoner(phonNumber);
			//managefooterpage.clickOnUpdate();
			boolean alertmesg=managefooterpage.isAlertMsgDispalyed();
			Assert.assertTrue(alertmesg,Constant.VALIDFOOTERTEXT);
	}

}
