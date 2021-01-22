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
import pageObjects.ProcessQuestionValidation;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProcessValidation_Filling
{
	public static WebDriver driver;
	
	Login_steps User = new Login_steps();
	ProcessQuestionValidation PQ =new ProcessQuestionValidation(User.driver);
	CreateUser CS =new CreateUser(User.driver);
	
	
	
	@Then("^User click on DC short validation process in todo")
	public void ClickOnProcess_TodoPage() throws InterruptedException {
		Thread.sleep(8000);
		PQ.Click_Process_TodoPage("DC short validation");
	}
	
	
	@Then("^User Fill Short with text validation Incorrect data")
	public void shortText_Incorrect() {
		PQ.Answer_1().sendKeys("12333");
	}
	@Then("^User Fill Short with text validation correct data")
	public void shortText_Correct() {
		PQ.Answer_1().clear();
		PQ.Answer_1().sendKeys("Text Validate");
	}
	@Then("^User check if Short Text Validation Warning is shown")
	public void Check_ShortTextValidation_Warning() {
		PQ.Check_ShortTextValidation_Warning();
	}
	
	/////////////////////////////////
	
	@Then("^User Fill Short with Number validation Incorrect data")
	public void shortNumber_Incorrect() {
		PQ.Answer_2().sendKeys("Wrong Data");
	}
	@Then("^User Fill Short with Number validation correct data")
	public void shortNumber_Correct() {
		PQ.Answer_2().clear();
		PQ.Answer_2().sendKeys("123");
	}
	@Then("^User check if Short Number Validation Warning is shown")
	public void Check_ShortNumberValidation_Warning() {
		PQ.Check_ShortNumberValidation_Warning();
	}
	
	
	////////////////////////////////
	
	@Then("^User Fill Short with Percentage validation Incorrect data")
	public void shortPercentage_Incorrect() {
		PQ.Answer_3().sendKeys("1425");
	}
	@Then("^User Fill Short with Percentage validation correct data")
	public void shortPercentage_Correct() {
		PQ.Answer_3().clear();
		PQ.Answer_3().sendKeys("92");
	}
	@Then("^User check if Short Percentage Validation Warning is shown")
	public void Check_ShortPercentageValidation_Warning() {
		PQ.Check_ShortPercentageValidation_Warning();
	}
	
	
	////////////////////
	

	@Then("^User Fill Short with Date validation Incorrect data")
	public void shortDate_Incorrect() {
		PQ.Answer_4().sendKeys("1425");
	}
	@Then("^User Fill Short with Date validation correct data")
	public void shortDate_Correct() {
		PQ.Answer_4().clear();
		PQ.Answer_4().sendKeys("92");
	}
	@Then("^User check if Short Date Validation Warning is shown")
	public void Check_ShortDateValidation_Warning() {
		PQ.Check_ShortDateValidation_Warning();
	}
	
	
	/////////////////////////////
	

	@Then("^User Fill Short with Range validation Incorrect data")
	public void shortRange_Incorrect() {
		PQ.Answer_5().sendKeys("1425");
	}
	@Then("^User Fill Short with Range validation correct data")
	public void shortRange_Correct() {
		PQ.Answer_5().clear();
		PQ.Answer_5().sendKeys("40");
	}
	@Then("^User check if Short Range Validation Warning is shown")
	public void Check_ShortRangeValidation_Warning() {
		PQ.Check_ShortRangeValidation_Warning();
	}
	
	//////////////////////
	

	@Then("^User Fill Short with Length validation Incorrect data")
	public void shortLength_Incorrect() {
		PQ.Answer_6().sendKeys("Testing more than 10 characters");
	}
	@Then("^User Fill Short with Length validation correct data")
	public void shortLength_Correct() {
		PQ.Answer_6().clear();
		PQ.Answer_6().sendKeys("Limited");
	}
	@Then("^User check if Short Length Validation Warning is shown")
	public void Check_ShortLengthValidation_Warning() {
		PQ.Check_ShortLengthValidation_Warning();
	}
	
	
	///////////////////
	
	@Then("^User Fill Short with Email validation Incorrect data")
	public void shortEmail_Incorrect() {
		PQ.Answer_7().sendKeys("WrongMail");
	}
	@Then("^User Fill Short with Email validation correct data")
	public void shortEmail_Correct() {
		PQ.Answer_7().clear();
		PQ.Answer_7().sendKeys("Limitedchar@gmail.com");
	}
	@Then("^User check if Short Email Validation Warning is shown")
	public void Check_ShortEmailValidation_Warning() {
		PQ.Check_ShortLengthValidation_Warning();
	}
	
	
	
	/////////////////////////////////////
	
	@Then("^User Fill Short with Zipcode validation Incorrect data")
	public void shortZipcode_Incorrect() {
		PQ.Answer_8().sendKeys("55555555");
	}
	@Then("^User Fill Short with Zipcode validation correct data")
	public void shortZipcode_Correct() {
		PQ.Answer_8().clear();
		PQ.Answer_8().sendKeys("461331");
	}
	@Then("^User check if Short Zipcode Validation Warning is shown")
	public void Check_ShortZipcodeValidation_Warning() {
		PQ.Check_ShortZipcodeValidation_Warning();
	}
	
	
	/////////////////////////////////
	
	
	@Then("^User Fill Mandatory short answer")
	public void shortMandatory_Correct() {
		PQ.Answer_9().sendKeys("Limited char");
	}
	@Then("^User check if Short Mandatory Warning is shown")
	public void Check_ShortMandatoryValidation_Warning() {
		PQ.Check_ShortZipcodeValidation_Warning();
	}
	
	////////////////////////////////
	
	@Then("^User Fill Score with Range validation Incorrect answer")
	public void ScoreRange_InCorrect() {
		PQ.Answer_10().sendKeys("Limited char");
	}
	@Then("^User Fill Score with Range validation correct data")
	public void ScoreRange_Correct() {
		PQ.Answer_10().clear();
		PQ.Answer_10().sendKeys("20");
	}
	@Then("^User check if Score with Range validation Warning is shown")
	public void Check_ScoreRangeValidation_Warning() {
		PQ.Check_ScoreRangeValidation_Warning();
	}
	
	///////////////////////////////////////
	
	
	@Then("^User check if process is submitted")
	public void ProcessSubmission_ConfirmBox() throws InterruptedException {
		Thread.sleep(6000);
		PQ.ProcessSubmission_ConfirmBox();
	}
	
}





	
