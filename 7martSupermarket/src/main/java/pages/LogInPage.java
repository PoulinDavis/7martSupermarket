package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement alertmsg;
public WebDriver driver;//instance through out class we can access
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	public LogInPage enterUserName(String usernameValue)
	{
		username.sendKeys(usernameValue);
		return this;
	}
	public LogInPage enterPassword(String passwordValue)
	{
		password.sendKeys(passwordValue);
		return this;
	}
	public HomePage clickOnSignIn()
	{
		/*WaitUtility waitutility=new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, signin);*/
		signin.click();
		return new HomePage(driver);
	}
	/*public void contryDropDown()
	{
		PageUtility pageutiliy=new PageUtility(country,"india");
	}*/
	public boolean isHomePageDispalyed()
	{
		return dashboard.isDisplayed();
		
	}
	public boolean isAlertMsgDispalyed()
	{
		return alertmsg.isDisplayed();
	}

}
