package stepDefination;

import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.ProcessCreation;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProcessCreation_steps
{
	public static WebDriver driver;
	
	Login_steps User = new Login_steps();
	ProcessCreation PC =new ProcessCreation(User.driver);
	CreateUser CS =new CreateUser(User.driver);
	
	@When("^User go to the content page")
	public void clickon_Content() {
		PC.ContentTab().click();
	}
	
	@When("^User go to the process tab")
	public void Click_Processtab() {
		PC.ProcessTab().click();
	}
	
	@When("^User click Add new button")
	public void Addnew_Btn() {
		PC.Addnew_Btn().click();
	}
	
	@When("^User select Appraisal type")
	public void Process_Type_Appraisal() {
		PC.Process_Type_Appraisal().click();
	}
	@When("^User select Audit type")
	public void Process_Type_Audit() {
		PC.Process_Type_Audit().click();
	}
	@When("^User select DC type")
	public void Process_Type_DC() {
		PC.Process_Type_DC().click();
	}
	@When("^User select Checklist type")
	public void Process_Type_Checklist() {
		PC.Process_Type_Checklist().click();
	}
	
	@When("^User enters Audit Process name")
	public void Audit_ProcessName() {
		PC.ProcessName =	"Audit " + CS.getCurrentTimeStamp();
		PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User enters DC Process name")
	public void DC_ProcessName() {
	PC.ProcessName =	"DC " + CS.getCurrentTimeStamp();
			PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User enters Checklist Process name")
	public void Checklist_ProcessName() {
	PC.ProcessName =	"Checklist " + CS.getCurrentTimeStamp();
			PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User enters Appraisal Process name")
	public void Appraisal_ProcessName() {
	PC.ProcessName =	"Appraisal " + CS.getCurrentTimeStamp();
			PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User click on continue button")
	public void Process_continueBtn() throws InterruptedException  {
		Thread.sleep(3000);
		PC.Process_continueBtn().click();
		
	}
	@When("^User enters Process process objective")
	public void processobjective() {
		PC.processobjective().sendKeys("Audit test" );
	}
	@When("^User selects city as coverage")
	public void processcoverageCity() {
		PC.processcoverageCity().click();
		
	}
	@When("^User selects Store as coverage")
	public void processcoverageStore() {
		PC.processcoverageStore().click();
		
	}
	
	@When("^User selects User as coverage")
	public void processcoverageUser() {
		PC.processcoverageUser().click();
	}
	@When("^User selects Module as coverage")
	public void processcoverageModule() {
		PC.processcoverageModule().click();
	}
	
	@When("^User click on select a module from list")
	public void Select_Module_click() {
		PC.Select_Module_click().click();
		PC.coveragedone().click();
	}
	
	@When("^User selects Process as coverage")
	public void processcoverageProcess() {
		PC.processcoverageProcess().click();
	}
	@When("^User selects Process for Process as coverage")
	public void selectprocessforcoverageProcess() {
		PC.SelectProcessforcoverage().click();
		PC.Select_Module_click().click();
	}
	
	@When("^User selects City for Process as coverage")
	public void selectcityforcoverageProcess() {
		PC.SelectCityforProcessCoverage().click();
		PC.Select_Module_click().click();
	}
	
	
	@When("^User selects Resource as coverage")
	public void processcoverageResource() {
		PC.processcoverageResource().click();
	}
	@When("^User open list coverages")
	public void processcoverageclick() {
		PC.processcoverageclick().click();
	}
	@When("^User selects All coverage and done")
	public void SelectCoverage() {
		PC.SelectCoverage().click();
		PC.coveragedone().click();
	}
	@When("^User selects single periodicity")
	public void Select_Single_periodicity() {
		PC.Select_Single_periodicity();
		
	}
	@When("^User selects Weekly periodicity")
	public void Select_Weekly_periodicity() {
		PC.Select_Weekly_periodicity();
		
	}
	@When("^User selects Monthly periodicity")
	public void Select_Monthly_periodicity() {
		PC.Select_Monthly_periodicity();
		
	}
	@When("^User selects Quaterly periodicity")
	public void Select_QUaterly_periodicity() {
		PC.Select_Quarterly_periodicity();
		
	}
	@When("^User selects Halfannually periodicity")
	public void Select_Halfannually_periodicity() {
		PC.Select_Halfannually_periodicity();
		
	}
	@When("^User selects Annually periodicity")
	public void Select_Annually_periodicity() {
		PC.Select_Annually_periodicity();
		
	}
	@When("^User selects Cyclic periodicity")
	public void Select_Cyclic_periodicity() {
		PC.Select_Cyclic_periodicity();
		
		
	}
	@When("^User enters Cyclic duration as 3")
	public void enter_Cyclic_Duration() {
		
		PC.Enter_Cyclic_Duration().sendKeys("3");
		
		
	}
	@When("^User enters start date as today")
	public void enter_Cyclic_Duration_startdate() {
		
		
		Date dt = new Date();
		String CurrentDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		PC.Enter_Cyclic_StartDate().sendKeys(CurrentDate);
		
	}
	@When("^User enters Cyclic lable as 1")
	public void enter_Cyclic_lable() throws InterruptedException {
		Thread.sleep(3000);
		PC.Enter_Cyclic_lable().sendKeys("1");
		
		
	}
	@When("^User selects has_cutoff")
	public void Has_A_Cutoff() {
		PC.Has_A_Cutoff().click();
	}
	@When("^User selects EnableDataEdit")
	public void EnableDataEdit() {
		PC.EnableDataEdit().click();
	}
	@When("^User selects MultipleRecords")
	public void MultipleRecords() {
		PC.MultipleRecords().click();
	}
	@When("^User save the process details")
	public void ProcessDetails_save() throws Exception {
	
		PC.ProcessDetails_save().click();
		Thread.sleep(8000);
	}
	
	@When("^User click on Add new Task Audit")
	public void Add_newtask_Audit_Btn() {
		PC.Add_newtaskAudit_Btn().click();
	}
	@When("^User click on Add new Question button")
	public void Add_newQuestion_Btn() {
		PC.Add_newtaskAudit_Btn().click();
	}
	@When("^User click on Add new Task DC")
	public void Add_newtask_DC_Btn() {
		PC.Add_newtaskDC_Btn().click();
	}
	@When("^User selects score type")
	public void Select_scoreQues() {
		PC.Select_scoreQues();
	}
	@When("^User Add question title")
	public void Add_QuestionTitle() {
		PC.Add_QuestionTitle().sendKeys("Score type question");
	}
	@When("^User select Add another option")
	public void select_Addanother() throws InterruptedException {
		PC.select_Addanother().click();
		Thread.sleep(4000);
	}
	@When("^User click on save question")
	public void Save_question_Btn() throws InterruptedException {
		PC.Save_question_Btn().click();
		Thread.sleep(4000);
	}
	@When("^User selects short type")
	public void Select_shortQues() {
		PC.Select_shortQues();
	}
	@When("^User Add Short question title")
	public void Add_ShortQuestionTitle() {
		PC.Add_QuestionTitle().sendKeys("Short type question");
	}
	@When("^User selects Descriptive type")
	public void Select_DescriptiveQues() {
		PC.Select_DescriptiveQues();
	}
	@When("^User Add Descriptive question title")
	public void Add_DescriptiveQuestionTitle() {
		PC.Add_QuestionTitle().sendKeys("Descriptive type question");
	}
	@When("^User selects rating type")
	public void Select_RatingQues() {
		PC.Select_RatingQues();
	}
	@When("^User Add Rating question title")
	public void Add_RatingQuesTitle() {
		PC.Add_QuestionTitle().sendKeys("Ratings type question");
	}
	@When("^User Add Rating Area should be rated")
	public void Add_AreaShouldrated() {
		PC.AreaShouldrated_1().sendKeys("Product");
		PC.AreaShouldrated_2().sendKeys("Service");
	}
	@When("^User Add Audit Rating Options and weightage")
	public void Add_Audit_RatingOptions() {
		PC.Option_1().sendKeys("Good");
		PC.Weightage_1().sendKeys("1");
		PC.Option_2().sendKeys("Bad");
		PC.Weightage_2().sendKeys("1");
	}
	@When("^User Add DC Rating Options")
	public void Add_DC_RatingOptions() {
		PC.Option_1().sendKeys("Good");
		PC.Option_2().sendKeys("Bad");
		
	}
	@When("^User selects MCSA type")
	public void Select_MCSAQues() {
		PC.Select_MCSA();
	}
	@When("^User Add MCSA question title")
	public void Add_MCSATitle() {
		PC.Add_QuestionTitle().sendKeys("MCSA type question");
	}
	
	@When("^User Add Audit MCSA Options and weightage")
	public void Add_Audit_MCSAOptions() {
		PC.Option_1().sendKeys("MCSA 1");
		PC.Weightage_1().sendKeys("1");
		PC.Option_2().sendKeys("MCSA 2");
		PC.Weightage_2().sendKeys("1");
	}
	@When("^User Add DC MCSA Options")
	public void Add_DC_MCSAOptions() {
		PC.Option_1().sendKeys("MCSA 1");
		PC.Option_2().sendKeys("MCSA 2");
		
	}
	@When("^User selects MCMA type")
	public void Select_MCMAQues() {
		PC.Select_MCMA();
	}
	@When("^User Add MCMA question title")
	public void Add_MCMATitle() {
		PC.Add_QuestionTitle().sendKeys("MCMA type question");
	}
	
	@When("^User Add Audit MCMA Options and weightage")
	public void Add_Audit_MCMAOptions() {
		PC.Option_1().sendKeys("MCMA 1");
		PC.Weightage_1().sendKeys("1");
		PC.Option_2().sendKeys("MCMA 2");
		PC.Weightage_2().sendKeys("1");
	}
	@When("^User Add DC MCMA Options")
	public void Add_DCMCMAOptions() {
		PC.Option_1().sendKeys("MCMA 1");
		PC.Option_2().sendKeys("MCMA 2");
		PC.Option_3().sendKeys("MCMA 3");
	}

	@When("^User Add Checklist question title")
	public void Add_ChecklistTitle() {
		PC.Add_QuestionTitle().sendKeys("Checklist type question");
	}
	@When("^User selects 1st as correct option")
	public void Select_Checklist_CorrectAns1() {
		PC.Select_Checklist_CorrectAns1().click();
	}
	@When("^User selects 2nd as correct option")
	public void Select_Checklist_CorrectAns2() {
		PC.Select_Checklist_CorrectAns2().click();
	}
	@When("^User selects 1st as correct option MCMA")
	public void Select_MCMA_CorrectAns1() {
		PC.Select_MCMA_CorrectAns1().click();
	}
	@When("^User click on Process save button")
	public void Process_save_Btn() {
		PC.Process_save_Btn().click();
	}
	@When("^User click on Assign button")
	public void Click_on_Assign() {
		ProcessCreation.Click_on_Assign();
	}
	
	@When("^User search for the assignee")
	public void enter_search_bar() throws InterruptedException {
		ProcessCreation.enter_search_bar("//input[@id='searchString']", "Nimish jain");
		Thread.sleep(5000);
	}
	@When("^User click on assign for searched user")
	public void Assign_to_user() {
		ProcessCreation.Assign_to_User();
	}
	@When("^User click on Check all")
	public void select_CheckAll() {
		PC.select_CheckAll().click();
	}
	@When("^User click on Share all")
	public void select_ShareAll() {
		PC.select_ShareAll().click();
	}
	@When("^User click on Done button")
	public void Clicl_donebtn() {
		PC.coveragedone().click();
	}
	@When("^User search for created process")
	public void enter_Processsearch_bar() throws InterruptedException {
		ProcessCreation.enter_search_bar("//input[@id='searchString']", PC.ProcessName);
		Thread.sleep(5000);
	}
	@When("^User search for module as coverage")
	public void enterModuleNAme_Processsearch_bar() throws InterruptedException {
		Thread.sleep(2000);
		ProcessCreation.enter_search_bar("//input[@id='searchString']", "7thFebDailyChecklistModule");
		Thread.sleep(4000);
	}
	@When("^User click on change to activate process")
	public void select_Change_btn() {
		PC.select_Change_btn().click();
	}
	@When("^User click on back to process")
	public void click_backToProcess() {
		PC.click_backToProcess().click();
		
	}
	@When("^User select Assessment type")
	public void Process_Type_Assessment() {
		PC.Process_Type_Assessment().click();
	}
	@When("^User enters Assessment Process name")
	public void Assess_ProcessName() {
	PC.ProcessName =	"Assess " + CS.getCurrentTimeStamp();
			PC.Process_name().sendKeys(PC.ProcessName);
	}
	
	@When("^User click on Timedcheckbox")
	public void click_Timedcheckbox_assess() {
		PC.Timedcheckbox_assess().click();
	}
	
	@When("^User set 2 min as Duration time for assess")
	public void click_DurationTextbox_assess() { 
		PC.DurationTextbox_assess().sendKeys("2");
	}

	@When("^User set MaxAttempts as 10")
	public void MaxAttemptsTextbox_assess() { 
		PC.MaxAttemptsTextbox_assess().sendKeys("10");
	}
	

	@When("^User set Maximum Marks as 4")
	public void MaxMarksTextbox_assess() { 
		PC.MaxMarksTextbox_assess().sendKeys("4");
	}
	
	@When("^User set Threshold as 50%")
	public void ThresholdTextbox_assess() { 
		
		PC.ThresholdTextbox_assess().sendKeys("50");
	}
	
	@When("^User clicks on gear icon to set question properties")
	public void ConfigureGearIcon_assess() { 
		PC.ConfigureGearIcon_assess().click();
	}
	@When("^User set no. of questions")
	public void Set_NumberOfQues_Assess() { 
		PC.Set_NumberOfQues_Assess().clear();
		PC.Set_NumberOfQues_Assess().sendKeys("4");
	}
	
	@When("^User set score per question")
	public void Set_ScorePerQues_Assess() { 
		PC.Set_ScorePerQues_Assess().clear();
		PC.Set_ScorePerQues_Assess().sendKeys("1");
	}
	
	@When("^User clicks on apply for question config")
	public void Click_ApplyQuestionConfig_Assess() throws InterruptedException { 
		Thread.sleep(3000);
		PC.Click_ApplyQuestionConfig_Assess().click();
	}
	
	@When("^User search for the Analysts role")
	public void enterRole_search_bar() throws InterruptedException {
		ProcessCreation.enter_search_bar("//input[@id='assignSearch']", "Analysts");
		Thread.sleep(5000);
	}
	@When("^User clicks on assign for the searched person")
	public void ClickOnAsssign_Searched() { 
		PC.ClickOnAsssign_Searched().click();
	}
	@When("^User Set Evaluator for Assess")
	public void SetEvaluator_Assess() { 
		PC.SetEvaluator_Assess();
	}
	
}