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
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Task_steps {
	public static String taskTitle = "";
	Login_steps user = new Login_steps();
	CreateUser CS =new CreateUser(user.driver);
	Task task = new Task(user.driver);
	
	
	
	
	
	@When("^User click on todo Button for task")
	public void clickTodoButton() {
		task.Todo().click();
		System.out.println(taskTitle);
	}
	
	@When("^User click on create Button for task")
	public void clickCreateButton() {
		task.CreateBtn_Todo().click();
	}
	
	@When("^User click on New Task Button")
	public void newTask_Todo() {
		task.newTask_Todo().click();
	}
	
	@When("^User fill task title")
	public void task_Title() {
		taskTitle="Task" + CreateUser.getCurrentTimeStamp();
		task.task_Title().sendKeys(taskTitle);
		System.out.println(taskTitle);
	}
	
	
	@When("^User fill Task Detail")
	public void task_Detail() {
		task.task_Detail().sendKeys(taskTitle);
	}
	
	@When("^User enter asignee name in search field")
	public void task_AddUserSearch() throws InterruptedException {
		
		Thread.sleep(2000);
		task.task_AddUserSearch().sendKeys("Gou");
		Thread.sleep(2000);
		task.task_AddUserSearch().sendKeys("rav");
		
	}
	
	@When("^User select user from the suggetions list")
	public void selectName_TalkAssignee() throws InterruptedException {
		Thread.sleep(4000);
		task.selectName_TalkAssignee().click();
	}
	
	@When("^User click calendar for task")
	public void calendarClick_Task() {
		task.calendarClick_Task().click();
	}
	
	@When("^User select current date for task due date")
	public void selectCurrentDate() {
		task.selectCurrentDate().click();
	}
	
	@When("^User click on create task button")
	public void createTaskBtn() throws InterruptedException {
		task.createTaskBtn().click();
		Thread.sleep(5000);
	}
	
	
	@When("^User click on task in todo")
	public void todoOpenTask() throws InterruptedException 
	{   Thread.sleep(2000);
	System.out.println(taskTitle);
		task.todoOpenTask(taskTitle).click();
	}
	
	
	
	@When("^User enter text for comment")
	public void TaskComment() throws InterruptedException {
		Thread.sleep(2000);
		task.TaskComment().sendKeys("Comment Automated");
	}
	
	
	@When("^User click on comment btn")
	public void TaskCommentBtn() {
		task.TaskCommentBtn().click();
	}
	
	@When("^User click on Complete task btn")
	public void TaskCompleteBtn() throws InterruptedException {
		Thread.sleep(2000);
		task.taskCompleteBtn().click();
	}
	@When("^User click on Task Complete Done btn")
	public void CommentDone() throws InterruptedException {
		Thread.sleep(2000);
		task.CommentDone().click();
	}
	
	
	
	@When("^User click on Task Assign to group checkbox")
	public void taskAssignTogroupCheck() throws InterruptedException {
		Thread.sleep(2000);
		task.taskAssignTogroupCheck().click();
	}
	
	
	@When("^User enter Group name in search field")
	public void task_AddGroupSearch() throws InterruptedException {
		
		Thread.sleep(2000);
		task.enterGroupName().sendKeys("QA ");
		Thread.sleep(2000);
		task.enterGroupName().sendKeys("gourav");
		
	}
	
	
	@When("^User click on I am on it button")
	public void IamOnIt_Btn() throws InterruptedException {
		Thread.sleep(2000);
		task.IamOnIt_Btn().click();
	}
	
	@When("^User click on Release button")
	public void Release_Btn() throws InterruptedException {
		Thread.sleep(5000);
		task.Release_Btn().click();
	}
	
	@When("^User click on Group Task Complete button")
	public void groupTaskComplete_Btn() throws InterruptedException {
		Thread.sleep(5000);
		task.groupTaskComplete_Btn().click();
	}
	
	
	@When("^User click on pending with Others tab")
	public void pendingWithOthersTab() throws InterruptedException {
		Thread.sleep(5000);
		task.pendingWithOthersTab().click();
	}
	
	@When("^User Open Task in pending With Others Tab")
	public void OpenTask_in_pendingWithOthersTab() throws InterruptedException {
		Thread.sleep(5000);
		task.OpenTask_in_pendingWithOthersTab(taskTitle).click();
	}
	
	@When("^User click on Conclude button")
	public void concludeGroupTask() throws InterruptedException {
		Thread.sleep(5000);
		task.concludeGroupTask().click();
	}
	
	@When("^User Add Conclude comment")
	public void conclude_comment_Task() throws InterruptedException {
		Thread.sleep(5000);
		task.conclude_comment_Task().sendKeys("Conclude Comment");
	}
	
	@When("^User click on Conclude comment done button")
	public void conclude_comment_DoneBtn() throws InterruptedException {
		
		task.conclude_comment_DoneBtn().click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
}
