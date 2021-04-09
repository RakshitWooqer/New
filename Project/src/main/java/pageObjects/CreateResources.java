package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateResources {
	//User clicks on the manage Pi tab
	public WebDriver driver = null;
	
	public CreateResources(WebDriver driver) {
		this.driver = driver;
	}
	public static String getCurrentTimeStamp(){
		Date dt = new Date();
		String timeStamp = new SimpleDateFormat("yymddhhmmsss").format(dt);
		return timeStamp;
	}
	public String ResourceName = "Resource " + getCurrentTimeStamp();
	
	
	public WebElement ClickResourcestab() {
		return driver.findElement(By.xpath("//a[text()='Resources']"));
	}
	
	public WebElement click_AddResource() {
		return driver.findElement(By.xpath("//span[text()='Add New']"));
	}
	
	public void resource_name() {
		driver.findElement(By.id("name")).sendKeys(ResourceName);
	}
	
    public WebElement resource_Defination() {
		return driver.findElement(By.id("definition"));
	}
		
	public WebElement store_radiobtn() {
		return driver.findElement(By.id("type2"));
	}
		
	
	public WebElement select_Stores() {
		return driver.findElement(By.id("resourceSelectInitial"));
	}
	
	public WebElement select_all() {
		return driver.findElement(By.id("selectAll"));
	}

	
	public WebElement Select_doneBtn() {
		return driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]"));
	}
	
	public WebElement manager() {
		return driver.findElement(By.xpath("//input[@id='managerName']"));
	}
	
	
	public WebElement selectManagerName() {
		return driver.findElement(By.xpath("//*[@id='autocompleteDiv']/div[1]"));
	}
	
	
		
	public WebElement SaveResource() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
		}
		return driver.findElement(By.xpath("//input[@id='resourceFormSubmitButton']"));
	}
		
	public void searchResource() {
		 driver.findElement(By.xpath("//input[@id='evaluateeSearch']")).sendKeys(ResourceName);
	}
	public void ConfirmationResource() {
		if(driver.findElement(By.xpath("//*[@class='pinkBoldText']//*[contains(text(),'"+ ResourceName +"')]")).isDisplayed()) {
			System.out.println("Resource created succesfully");
		}
		else 
			System.out.println("Resouce not created");
	}
		
	
	
	
	
	
	
}