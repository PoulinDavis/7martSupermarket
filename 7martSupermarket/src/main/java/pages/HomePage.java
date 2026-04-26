package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath="//a[@class='dropdown-item' and normalize-space()='Logout']")WebElement logout;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	
	@FindBy(xpath="//p[text()='Admin Users']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement adminUsermoreinfo;
	@FindBy(xpath="//p[text()='Manage Category']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement manageCategorymoreinfo;
	@FindBy(xpath="//p[text()='Manage Contact']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement manageContactmoreinfo;
	@FindBy(xpath="//p[text()='Manage Footer Text']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement ManageFooteTextmoreinfo;
	@FindBy(xpath="//p[text()='Manage News']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement manageNewsmoreinfo;
	public WebDriver driver;//instance through out class we can access
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	
	
	public AdminUserPage  clickOnAdminUserMoreInfo()
	{
		adminUsermoreinfo.click();
		return new AdminUserPage(driver);
	}
	public ManageCategoryPage clickOnManageCategoryMoreInfo()
	{
		manageCategorymoreinfo.click();
		return new ManageCategoryPage(driver);
	}
	public ManageContactPage clickOnManageContactMoreInfo()
	{
		manageContactmoreinfo.click();
		return new ManageContactPage(driver);
	}
	public ManageFooterTextPage clickOnManageFooterTestPageMoreInfo()
	{
		ManageFooteTextmoreinfo.click();
		return new ManageFooterTextPage(driver);
	}
	public ManageNewsPage clickOnManageNewsMoreInfo()
	{
		manageNewsmoreinfo.click();
		return new ManageNewsPage(driver);
	}
	
	
	public HomePage clickOnAdmin()
	{
		admin.click();
		return this;
	}
	public LogInPage clickOnLogout()
	{
		logout.click();
		return new LogInPage(driver);
	}
	public boolean isSignInButtonDisapled()
	{
		return signin.isDisplayed();
	}


}
