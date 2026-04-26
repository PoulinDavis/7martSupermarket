package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileUploadUsingSendkeys(WebElement element,String filePath)
	{
		element.sendKeys(filePath);
	}
	public void fileUploadUsingRobotClass(WebElement element,String filePath) throws AWTException
	{
		StringSelection stringselection=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		Robot robot=new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//to release keys
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
