package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.Talk;
import pageObjects.Task;
import pageObjects.Approval;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Approval_steps {
	public static String approvalTitle = "";
	Login_steps user = new Login_steps();
	CreateUser CS =new CreateUser(user.driver);
	Approval approval = new Approval(user.driver);
	
	
	
	
	
	
	
	
	@When("^User click on New Approval Button")
	public void newTask_Todo() {
		approval.newApproval_Todo().click();
	}
	
	@When("^User fill Approval title")
	public void task_Title() {
		approvalTitle="Approval " + CreateUser.getCurrentTimeStamp();
		approval.approval_Title().sendKeys(approvalTitle);
		System.out.println(approvalTitle);
	}
	
	
	@When("^User fill approval Detail")
	public void task_Detail() {
		approval.approval_Detail().sendKeys(approvalTitle);
	}
	
	@When("^User enter Approval asignee name in search field")
	public void task_AddUserSearch() throws InterruptedException {
		
		Thread.sleep(2000);
		approval.approval_AddUserSearch().sendKeys("Gou");
		Thread.sleep(2000);
		approval.approval_AddUserSearch().sendKeys("rav chourasiya");
		
	}
	
	@When("^User select user from the suggetions list Approval")
	public void selectName_TalkAssignee() throws InterruptedException {
		Thread.sleep(4000);
		approval.selectName_ApprovalAssignee().click();
	}
	
	
	
	@When("^User click on create Approval button")
	public void createTaskBtn() throws InterruptedException {
		approval.createApprovalBtn().click();
		Thread.sleep(5000);
	}
	
	
	@When("^User click on approval in todo")
	public void todoOpenApproval() throws InterruptedException 
	{   Thread.sleep(2000);
	System.out.println(approvalTitle);
		approval.todoOpenTask(approvalTitle).click();
	}
	
	
	
	@When("^User enter text for comment Approval")
	public void ApprovalComment() throws InterruptedException {
		Thread.sleep(2000);
		approval.approvalComment().sendKeys("Comment Automated");
	}
	
	
	@When("^User click on Approval comment btn")
	public void approvalCommentBtn() {
		approval.approvalCommentBtn().click();
	}
	
	@When("^User click on Approve btn")
	public void TaskCompleteBtn() throws InterruptedException {
		Thread.sleep(2000);
		approval.approvalApproveBtn().click();
	}
	@When("^User click on Approve Complete Done btn")
	public void CommentDone() throws InterruptedException {
		Thread.sleep(2000);
		approval.CommentDone().click();
	}
}
