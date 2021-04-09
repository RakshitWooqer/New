	package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRole {
	//User clicks on the manage Pi tab
	public WebDriver driver = null;
	
	public CreateRole(WebDriver driver) {
		this.driver = driver;
	}
	public static String getCurrentTimeStamp(){
		Date dt = new Date();
		String timeStamp = new SimpleDateFormat("yymddhhmmsss").format(dt);
		return timeStamp;
	}
	public String RolesName = "Roles " + getCurrentTimeStamp();
	
	
	public WebElement ClickRolestab() {
		return driver.findElement(By.xpath("//a[contains(text(),'Roles')]"));
	}
	
	public WebElement click_AddRoles() {
		return driver.findElement(By.xpath("//span[text()='Add New']"));
	}
	
	public void roles_name() {
		driver.findElement(By.id("roleNameInput")).sendKeys(RolesName);
	}
	
    public WebElement role_selectFunctionDropdown() {
		return driver.findElement(By.id("functionId"));
	}
		
	public WebElement selectoption_FromDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"functionId\"]/option[4]"));
	}
		
	
	public WebElement select_Topline_checkbox() {
		return driver.findElement(By.id("impactTopline1"));
	}
	
//	public WebElement select_all() {
//		return driver.findElement(By.id("selectAll"));
//	}
//
//	
//	public WebElement Select_doneBtn() {
//		return driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]"));
//	}
//	
//	public WebElement manager() {
//		return driver.findElement(By.xpath("//input[@id='managerName']"));
//	}
//	
//	
//	public WebElement selectManagerName() {
//		return driver.findElement(By.xpath("//*[@id='autocompleteDiv']/div[1]"));
//	}
//	
//	
		
	public WebElement SaveRole() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
		}
		return driver.findElement(By.xpath("//input[@id='roleSubmit']"));
	}
		
	public void searchRole() {
		 driver.findElement(By.xpath("//input[@id='chapterSearch']")).sendKeys(RolesName);
	}
	public void ConfirmationRole() {
		if(driver.findElement(By.xpath("//*[@class='pinkBoldText']//*[contains(text(),'"+ RolesName +"')]")).isDisplayed()) {
			System.out.println("Roles created succesfully");
		}
		else 
			System.out.println("Roles not created");
	}
		
	
	
	
	
	
	
}