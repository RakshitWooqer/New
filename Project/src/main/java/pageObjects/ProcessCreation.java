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

public class ProcessCreation {
	public static String ProcessName;
	
	public static WebDriver driver = null;
	public ProcessCreation(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
  
		
		
	
   public WebElement ContentTab() {
	
	   return driver.findElement(By.xpath("//*[@id='contentTabLink']/a"));
	   
   }
   
   public WebElement ProcessTab() {
	   return driver.findElement(By.xpath("//*[@id='container']/div[2]/div[6]/table[1]/tbody/tr/td[5]"));
	   
   }
   public WebElement Addnew_Btn() {
	   return driver.findElement(By.xpath("//span[contains(text(),'Add New')]"));
	   
   }
   public WebElement Process_Type_Appraisal() {
	    return driver.findElement(By.xpath("//input[@value='3']"));
		
   }
   public WebElement Process_Type_Audit() {
	    return driver.findElement(By.xpath("//input[@value='2']"));
		
   }
   public WebElement Process_Type_DC() {
	    return driver.findElement(By.xpath("//input[@value='4']"));
		
   }
   public WebElement Process_Type_Checklist() {
	    return driver.findElement(By.xpath("//input[@value='1']"));
		
   }
   public WebElement Process_Type_Assessment() {
		return driver.findElement(By.xpath("//input[@value='5']"));
		
   }
   
   
   public WebElement Process_name() {
	    return driver.findElement(By.id("cn"));
		
   }
	
   public WebElement Process_continueBtn() {
		 return driver.findElement(By.id("continueContent"));
   }
	 
   public WebElement processobjective() {
		 return driver.findElement(By.id("objective"));
   }
	 
   public WebElement processcoverage() {
		 return driver.findElement(By.id("group2"));
   }
   
   public WebElement processcoverageCity() {
		 return driver.findElement(By.xpath("//input[@id='group1']"));
   }
   
   public WebElement processcoverageStore() {
		 return driver.findElement(By.xpath("//input[@id='group2']"));
 }
   public WebElement processcoverageModule() {
		 return driver.findElement(By.xpath("//input[@id='group3']"));
 }
   public WebElement processcoverageUser() {
		 return driver.findElement(By.xpath("//input[@id='group4']"));
   }
  
   public WebElement processcoverageProcess() {
		 return driver.findElement(By.xpath("//input[@id='group6']"));
   }
   
   public WebElement SelectProcessforcoverage() {
		 return driver.findElement(By.xpath("//a[@id='selectGroupA']"));
   }
   public WebElement SelectCityforProcessCoverage() {
		 return driver.findElement(By.xpath("//a[@id='selectGroupSA']"));
 }
   public WebElement processcoverageResource() {
		 return driver.findElement(By.xpath("//input[@id='group7']"));
   }
   public WebElement processcoverageclick() {
		 return driver.findElement(By.xpath("//a[@id='selectGroupA']"));
   }

   public WebElement processunits() {
		 return driver.findElement(By.xpath("//input[@id='listStoreTable']"));
   }
   
   public WebElement SelectCoverage() {
		 return driver.findElement(By.xpath("//a[@id='selectAll']"));
   }
   public WebElement Select_Module_click() {
		 return driver.findElement(By.xpath("//a[text()='Select']"));
   }

   public WebElement coveragedone() {
		 return driver.findElement(By.xpath("//input[@value='Done']"));
   }

   public WebElement Select_Single_periodicity() {
	   return driver.findElement(By.id("frequency2"));
	
   }
   public void Select_Weekly_periodicity() {
	   Select s=new Select(driver.findElement(By.id("frequencyType")));
		 s.selectByVisibleText("Weekly");
   }
   public void Select_Monthly_periodicity() {
	   Select s=new Select(driver.findElement(By.id("frequencyType")));
		 s.selectByVisibleText("Monthly");
   }
   public void Select_Quarterly_periodicity() {
	   Select s=new Select(driver.findElement(By.id("frequencyType")));
		 s.selectByVisibleText("Quarterly");
   }
   public void Select_Halfannually_periodicity() {
	   Select s=new Select(driver.findElement(By.id("frequencyType")));
		 s.selectByVisibleText("Half annually");
   }
   public void Select_Annually_periodicity() {
	   Select s=new Select(driver.findElement(By.id("frequencyType")));
		 s.selectByVisibleText("Annually");
   }
   public void Select_Cyclic_periodicity() {
	   Select s=new Select(driver.findElement(By.id("frequencyType")));
		 s.selectByVisibleText("Cyclic");
   }
   public WebElement Enter_Cyclic_Duration() {
	   return driver.findElement(By.xpath("//input[@id='cycleDuration']"));
   }
   public WebElement Enter_Cyclic_StartDate() {
	   return driver.findElement(By.xpath("//input[@id='cycleStartString']"));
   }
   public WebElement Enter_Cyclic_lable() {
	   return driver.findElement(By.xpath("//input[@id='cycleLabel']"));
   }
   public WebElement Has_A_Cutoff() {
		 return driver.findElement(By.xpath("//input[@id='enableCutOff1']"));
   }
  
   public WebElement EnableDataEdit() {
		 return driver.findElement(By.xpath("//input[@id='allowEdit1']"));
   }
   
   public WebElement Duplicate() {
		 return driver.findElement(By.id("allowMultiple1"));
 }
   public WebElement MultipleRecords() {
		 return driver.findElement(By.xpath("//input[@id='repMR']"));
   }
   public WebElement ProcessDetails_save() {
		
	
	   return driver.findElement(By.id("evalSubmitButton"));
   }
   public WebElement Add_newtaskAudit_Btn() {
	     
		 return driver.findElement(By.xpath("//a[text()='Add New Question']"));
   }
   public WebElement Add_newtaskDC_Btn() {
	     
		 return driver.findElement(By.xpath("//a[text()='Add New Task']"));
 }
   public WebElement Add_QuestionTitle() {
	     
		 return driver.findElement(By.id("question"));
   }
   public WebElement select_Addanother() {
		 return driver.findElement(By.xpath("//span[contains(text(),'Add another')]"));
   }
   public WebElement Save_question_Btn() {
		 return driver.findElement(By.id("questionSubmit"));
   }
  
   public void Select_scoreQues() {
	   Select s=new Select(driver.findElement(By.xpath("//select[@id='thisone']")));
		 s.selectByVisibleText("Score");
   }
   public void Select_shortQues() {
	  
	   Select s=new Select(driver.findElement(By.xpath("//select[@id='thisone']")));
		 s.selectByVisibleText("Short Answer");
   }
   public void Select_DescriptiveQues() {
	   
	   Select s=new Select(driver.findElement(By.xpath("//select[@id='thisone']")));
		 s.selectByVisibleText("Descriptive Answer");
   }
   public void Select_RatingQues() {
	   
	   Select s=new Select(driver.findElement(By.xpath("//select[@id='thisone']")));
		 s.selectByVisibleText("Rating");
   }
   public void Select_MCSA() {
	   
	   Select s=new Select(driver.findElement(By.xpath("//select[@id='thisone']")));
		 s.selectByVisibleText("Multiple Choice Single Answer");
   }
   public void Select_MCMA() {
	   
	   Select s=new Select(driver.findElement(By.xpath("//select[@id='thisone']")));
		 s.selectByVisibleText("Multiple Choice Multiple Answers");
   }
   
   public WebElement Select_Checklist_CorrectAns1() {
	   
	   return driver.findElement(By.xpath("//div[@id='radioAnswers']/div[1]/label"));
   }
   public WebElement Select_Checklist_CorrectAns2() {
	   
	   return driver.findElement(By.xpath("//div[@id='radioAnswers']/div[2]/label"));
   }
   public WebElement Select_MCMA_CorrectAns1() {
	   
	   return driver.findElement(By.xpath("//div[@class='al-chk-btn clearfix']"));
   }
   public WebElement Addmore_option() {
	  
	   return driver.findElement(By.id("id:addMore"));
   }
   public WebElement Option_1() {
	  
	   return driver.findElement(By.id("answer1"));
   }
   public WebElement Option_2() {
	
	   return driver.findElement(By.id("answer2"));
   }
   public WebElement Option_3() {
	   
	   return driver.findElement(By.id("answer3"));
   }
   public WebElement Option_4() {
	 
	   return driver.findElement(By.id("answer4"));
   }
   public WebElement Weightage_1() {
	   
	   return driver.findElement(By.id("answer1Weight"));
   }
   public WebElement Weightage_2() {
	
	   return driver.findElement(By.id("answer2Weight"));
   }
   public WebElement Weightage_3() {
	   
	   return driver.findElement(By.id("answer3Weight"));
   }
   public WebElement Weightage_4() {
	 
	   return driver.findElement(By.id("answer4Weight"));
   }
   public WebElement AreaShouldrated_1() {
	   
	   return driver.findElement(By.xpath("//div[@id='elementsArrayTable']/div[1]/input"));
   }
   public WebElement AreaShouldrated_2() {
	   
	   return driver.findElement(By.xpath("//div[@id='elementsArrayTable']/div[2]/input"));
   }
   public WebElement Process_save_Btn() {
	  
	   return driver.findElement(By.id("doneEval"));
   }
   public static void Click_on_Assign() {
	   
		  try {
		  WebDriverWait wait=new WebDriverWait(driver, 1000);
	      WebElement table = driver.findElement(By.id("listTable"));
		  List<WebElement> Rows=table.findElements(By.tagName("tr"));
		  for(int i=4;i<5;i++) {
			  ProcessName=driver.findElement(By.xpath("//*[@id='listTable']/tbody/tr["+i+"]/td[1]/span[1]")).getText();
			  System.out.println(ProcessName);
			  WebElement assign=wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id='listTable']/tbody/tr["+i+"]/td[7]/a[1]"))));
			  assign.click();
			  
			  }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
   		}
		
   public static  void enter_search_bar(String SearchBar, String AssigneeName) {
	    	  try {
	    	 WebElement Searchbox =driver.findElement(By.xpath(SearchBar));
	    	 Searchbox.clear();
	    	 Searchbox.sendKeys(AssigneeName);
	    	 Searchbox.sendKeys(Keys.ENTER);
	       }
	    		  catch(Exception e) {
	    		  }
	    		  
	 }	  
   public static void Assign_to_User() {
	 
	   try {
		  WebElement table = driver.findElement(By.id("listTable"));
		  List<WebElement> Rows=table.findElements(By.tagName("tr"));
		  System.out.println(Rows.size());
		  for(int i=6;i<7;i++) {
		 
			  WebElement assign=driver.findElement(By.xpath("//*[@id='listTable']/tbody/tr["+i+"]/td[4]/a[@class='number-anchor assignments']"));
			  assign.click();
		  	}
		 
		  }
		  catch(Exception e) {
			  
		  }
	 }
   public  WebElement select_CheckAll() {
		 return driver.findElement(By.xpath("//a[@class='pink-anchor assignCheckAll'][contains(.,'Check all')]"));
   }
 
   public WebElement select_ShareAll() {
		 return driver.findElement(By.xpath("//a[@class='pink-anchor shareCheckAll'][contains(.,'Check all')]"));
   }
	
   public  WebElement select_Change_btn()  {
	      
		 return driver.findElement(By.xpath("//*[text()='change']"));
   }
   
   public  WebElement click_backToProcess() {
	  
		 return driver.findElement(By.xpath("//a[contains(text(),'<<   Back to process list')]"));
   }

   public  WebElement Timedcheckbox_assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='timedTest1']"));
   }
   
   public  WebElement DurationTextbox_assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='duration']"));
   }
   
   public  WebElement MaxAttemptsTextbox_assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='attempts']"));
   }
   
   public  WebElement MaxMarksTextbox_assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='maxMarks']"));
   }
   
   public  WebElement ThresholdTextbox_assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='passingCriteria']"));
   }

   public  WebElement ConfigureGearIcon_assess() {
		  
		 return driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[2]/img[1]"));
   }
	
   public  WebElement Set_NumberOfQues_Assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='numberOfQuestions']"));
 }

 public  WebElement Set_ScorePerQues_Assess() {
		  
		 return driver.findElement(By.xpath("//input[@id='marksQuestion']"));
 }
 
 public  WebElement Click_ApplyQuestionConfig_Assess() {
	  
	 return driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[1]"));
}





public WebElement ClickOnAsssign_Searched() {
	return driver.findElement(By.xpath("//*[@id=\"row266\"]/td[5]/a"));
	//return driver.findElement(By.xpath("//a[contains(text(),'Assign')]"));
}

public void SetEvaluator_Assess() {
	 driver.findElement(By.xpath("//div[@class='eval-more-action-container']")).click();
	 driver.findElement(By.xpath("//a[text()='Set evaluator']")).click();
	 driver.findElement(By.xpath("//a[@class='selectEligibleUsers']")).click();
	 driver.findElement(By.xpath("//a[@id='521255']")).click();
	
	//return driver.findElement(By.xpath("//a[contains(text(),'Assign')]"));
}
  


}
