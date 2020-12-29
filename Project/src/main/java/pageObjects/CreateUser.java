package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUser {
	
	public WebDriver driver = null;
	public CreateUser(WebDriver driver) {
		this.driver = driver;
}
	public WebElement ClickUserBTN() {
		return driver.findElement(By.xpath("(//a[contains(.,'User')])[1]"));
}
	
}