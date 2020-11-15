package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Talk {
	
	public WebDriver driver = null;
	public Talk(WebDriver driver) {
		this.driver = driver;
	}

   public WebElement TalkBtn() {
	   return driver.findElement(By.xpath("//div[@id='h_talk']"));
	   
   }
   
	public WebElement TalkText() {
	    return driver.findElement(By.xpath("//textarea[@id='talk-textarea']"));
		
	}
	
	public WebElement TalkShareWithClk() {
		return driver.findElement(By.xpath("//input[@id='talk-add-user']"));
		
	}
	
	public WebElement TalkAutoShareName() {
		 return driver.findElement(By.xpath("//div[contains(text(),'Sasi')]"));
		
	}
	
	public WebElement TalkShareField() {
		return driver.findElement(By.xpath("//button[@class='share-button-talk']"));
		
	}
	
	public WebElement TalkProfileicon() {
		return driver.findElement(By.xpath("//div[@class='user-img-wrap']"));
		
	}
	
	public WebElement TalkSignout() {
		return driver.findElement(By.xpath("//div[@class='icon dd-icon-profile icon-exit2']"));
		
	}
	public WebElement usernameBTN() {
		return driver.findElement(By.xpath("//input[@id='username']"));
	}
	
	public WebElement passwordBTN() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	
	
	public void TalkComment() {
	   driver.findElement(By.xpath("//textarea[@class='comment-for-talk-textarea comment-textarea']")).click();
		
	}
	
	public WebElement EnterTalkcomment() {
		return driver.findElement(By.xpath("//textarea[@class='comment-for-talk-textarea comment-textarea']"));
		
	}
	public void ClickCommentBTN() {
		driver.findElement(By.xpath("//button[@class='comment-talk-button add-comment-button'][1]")).click();
	
	}
	
	public void clickOnEndorse() {
		driver.findElement(By.xpath("//span[text()=' Endorse']")).click();
	}
	
	public void clickOnConclude() {
		driver.findElement(By.xpath("//span[text()=' Conclude']")).click();
	}
	
	public void concludeTalkBoxclick() {
		driver.findElement(By.xpath("//textarea[@class='comment-for-talk-textarea conclude-comment-textarea']"));
	}
	
	public WebElement concludemsg1() {
		return driver.findElement(By.xpath("//textarea[@class='comment-for-talk-textarea conclude-comment-textarea']"));
		
	}
	
	public void concludeTalk() {
		driver.findElement(By.xpath("//button[text()='Conclude']")).click();
	}
	
	public void everyone() {
		driver.findElement(By.xpath("//div[@id='select-everyone']")).click();
	}
	
}
