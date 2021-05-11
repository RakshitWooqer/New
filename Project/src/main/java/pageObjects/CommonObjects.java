package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonObjects {
	
	public WebDriver driver = null;
	public CommonObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SelectFile_local(WebElement locator, String filePath) {
		//	 WebElement element=driver.findElement(LocatorSplit.splitLocatorString(locatorVariable));
			  WebElement element1=locator;
			  element1.sendKeys(filePath);	
			
		}
	
	
	
	
	
	public static String getCurrentTimeStamp(){
		Date dt = new Date();
		String timeStamp = new SimpleDateFormat("yymddhhmmsss").format(dt);
		return timeStamp;
	}

}
