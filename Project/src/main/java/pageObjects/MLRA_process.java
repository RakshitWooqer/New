package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import stepDefination.Login_steps;

public class MLRA_process {
	public static String ProcessName;
	
	public static WebDriver driver = null;
	
	public MLRA_process(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
  
		
		
	
   public WebElement gearIconQues1() {
	
	   return driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]/img[1]"));
	   
   }
   public WebElement gearIconQues2() {
		
	   return driver.findElement(By.xpath("//tbody/tr[2]/td[3]/a[1]/img[1]"));
	   
   }
   public WebElement gearIconQues3() {
		
	   return driver.findElement(By.xpath("//tbody/tr[3]/td[3]/a[1]/img[1]"));
	   
   }
   
   
   
   public WebElement requireActionCheckbox() {
		
	   return driver.findElement(By.xpath("//input[@id='reqAct']"));
	   
   }
   public WebElement requirelevelTextkbox() {
		
	   return driver.findElement(By.xpath("//input[@id='reqActLvlVal']"));	
	   
   }
   public WebElement quesConfigApplyBtn() {
		
	   return driver.findElement(By.xpath("//input[@type='submit']"));
	   
   }
 
   public WebElement closerConditionDoneBtn() {
		
	   return driver.findElement(By.xpath("//input[@id='submitBtn']"));
	   
   }
   public WebElement chooseOptionbasedClosure() {
		
	   return driver.findElement(By.xpath("//span[contains(text(),'Option based closure')]"));
	   
   }
   
   
   public void assignProcesstolevel1() throws InterruptedException {
	   driver.findElement(By.xpath("//div[@id='searchUsers']")).click();
	   driver.findElement(By.xpath("//input[@id='autoSuggestInput']")).sendKeys("Gourav");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[starts-with(text(),'Gourav Chourasiya')]")).click();
	   
	   
   }
   public WebElement MLRA_ans1() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[4]/div[2]/input[1]"));
	   
   }
   
		   public WebElement MLRA_ans2() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[2]/form[1]/div[2]/div[2]/div[3]/div[3]/div[1]/div[4]/div[2]/input[1]"));
	   
   }
   public WebElement StartMLRA_L1() {
		
	   return driver.findElement(By.xpath("//button[starts-with(@id,'PXP_')]"));
	   
   }

   public WebElement level1_submit() {
		
	   return driver.findElement(By.xpath("//*[@id='updateEditReport']"));
	   
   }

}
