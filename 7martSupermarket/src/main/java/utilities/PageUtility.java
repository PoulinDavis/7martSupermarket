package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	 WebDriver driver;
		public void selectByVisibleTextMethod(WebElement element,String text) {
		Select select=new Select(element);	
		select.selectByVisibleText(text);
		}
		
		public void selectByValueMethod(WebElement element,String value) {
			Select select=new Select(element);	
			select.selectByValue(value);
			}
		
		public void selectByIndexMethod(WebElement element,Integer index) {
			Select select=new Select(element);	
			select.selectByIndex(index);
			}
		//javascriptExecuter
		  public void scrollToElement(WebDriver driver,WebElement element) {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true);", element);
		    }
		  public void jsClick(WebDriver driver,WebElement element) {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", element);
		    }
		  //actions
		  public void hover(WebDriver driver,WebElement element) {
		        Actions action = new Actions(driver);
		        action.moveToElement(element).perform();
		    }
		  public void clickAction(WebDriver driver, WebElement clickElement) {
		        Actions actions = new Actions(driver);
		        actions.click(clickElement).build().perform();
		    }
		  public void dragAndDropAction(WebDriver driver,WebElement dragElement,WebElement dropElement) 
		  {
			  Actions actions = new Actions(driver);
			  actions.dragAndDrop(dragElement, dropElement).perform();
		  }
		  public void rightClick(WebDriver driver,WebElement element)
		  {
			  Actions actions = new Actions(driver);
			  actions.contextClick(element).perform();;
		  }
		  public void doubleClick(WebDriver driver,WebElement element)
		  {
			  Actions actions = new Actions(driver);
			  actions.doubleClick(element).perform();
		  }


}
