package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	//@FindBy(xpath="//p[text()='Manage Footer Text']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement ManageFooteTextmoreinfo;
	@FindBy(xpath="(//a[contains(@href,'Footertext/edit')])[1]")WebElement actionButton1;
	@FindBy(xpath="(//a[contains(@href,'Footertext/edit')])[2]")WebElement actionButton2;
	@FindBy(xpath="//textarea[@id='content']")WebElement address;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@name='Update']")WebElement updateButton;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement greenAlertmsg;
	public WebDriver driver;
	public ManageFooterTextPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	/*public void clickOnManageFooterTestPageMoreInfo()
	{
		ManageFooteTextmoreinfo.click();
	}*/
	public ManageFooterTextPage clickOnAction()
	{
		actionButton1.click();
		return this;
	}
	public ManageFooterTextPage enterAddress(String addressvalue)
	{
		address.clear();
		address.sendKeys(addressvalue);
		return this;
	}
	public ManageFooterTextPage enterEmail(String emailValue)
	{
		email.clear();
		email.sendKeys(emailValue);
		return this;
	}
	public ManageFooterTextPage enterPhoner(String phoneNumber)
	{
		phone.clear();
		phone.sendKeys(phoneNumber);
		return this;
	}
	public ManageFooterTextPage clickOnUpdate()
	{
		updateButton.click();
		return this;
	}
	public boolean isAlertMsgDispalyed()
	{
		return greenAlertmsg.isDisplayed();
	}

}
