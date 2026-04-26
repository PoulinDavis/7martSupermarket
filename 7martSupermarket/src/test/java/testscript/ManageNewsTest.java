package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.HomePage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNewsPage managenewspage;
	
	@Test (description="Checking whether admin able to manage news")
	public void isAdminAbleToEnterNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
		//LogOutPage logoutpage=new LogOutPage(driver);
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		//creating object to call methods in page class
		LogInPage loginpage=new LogInPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		managenewspage=homepage.clickOnManageNewsMoreInfo();
		String news=ExcelUtility.getStringData(0, 0, "news");
		managenewspage.clickOnNew().enterNews(news).clickOnSave();
		//managenewspage.enterNews(news);
		//managenewspage.clickOnSave();
		boolean alertmesg=loginpage.isAlertMsgDispalyed();
		Assert.assertTrue(alertmesg);
		
		
	}
	

}
