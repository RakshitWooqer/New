package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login{
	public WebDriver driver = null;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement usernameBTN() {
		return driver.findElement(By.xpath("//input[@id='username']"));
	}
	
	public WebElement passwordBTN() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	
	public void loginclk() {
		driver.findElement(By.xpath("//div[@id='loginSubImg1']")).click();
	}
	
	public WebElement HomepageTitle() {
		return driver.findElement(By.xpath("//div[@class='user-name-greet']"));
}
}