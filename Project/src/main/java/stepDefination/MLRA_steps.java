package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.MLRA_process;
import pageObjects.ProcessCreation;
import pageObjects.ProcessFilling;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MLRA_steps
{
	public static WebDriver driver;
	
	Login_steps User = new Login_steps();
	ProcessFilling PF =new ProcessFilling(User.driver);
	CreateUser CS =new CreateUser(User.driver);
	ProcessCreation PC =new ProcessCreation(User.driver);
	MLRA_process MS = new MLRA_process(User.driver);

	
	
	@When("^User enters Audit MLRA Process name")
	public void Audit_ProcessName() {
		PC.ProcessName =	"Audit MLRA " + CS.getCurrentTimeStamp();
		PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User enters DC MLRA Process name")
	public void DC_ProcessName() {
		PC.ProcessName =	"DC MLRA " + CS.getCurrentTimeStamp();
		PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User enters Appraisal MLRA Process name")
	public void Appraisal_ProcessName() {
		PC.ProcessName =	"Appraisal MLRA " + CS.getCurrentTimeStamp();
		PC.Process_name().sendKeys(PC.ProcessName);
	}
	@When("^User click on gear button for 1st question")
	public void Ques1_gearbtn() {
	MS.gearIconQues1().click();
	
	}
	@When("^User click on gear button for 2nd question")
	public void Ques2_gearbtn() {
	MS.gearIconQues2().click();
	
	}
	
	@When("^User click on gear button for 3rd question")
	public void Ques3_gearbtn() {
	MS.gearIconQues3().click();
	
	}
	@When("^User click on require Action Checkbox")
	public void requireActionCheckbox() {
	MS.requireActionCheckbox().click();
	
	}
	@When("^User fill 1 in require level Textkbox")
	public void requirelevel_1() {
	MS.requirelevelTextkbox().clear();
	MS.requirelevelTextkbox().sendKeys("1");
	
	}
	@When("^User fill 2 in require level Textkbox")
	public void requirelevel_2() {
	MS.requirelevelTextkbox().clear();
	MS.requirelevelTextkbox().sendKeys("2");
	}
	@When("^User fill 3 in require level Textkbox")
	public void requirelevel_3() {
	MS.requirelevelTextkbox().clear();
	MS.requirelevelTextkbox().sendKeys("3");
	}
	@When("^User click on Apply button for question config")
	public void quesConfigApplyBtn() throws InterruptedException {
		Thread.sleep(2000);
	MS.quesConfigApplyBtn().click();
	
	}
	@When("^User click on Done button for closer condition")
	public void closerConditionDoneBtn() throws InterruptedException {
		Thread.sleep(2000);
	MS.closerConditionDoneBtn().click();
	
	}
	@When("^User click on choose Optionbased Closure condition")
	public void chooseOptionbasedClosure() throws InterruptedException {
		Thread.sleep(2000);
	MS.chooseOptionbasedClosure().click();
	
	}
	@When("^Level 0: user fill and assign to user Gourav")
	public void assignProcesstolevel1_Gourav() throws InterruptedException  {
	
	MS.assignProcesstolevel1();
	
	}
	
	@When("^MLRA: user fill answer1")
	public void MLRAanswer1()  {
	
	MS.MLRA_ans1().sendKeys("Answer1");
	
	}
	@When("^MLRA: user fill answer2")
	public void MLRAanswer2()  {
	
	MS.MLRA_ans2().sendKeys("Answer2");
	
	}
	@When("^MLRA L1:user click on start")
	public void StartMLRA_L1()  {
	
	MS.StartMLRA_L1().click();
	
	}
	@When("^MLRA L1:user click on update to submit")
	public void level1_submit() throws InterruptedException  {
	
	MS.level1_submit().click();
	Thread.sleep(4000);
	
	}
}


//And User click on gear button for 3rd question
//And User click on require Action Checkbox
//And User fill 2 in require level Textkbox
//And User click on Apply button for question config

