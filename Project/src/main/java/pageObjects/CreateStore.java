package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateStore {
	
	public WebDriver driver = null;
	public CreateStore(WebDriver driver) {
		this.driver = driver;
	}
	public static String getCurrentTimeStamp(){
		Date dt = new Date();
		String timeStamp = new SimpleDateFormat("yymddhhmmsss").format(dt);
		return timeStamp;
	}
	
	public WebElement ClickStoreBTN() {
		return driver.findElement(By.xpath("(//a[contains(.,'Store')])[1]"));
	}
	
	public WebElement StoreName() {
		return driver.findElement(By.xpath("//input[@id='name']"));
	}
	
	public WebElement Store_DisplayName() {
		return driver.findElement(By.xpath("//input[@id='displayName']"));
	}
	
    
	public WebElement Store_BrandName() {
		return driver.findElement(By.xpath("//input[@id='brandName']"));
	}
		
	public WebElement Storedropdown() {
		return driver.findElement(By.id("storeId"));
	}
	
	public WebElement Store_address() {
		return driver.findElement(By.id("address1"));
	}
	
	public WebElement Store_Area() {
		return driver.findElement(By.id("address2"));
	}

	public WebElement Store_countryName() {
		return driver.findElement(By.xpath("//input[@id='autoSuggestCountry']"));
	}
	
	
	public void Country_select(String CountryName) {
	//	return driver.findElement(By.xpath("//div[@id='inputSuggestionCountry']//a"));
		
		Select country = new Select(driver.findElement(By.xpath("//div[@id='inputSuggestionCountry']")));
		country.selectByVisibleText(CountryName);
	}
	
	
	public WebElement Store_StateName() {
		return driver.findElement(By.xpath("//input[@id='autoSuggestState']"));
	}
	
	public WebElement State_select() {
			
		return driver.findElement(By.xpath("//*[@id=\"inputSuggestionState\"]/div/a[1]"));
		}
	
	
	
	public WebElement Store_CityName() {
		return driver.findElement(By.xpath("//input[@id='autoSuggestInput1']"));
	}
	
	public WebElement City_select() {
		
		return driver.findElement(By.xpath("//*[@id=\"inputSuggestion\"]/div/a[1]"));
		
	}

	
	
	public WebElement Store_Zip() {
		return driver.findElement(By.xpath("//input[@id='zip']"));
	}	
		
	public WebElement SaveStore() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		return driver.findElement(By.id("storeSubmit"));
	}
		
	public WebElement SuccessPopup() {
		return driver.findElement(By.xpath("//button[@type='button']"));
	}
	public WebElement ConfirmationText() {
		return driver.findElement(By.xpath("//html[1]/body[1]/div[18]/div[2]"));
	}
		
	
	
	
	
	
	
}