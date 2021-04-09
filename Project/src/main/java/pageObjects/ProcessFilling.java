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

import io.cucumber.java.en.When;
import stepDefination.Login_steps;

public class ProcessFilling {
	public static String ProcessName;
	
	public static WebDriver driver = null;
	public ProcessFilling(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
  
		
		
	
   public WebElement Todo_page() {
	
	   return driver.findElement(By.xpath("//div[text()='To Do']"));
	   
   }
   
   public void ClickOnProcess_TodoPage(String ProcessName1) throws InterruptedException {
	   
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
   public WebElement AssessProcess_start() {
		
	   return driver.findElement(By.xpath("//button[@class='start-tdo start-tdo-assessment'][contains(.,'Start')]"));
	   
   }
   public WebElement AssessProcess_startConfirm() {
		
	   return driver.findElement(By.xpath("//button[@class='start-assm-btn']"));
	      
   }
   public WebElement AssessProcess_ViewAll() {
		
	   return driver.findElement(By.xpath("//*[@id=\"expTile5\"]/div[3]/div[2]/div[2]/div[2]/div[1]/label"));
	      
   }
   public WebElement AssessProcess_ViewOnceAtTime() {
		
	   return driver.findElement(By.xpath("//*[text()='View one at a time']"));
	      
   }
   public WebElement AnswerScore1_DC() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement AnswerShort1_DC() {
		
	   return driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/form[1]/div[2]/div[2]/div[3]/div[3]/div[1]/div[3]/div[2]/input[1]"));
	   
   }
   public WebElement AnswerDescr1_DC() {
		
	   return driver.findElement(By.xpath("//*[@class='ans-textarea-form']"));
	   
   }
   public WebElement Ratings1st_Good_DC() {
		
	   return driver.findElement(By.xpath("//tbody/tr[1]/td[2]/label[1]"));
	   
   }
   public WebElement Ratings2nd_Bad_DC() {
		
	   return driver.findElement(By.xpath("//tbody/tr[2]/td[3]/label[1]"));
	   
   }
   public WebElement MCSA1_DC() {
		
	   return driver.findElement(By.xpath("//span[contains(text(),'MCSA 1')]"));
	   
   }
   public WebElement MCSA2_DC() {
		
	   return driver.findElement(By.xpath("//span[contains(text(),'MCSA 2')]"));
	   
   }
   public WebElement MCMA1_DC() {
		
	   return driver.findElement(By.xpath("//span[contains(text(),'MCMA 1')]"));
	   
   }
   public WebElement MCMA2_DC() {
		
	   return driver.findElement(By.xpath("//span[contains(text(),'MCMA 2')]"));
	   
   }
   public WebElement MCMA3_DC() {
		
	   return driver.findElement(By.xpath("//span[contains(text(),'MCMA 3')]"));
	   
   }
   public WebElement ProcessSubmitBtn_DC() {
		
	   return driver.findElement(By.id("saveButton"));
	   
   }
   

   public WebElement UserSelect_Yes_forChecklist() {
		
	   return driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
	   
   }
   public WebElement UserSelect_No_forChecklist() {
		
	   return driver.findElement(By.xpath("//label[contains(text(),'No')]"));
	   
   }
   public WebElement Assessment_ShortAnswerTextfield() {
		
	   return driver.findElement(By.xpath("(//textarea[contains(@name,'qt')])[1]"));
	   
   }
   public WebElement Assessment_DescAnswerTextfield() {
		
	   return driver.findElement(By.xpath("(//textarea[contains(@name,'qt')])[2]"));
	   
   }
   public WebElement Assessment_AnswerNext() {
		
	   return driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	   
   }
   public WebElement Assessment_Submitbtn() {
		
	   return driver.findElement(By.xpath("(//div[contains(text(),'Submit')])[2]"));
	   
   }
	///////////////////////////////////////////Report////////////////////////////////////////////////
   
   public WebElement ReportsTab() {
		
	   return driver.findElement(By.id("progressTabLink"));
	   
   }
   
   public WebElement Reports_ProcessTab() {
		
	   return driver.findElement(By.xpath("//*[text()='Process']"));
	   
   }
   public WebElement Analyze_btn(String processName) {
		
	   return driver.findElement(By.xpath("//td[contains(text(),'"+processName+"')]/following-sibling::td[4]/*[@class='reportClick']"));
	   
   }
 
   
   public void ProcessSearchClick_reports() {
			WebElement table = driver.findElement(By.xpath("//table[@class='paddedTable']"));
			List<WebElement> Rows=table.findElements(By.tagName("tr"));
			System.out.println(Rows.size());
			for(int i=4500;i<Rows.size();i++) {
	          String Name =driver.findElement(By.xpath("//*[@class='paddedTable']/tbody/tr["+i+"]/td[1]")).getText();
	          if(Name.equalsIgnoreCase(ProcessName)) {
	           WebElement Analyse=driver.findElement(By.xpath("//*[@class='paddedTable']/tbody/tr["+i+"]/td[5]"));
	           Analyse.click();
	           break;
	        
	          }
	       }
   }
			public static void ProcessSearch_InReports(String ProcessName) {
		    	  
		    	 WebElement Searchbox =driver.findElement(By.id("evaluationSearch"));
		    	 Searchbox.clear();
		    	 Searchbox.sendKeys(ProcessName);
		    	 
		    	 Searchbox.sendKeys(Keys.ENTER);
		       
			}
	          
			public WebElement Click_Analyse() {
				
				   return driver.findElement(By.xpath("//*[@class='reportClick']"));
				   
			   }    
	      
   }
   
  
   
   
   
   
   

