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
import pageObjects.ProcessFilling;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProcessFilling_steps
{
	public static WebDriver driver;
	
	Login_steps User = new Login_steps();
	ProcessFilling PF =new ProcessFilling(User.driver);
	CreateUser CS =new CreateUser(User.driver);
	
	@When("^User go to the todo page")
	public void clickon_Todo() {
		PF.Todo_page().click();
	}
	
	@Then("^User click on process in todo")
	public void ClickOnProcess_TodoPage() throws InterruptedException {
		Thread.sleep(8000);
		PF.ClickOnProcess_TodoPage(ProcessCreation.ProcessName);
	}
	
	@Then("^User click on Star button for DC process in todo")
	public void Click_DC_Start_Btn() {
		PF.DCProcess_start().click();
	}
	@Then("^User click on Star button for Audit process in todo")
	public void Click_AUDIT_Start_Btn() {
		PF.AuditProcess_start().click();
	}
	@Then("^User Fill the 1st score answer")
	public void score1Dc() {
		PF.AnswerScore1_DC().sendKeys("1");
	}
	@Then("^User Fill the 1st short answer")
	public void short1Dc() {
		PF.AnswerShort1_DC().sendKeys("Short");
	}
	@Then("^User Fill the 1st Description answer")
	public void Description1Dc() {
		PF.AnswerDescr1_DC().sendKeys("Description answer 12321343");
	}
	@Then("^User select options for 1st Rating")
	public void Rating_Good() {
		PF.Ratings1st_Good_DC().click();
		PF.Ratings2nd_Bad_DC().click();
	}
	
	@Then("^User Fill the MCSA1 answer")
	public void MCSA_1() {
		PF.MCSA1_DC().click();
	}
	@Then("^User Fill the MCMA1 answer")
	public void MCMA_1() {
		PF.MCMA1_DC().click();
	}
	@Then("^User Fill the MCMA2 answer")
	public void MCMA_2() {
		PF.MCMA2_DC().click();
	}
	
	@Then("^User click n submit button to submit")
	public void Submit_btn() {
		PF.ProcessSubmitBtn_DC().click();
	}
	
	
	
	///////////////////////////////////////////Report////////////////////////////////////////////////
	@Then("^User click on Reports tab")
	public void Reports_tab() {
		PF.ReportsTab().click();
	}
	@Then("^User click on Process in Reports tab")
	public void Reports_ProcessTab() {
		PF.Reports_ProcessTab().click();
	}
	
	@Then("^User search for the process in reports")
	public void ProcessSearch_InReports() throws InterruptedException {
	 PF.ProcessSearchClick_reports();
	 Thread.sleep(3000);
	}
	
	
	@Then("^User and click on analyse")
	public void Click_Analyse() {
		PF.Click_Analyse().click();
	}
}

	
