package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {
	//@FindBy(xpath="//p[text()='Manage Category']/ancestor::div[contains(@class,'small-box')]//a[contains(text(),'More info')]")WebElement manageCategorymoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newButton;
	@FindBy(xpath="//input[@id='category']")WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']/child::span[text()='discount']")WebElement selectGroups;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//input[@name='top_menu' and @value='yes']")WebElement showOnTopMenuYes;
	@FindBy(xpath="//input[@name='top_menu' and @value='no']")WebElement showOnTopMenuNo;
	@FindBy(xpath="//input[@name='show_home' and @value='yes']")WebElement showOnLeftMenuYes;
	@FindBy(xpath="//input[@name='show_home' and @value='yes']")WebElement showOnLeftMenuNo;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement greenAlertmsg;
	public WebDriver driver;
	public ManageCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialis webelements
	}
	/*public void clickOnManageCategoryMoreInfo()
	{
		manageCategorymoreinfo.click();
	}*/
	public ManageCategoryPage clickOnNew()
	{
		newButton.click();
		return this;
	}
	public ManageCategoryPage enterCategory(String categoryvalue)
	{
		category.sendKeys(categoryvalue);
		return this;
	}
	public ManageCategoryPage clickOnSelectGroup()
	{
		selectGroups.click();
		return this;
	}
	public ManageCategoryPage imageUpload(String path) throws AWTException
	{
		PageUtility pageutility=new PageUtility();
		pageutility.scrollToElement(driver,choosefile);
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.fileUploadUsingRobotClass(choosefile,path);
		return this;
	}
	public ManageCategoryPage ontopMenuYesClick() 
	{
		showOnTopMenuYes.click();
		return this;
	}
	public ManageCategoryPage ontopMenuNoClick()
	{
		showOnTopMenuNo.click();
		return this;
	}
	public ManageCategoryPage onleftMenuYesClick()
	{
		showOnLeftMenuYes.click();
		return this;
	}
	public ManageCategoryPage onleftMenuNoClick()
	{
		showOnLeftMenuNo.click();
		return this;
	}
	public ManageCategoryPage clickOnSave() 
	{
		save.click();
		return this;
	}
	public boolean isAlertMsgDispalyed()
	{
		return greenAlertmsg.isDisplayed();
	}
	

}
