package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class Login{
	public WebDriver driver = null;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement usernameBTN() {
		return driver.findElement(By.xpath("//input[@id='j_username']"));
	}
	
	public WebElement passwordBTN() {
		return driver.findElement(By.xpath("//input[@id='j_password']"));
	}
	
	public void loginclk() {
		
		driver.findElement(By.xpath("//button[@id='loginSubImg1']")).click();
	}
	
	public WebElement HomepageTitle() {
		return driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
	}
	
	public WebElement managePi() {
		return driver.findElement(By.id("switchPiTabLink"));
	}
	
	public void BrowserClose() {
		driver.close();
	}
}