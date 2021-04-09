package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUser {
	
	public WebDriver driver = null;
	public CreateUser(WebDriver driver) {
		this.driver = driver;
	}
	public static String getCurrentTimeStamp(){
		Date dt = new Date();
		String timeStamp = new SimpleDateFormat("yymddhhmmsss").format(dt);
		return timeStamp;
	}
	
	public WebElement ClickUserBTN() {
		return driver.findElement(By.xpath("(//a[contains(.,'User')])[1]"));
	}
	
	public WebElement User_FirstName() {
		return driver.findElement(By.id("fname"));
	}
	
	public WebElement User_LastName() {
		return driver.findElement(By.id("lname"));
	}
	
    public WebElement User_Email() {
		return driver.findElement(By.id("emailInput"));
	}
		
	public WebElement Roledropdown() {
		return driver.findElement(By.id("organizationRole"));
	}
		public static String Storedropdown="id:storeId";
	
	public WebElement Storedropdown() {
		return driver.findElement(By.id("storeId"));
	}
	
	public WebElement Managerdropdown() {
		return driver.findElement(By.id("autoSuggestInput"));
	}

	public WebElement SelectManager() {
		return driver.findElement(By.xpath("//a[@id='USER']"));
	}
	
	
	public WebElement ContentCreation() {
		return driver.findElement(By.xpath("//input[@id='tccc1']"));
	}
	
	public WebElement ViewReports() {
		return driver.findElement(By.xpath("//input[@id='tcr1']"));
	}
	
	
	public WebElement HRViewRights() {
		return driver.findElement(By.xpath("//input[@id='tcc1']"));
	}
	
	
	public WebElement MessageInboxRights() {
		return driver.findElement(By.xpath("//input[@id='tci1']"));
	}
	
	public WebElement MediaManagementRights() {
		return driver.findElement(By.xpath("//input[@id='tcm1']"));
	}	
	
	
	public WebElement UserManagementRights() {
		return driver.findElement(By.xpath("//input[@id='um-chckbx']"));
	}	
		
	public WebElement SaveUser() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
		}
		return driver.findElement(By.id(""
				+ ""));
	}
		
	public WebElement SuccessPopup() {
		return driver.findElement(By.xpath("//button[@type='button']"));
	}
	public WebElement ConfirmationText() {
		return driver.findElement(By.xpath("//html[1]/body[1]/div[18]/div[2]"));
	}
		
	
	
	
	
	
	
}