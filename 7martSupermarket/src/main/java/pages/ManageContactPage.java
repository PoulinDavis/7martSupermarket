package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	//@FindBy(xpath="//p[text()='Manage Contact']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement manageContactmoreinfo;
	@FindBy(xpath="//a[@role='button']")WebElement actionButton;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@placeholder='Enter the Address']")WebElement adress;
	@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")WebElement deliveryTime;
	@FindBy(xpath="//input[@id='del_limit']")WebElement deliveryChargeLimit;
	@FindBy(xpath="//button[@name='Update']")WebElement updateButton;
	@FindBy(xpath="//a[text()='Reset']")WebElement reset;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement greenAlertmsg;
	public WebDriver driver;
	public ManageContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	/*public void clickOnManageContactMoreInfo()
	{
		manageContactmoreinfo.click();
	}*/
	public ManageContactPage clickOnActionButton()
	{
		actionButton.click();
		return this;
	}
	public ManageContactPage enterPhone(String phonevalue)
	{
		phone.clear();
		phone.sendKeys(phonevalue);
		return this;
		
	}
	public ManageContactPage enterEmail(String emailaddress)
	{
		email.clear();
		email.sendKeys(emailaddress);
		return this;
	}
	public ManageContactPage enterAddress(String address)
	{
		adress.clear();
		adress.sendKeys(address);
		return this;
	}
	public ManageContactPage enterDeliveryTime(String deliverytime)
	{
		deliveryTime.clear();
		deliveryTime.sendKeys(deliverytime);
		return this;
	}
	public ManageContactPage enterDeliveryChargeLimit(String deliverychargelimt)
	{
		deliveryChargeLimit.clear();
		deliveryChargeLimit.sendKeys(deliverychargelimt);
		return this;
	}
	public ManageContactPage clickOnUpdate()
	{
		//updateButton.click();
		PageUtility pageutility=new PageUtility();
		pageutility.scrollToElement(driver,updateButton);
		pageutility.jsClick(driver,updateButton);
		return this;
		
	}
	public boolean isAlertMsgDispalyed()
	{
		return greenAlertmsg.isDisplayed();
	}
	

}
