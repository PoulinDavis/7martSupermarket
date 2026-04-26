package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageCategoryPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	HomePage homepage;
	ManageCategoryPage managecategorypage;
	@Test(description="Checking whether admin able to manage category")
	public void isAdminAbleToManageCategorymethod() throws IOException, AWTException
	{
		String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
		//LogOutPage logoutpage=new LogOutPage(driver);
		//creating object to call methods in page class
		LogInPage loginpage=new LogInPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		//ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
		managecategorypage=homepage.clickOnManageCategoryMoreInfo();
		managecategorypage.clickOnNew();
		String categoryvalue=ExcelUtility.getStringData(0, 0, "category");
		managecategorypage.enterCategory(categoryvalue).clickOnSelectGroup().imageUpload(Constant.TESTAPPLEIMG).ontopMenuYesClick()
		.onleftMenuYesClick().clickOnSave();
		//managecategorypage.clickOnSelectGroup();
		//managecategorypage.imageUpload(Constant.TESTAPPLEIMG);
		//managecategorypage.ontopMenuNoClick();
		//managecategorypage.onleftMenuYesClick();
		//managecategorypage.clickOnSave();
		boolean alertmsg=managecategorypage.isAlertMsgDispalyed();
		Assert.assertTrue(alertmsg);
		
	}

}
