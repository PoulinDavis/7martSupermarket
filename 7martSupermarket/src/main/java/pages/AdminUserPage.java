package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
	//@FindBy(xpath="//p[text()='Admin Users']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement adminUsermoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
	@FindBy(xpath="//button[contains(text(),'Save')]")WebElement savebutton;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement greenalertmsg;
	@FindBy(xpath="//div[contains(@class,'alert-danger')]")WebElement redalertmsg;
	
	public WebDriver driver;
	public AdminUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	/*public void clickOnAdminUserMoreInfo()
	{
		adminUsermoreinfo.click();
	}*/
	public AdminUserPage clickOnNew()
	{
		newbutton.click();
		return this;
	}
	public AdminUserPage enterUserName(String usernameValue)
	{
		username.sendKeys(usernameValue);
		return this;
	}
	public AdminUserPage enterPassword(String passwordValue)
	{
		password.sendKeys(passwordValue);
		return this;
	}
	public AdminUserPage userTypeDropDown()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.selectByIndexMethod(usertype,1);
		return this;
	}
	public AdminUserPage clickOnSave()
	{
		savebutton.click();
		return this;
	}
	public boolean isGreenAlertMsgDispalyed()
	{
		return greenalertmsg.isDisplayed();
	}
	public boolean isRedAlertMsgDispalyed()
	{
		return redalertmsg.isDisplayed();
	}
	
	
	

}
