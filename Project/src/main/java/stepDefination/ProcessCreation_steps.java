package stepDefination;

import java.io.InterruptedIOException;
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
	
	@When("^User select Audit type")
	public void Process_Type_Audit() {
		PC.Process_Type_Audit().click();
	}
	@When("^User select DC type")
	public void Process_Type_DC() {
		PC.Process_Type_DC().click();
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
	@When("^User click on continue button")
	public void Process_continueBtn()  {
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
	@When("^User open list coverages")
	public void processcoverageclick() {
		PC.processcoverageclick().click();
	}
	@When("^User selects All coverage and done")
	public void SelectCoverage() {
		PC.SelectCoverage().click();
		PC.coveragedone().click();
	}
	@When("^User selects has_cutoff")
	public void Has_A_Cutoff() {
		PC.Has_A_Cutoff().click();
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
	public void select_Addanother() {
		PC.select_Addanother().click();
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
		PC.Option_3().sendKeys("MCMA 2");
		PC.Weightage_3().sendKeys("1");
	}
	@When("^User Add DC MCMA Options")
	public void Add_DCMCMAOptions() {
		PC.Option_1().sendKeys("MCMA 1");
		PC.Option_2().sendKeys("MCMA 2");
		PC.Option_3().sendKeys("MCMA 3");
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
		ProcessCreation.enter_search_bar("//input[@id='searchString']", "Gourav Chourasiya");
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
	@When("^User click on change to activate process")
	public void select_Change_btn() {
		PC.select_Change_btn().click();
	}
	@When("^User click on back to process")
	public void click_backToProcess() {
		PC.click_backToProcess().click();
		
	
	}
	
}