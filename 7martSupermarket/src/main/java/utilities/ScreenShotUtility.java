package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {
	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {
		//convert webdriver to screenshot mode.selenium webdriver canont take screenshot directly so we type cast to take screenshot
		TakesScreenshot scrShot = (TakesScreenshot) driver; // TakesScreenshot interface provided by tetng capture the current situation of the
			//this take the screenshot store it temprerly as a file												// browser
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//capture the screenshot,store in temporly as a fle
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//to identify date is class to get current date
		File f1 = new File(System.getProperty("user.dir") + "//outputScreenShot"); //// OutputScreenShot"-the scrrenshot
																					//// is generated in this folder ie
																					//// the loctn only
		if (!f1.exists()) {
			f1.mkdirs(); // if dir not exists,make it,create a folder if it does not exist 
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp//decide final screenshot path,nameing
				+ ".png";
		File finalDestination = new File(destination);//final destination
		FileHandler.copy(screenShot, finalDestination); // FileHandler-class,copr ss to final location no it is saved in permenantly in the folder
	}

}
