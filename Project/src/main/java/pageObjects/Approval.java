package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Approval {
	
	public WebDriver driver = null;
	public Approval(WebDriver driver) {
		this.driver = driver;
	}
	
   
	
	public WebElement newApproval_Todo() {
		return driver.findElement(By.xpath("//div[@id='new-appr']"));
		
	}
	
	
	public WebElement approval_Title() {
		return driver.findElement(By.xpath("(//input[@class='header-input-rp'])[2]"));
		
	}
	
	public WebElement approval_Detail() {
		return driver.findElement(By.xpath("(//textarea[@class='header-textarea-rp'])[2]"));
		
	}
	
	public WebElement approval_AddUserSearch() {
		return driver.findElement(By.xpath("//input[@id='search-name-popup-approval']"));
		
	}
	
	public WebElement selectName_ApprovalAssignee() {
		 return driver.findElement(By.xpath("(//div[@id='search-res-text-approval'])[1]"));
		
	}
	

	public WebElement createApprovalBtn() {
		return driver.findElement(By.xpath("//*[@class='create-approval-button']"));
	}

	public WebElement todoOpenTask(String TaskName) {
		return driver.findElement(By.xpath("//div[@title='"+TaskName+"']"));
	}
	public WebElement approvalComment() {
		return driver.findElement(By.xpath("//textarea[@class='user-com textarea-tdo comment-textarea-fix']"));
	}
	
	public WebElement approvalCommentBtn() {
		return driver.findElement(By.xpath("//button[@class='comment-btn']"));
	}
	public WebElement approvalApproveBtn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Approve')]"));
	}

	
	public WebElement CommentDone() {
		return driver.findElement(By.className("popup-button-tdo-exp"));
	}
	
	public WebElement approvalRejectBtn() {
		return driver.findElement(By.xpath("//div[contains(text(),'Reject')]"));
	}	
}
