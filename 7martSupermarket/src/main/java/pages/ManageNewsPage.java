package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	//@FindBy(xpath="//p[text()='Manage News']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement manageNewsmoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement newsTextbox;
	@FindBy(xpath="//button[text()='Save']")WebElement savebutton;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement alertmsg;
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	/*public void clickOnManageNewsMoreInfo()
	{
		manageNewsmoreinfo.click();
	}*/
	public ManageNewsPage clickOnNew()
	{
		newbutton.click();
		return this;
	}
	public ManageNewsPage enterNews(String news)
	{
		newsTextbox.sendKeys(news);
		return this;
	}
	public ManageNewsPage clickOnSave()
	{
		savebutton.click();
		return this;
	}
	public boolean isAlertMsgDispalyed()
	{
		return alertmsg.isDisplayed();
	}
	
	

}
