package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task {
	
	public WebDriver driver = null;
	public Task(WebDriver driver) {
		this.driver = driver;
	}
	
   public WebElement Todo() {
	   return driver.findElement(By.xpath("//div[@id='h_todo']"));
	   
   }
   
	public WebElement CreateBtn_Todo() {
	    return driver.findElement(By.xpath("//div[@id='plusIcon']"));
		
	}
	
	public WebElement newTask_Todo() {
		return driver.findElement(By.xpath("//div[@id='new-task']"));
		
	}
	
	
	public WebElement task_Title() {
		return driver.findElement(By.xpath("//input[@id='task-title-text']"));
		
	}
	
	public WebElement task_Detail() {
		return driver.findElement(By.xpath("//textarea[@id='task-detail-text']"));
		
	}
	
	public WebElement task_AddUserSearch() {
		return driver.findElement(By.xpath("//input[@id='talk-add-user']"));
		
	}
	
	public WebElement selectName_TalkAssignee() {
		 return driver.findElement(By.xpath("(//*[@class='search-res-text'])[1]"));
		
	}
	
	public WebElement calendarClick_Task() {
		return driver.findElement(By.xpath("//input[@id='task-due-date']"));
		
	}
	public WebElement selectCurrentDate() {
		return driver.findElement(By.xpath("//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
	}
	
	public WebElement createTaskBtn() {
		return driver.findElement(By.xpath("//*[@class='create-task-button']"));
	}

	public WebElement todoOpenTask(String TaskName) {
		return driver.findElement(By.xpath("//div[@title='"+TaskName+"']"));
	}
	public WebElement TaskComment() {
		return driver.findElement(By.xpath("//textarea[@class='user-com textarea-tdo comment-textarea-fix']"));
	}
	
	public WebElement TaskCommentBtn() {
		return driver.findElement(By.xpath("//button[@class='comment-btn']"));
	}
	public WebElement taskCompleteBtn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Complete')]"));
	}

	
	public WebElement CommentDone() {
		return driver.findElement(By.className("popup-button-tdo-exp"));
	}
	
	public WebElement taskAssignTogroupCheck() {
		return driver.findElement(By.xpath("//input[@id='is-assign-group']"));
		
	}
	
	public WebElement enterGroupName() {
		return driver.findElement(By.xpath("//input[@id='talk-add-group']"));
		
	}
	public WebElement SelectGroupName() {
		return driver.findElement(By.xpath("(//div[@class='search-res-text search-res-text-hover'])[1]"));
	
	}
	
	public WebElement IamOnIt_Btn() {
		return driver.findElement(By.xpath("//button[contains(text(),\"I'm on it\")]"));
	}
	
	public WebElement Release_Btn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Release')]"));
	}
	
	public WebElement groupTaskComplete_Btn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Complete')]"));
	}
	
	public WebElement pendingWithOthersTab() {
		return driver.findElement(By.xpath("//span[@id='rpwo-sec']"));
	}
	
	
	public WebElement OpenTask_in_pendingWithOthersTab(String TaskName) {
		return driver.findElement(By.xpath("//div[@class='second-col-tdo tdo-table-details-text'][contains(text(),'"+ TaskName+"')]"));
	}
	
	
	public WebElement concludeGroupTask() {
		return driver.findElement(By.xpath("//button[@class='start-tdo'][contains(text(),'Conclude')]"));
	}
	
	public WebElement conclude_comment_Task() {
		return driver.findElement(By.className("popup-comment-textarea-tdo"));
	}
	
	public WebElement conclude_comment_DoneBtn() {
		return driver.findElement(By.xpath("//button[@class='popup-button-tdo-exp'][contains(text(),'Conclude')]"));
	}
//	
//	public WebElement concludeTalkBoxclick() {
//		return driver.findElement(By.xpath("//textarea[@class='comment-for-talk-textarea conclude-comment-textarea']"));
//	}
//	
//	public WebElement concludemsg1() {
//		return driver.findElement(By.xpath("//textarea[@class='comment-for-talk-textarea conclude-comment-textarea']"));
//		
//	}
//	
//	public WebElement concludeTalk() {
//		return driver.findElement(By.xpath("//button[text()='Conclude']"));
//	}
//	
//	public void everyone() {
//		driver.findElement(By.xpath("//div[@id='select-everyone']")).click();
//	}
//	
}
