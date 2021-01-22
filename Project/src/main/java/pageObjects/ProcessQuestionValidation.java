package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itextpdf.text.log.SysoCounter;

import io.cucumber.java.en.When;
import stepDefination.Login_steps;

public class ProcessQuestionValidation {
	public static String ProcessName;
	
	public static WebDriver driver = null;
	public ProcessQuestionValidation(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
  
		
		
	
   public void Click_Process_TodoPage(String ProcessName1) throws InterruptedException {
	   
	   WebElement ele = driver.findElement(By.xpath("//div[@title='"+ProcessName1+"']"));
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", ele);
	   
   }
   public WebElement ClickOnProcess_TodoPage2(String ProcessName1) {
		
	   return driver.findElement(By.xpath("//div[@title='"+ProcessName1+"']"));
	   
   }
   
   
   
   
   
   
   public WebElement DCProcess_start() {
		
	   return driver.findElement(By.xpath("//*[@class='start-tdo'][text()='Start ']"));
	   
   }
   public WebElement AuditProcess_start() {
		
	   return driver.findElement(By.xpath("//button[@class='start-tdo'][contains(.,'Start')]"));
	   
   }
   public WebElement Answer_1() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement Answer_2() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[3]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement Answer_3() {
	
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[5]/div[1]/div[3]/div[2]/input[1]"));
		      
   }
   public WebElement Answer_4() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[7]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement Answer_5() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[9]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement Answer_6() {
	
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[11]/div[1]/div[3]/div[2]/input[1]"));
		      
   } 
   public WebElement Answer_7() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[13]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement Answer_8() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[15]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement Answer_9() {
	
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[17]/div[1]/div[3]/div[2]/input[1]"));
		      
   } 
   public WebElement Answer_10() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[19]/div[1]/div[3]/div[2]/input[1]"));
		      
   } 
   public void Check_ShortTextValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Please enter valid text in the field.']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short text validation working, Warning message displayed");
		}
	   else
		   System.out.println("Short text validation Not working, warning message not displayed on submission!!");
	   
	   
	} 
   
   public void Check_ShortNumberValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Please enter valid numerics (1,2,3,4,...) in the field.']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Number validation working, Warning message displayed");
		}
	   else
		   System.out.println("Short Number validation Not working, warning message not displayed on submission!!");
   }
   public void Check_ShortPercentageValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Please enter percentage between 0 and 100.']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Percentage validation working, Warning message displayed");
	   }
	   else
		   System.out.println("Short Percentage validation Not working, warning message not displayed on submission!!");
   }
   public void Check_ShortDateValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Date for this task should be in between 31 Jan,2021   to 20 Feb,2021   . Please check your answers.']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Date validation working, Warning message displayed");
		}
	   else
		   System.out.println("Short Date validation Not working, warning message not displayed on submission!!");
   }
   
   public void Check_ShortRangeValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Your answer can be between 10-50 only']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Range validation working, Warning message displayed");
	   }
	   else
		   System.out.println("Short Range validation Not working, warning message not displayed on submission!!");
   }
   public void Check_ShortLengthValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Please enter text for the allowed length.']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Length validation working, Warning message displayed");
	   }
	   else
		   System.out.println("Short Length validation Not working, warning message not displayed on submission!!");
   }
   public void Check_ShortEmailValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Please enter valid email in the field.']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Email validation working, Warning message displayed");
	   }
	   else
		   System.out.println("Short Email validation Not working, warning message not displayed on submission!!");
   }
   public void Check_ShortZipcodeValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Please enter valid zip code (6 digits)']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Zipcode validation working, Warning message displayed");
	   }
	   else
		   System.out.println("Short Zipcode validation Not working, warning message not displayed on submission!!");
   }
   
   public void Check_ScoreRangeValidation_Warning() {
		
	   WebElement element=driver.findElement(By.xpath("//div[text()='Your answer can be between 10-50 only']"));
	   if(element.isDisplayed()) {
		    System.out.println("Short Zipcode validation working, Warning message displayed");
	   }
	   else
		   System.out.println("Short Zipcode validation Not working, warning message not displayed on submission!!");
   }
   
   
   
   
   
   public void ProcessSubmission_ConfirmBox() {
		
	   WebElement element=driver.findElement(By.className("form-confimation-container"));
	   if(element.isDisplayed()) {
		    System.out.println("Process Submitted");
	   }
	   else
		   System.out.println("Process not submitted");
   }
}  
   
   
   
   


