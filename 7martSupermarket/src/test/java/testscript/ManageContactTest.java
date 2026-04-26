package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import pages.ManageContactPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	HomePage homepage;
	ManageContactPage managecontactpage;
	
	@Test(retryAnalyzer=retry.Retry.class,description="Checking whether admin able to manage contact")
	public void isAdminAbleToManageContactMethod() throws IOException
	{
		String usernameValue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "loginpage");
		//LogOutPage logoutpage=new LogOutPage(driver);
		//ManageContactPage managecontactpage=new ManageContactPage(driver);
		//creating object to call methods in page class
		LogInPage loginpage=new LogInPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		//loginpage.enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		managecontactpage=homepage.clickOnManageContactMoreInfo();
		String phonevalue=ExcelUtility.getStringData(1, 0, "contact");
		String emailaddress=ExcelUtility.getStringData(1, 1, "contact");
		String address=ExcelUtility.getStringData(1, 2, "contact");
		String deliverytime=ExcelUtility.getStringData(1, 3, "contact");
		String deliverychargelimit=ExcelUtility.getStringData(1, 4, "contact");
		managecontactpage.clickOnActionButton().enterPhone(phonevalue).enterEmail(emailaddress)
		.enterAddress(address).enterDeliveryTime(deliverytime).enterDeliveryChargeLimit(deliverychargelimit)
		.clickOnUpdate();
		
		//managecontactpage.enterPhone(phonevalue);
		
		//managecontactpage.enterEmail(emailaddress);
		
		//managecontactpage.enterAddress(address);
		
		//managecontactpage.enterDeliveryTime(deliverytime);
		
		//managecontactpage.enterDeliveryChargeLimit(deliverychargelimit);
		//managecontactpage.clickOnUpdate();
		boolean alertmsg=managecontactpage.isAlertMsgDispalyed();
		Assert.assertTrue(alertmsg);
		
	}

}
