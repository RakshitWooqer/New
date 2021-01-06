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
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Talk_steps {
	Login_steps talk1 = new Login_steps();
	CreateUser CS =new CreateUser(talk1.driver);
	
	@When("^User click on the Talk Button")
	public void clickTalkButton() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkBtn().click();
}
	@When("^User enter the text on the talk page")
	public void talkText() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkText().sendKeys("test talk" + CS.getCurrentTimeStamp());
	}
	
	@When("^User click on the share with field and enters the user details")
	public void talkshare() throws InterruptedException {
		Talk talk=new Talk(talk1.driver);
		talk.TalkShareWithClk().click();
		Thread.sleep(2000);
	}
		
		
	@When("^User selects the user from the drop down")
	public void selectuserBTN() throws InterruptedException {
		Talk talk=new Talk(talk1.driver);
		talk.TalkAutoShareName().click();
		Thread.sleep(2000);
	}

	
	@When("^User click on the share button")
	public void talkShareOption() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkShareField().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("^User click on the profile icon")
	public void talkProfile() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkProfileicon().click();
	}
	
	@When("^User click on signout button")
	public void talkSingoutBtn() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkSignout().click();
}
	@When("^User login with the shared user for the talk account")
	public void enterusernameBTN() {
		Talk talk=new Talk(talk1.driver);
		talk.usernameBTN().sendKeys("sasidhar.koti@wooqer.com");
}
	
	
	@When("^User enters the password the above mentioned user")
	public void enterpassBTN() throws InterruptedException {
		Talk talk=new Talk(talk1.driver);
		talk.passwordBTN().sendKeys("Wooqer@123");
		Thread.sleep(2000);
	}

	@When("^User clicks on the comment button on the talk assigned")
	public void commentTalk() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkComment().click();
	}
	
	@When("^User commnets on the talk")
	public void commenttalk() {
		Talk talk=new Talk(talk1.driver);
		talk.EnterTalkcomment().sendKeys("Comment on talk");
	}
	
	@When("^User clicks on the comment button at the bottom section to enter comment on the talk")
	public void commentBTN() {
		Talk talk=new Talk(talk1.driver);
		talk.ClickCommentBTN().click();
	}
	
	@When("^User clicks on the Endore button and endorse the talk")
	public void clickendorse() {
		Talk talk=new Talk(talk1.driver);
		talk.clickOnEndorse().click();
	}
	
	@When("^User clicks on the conclude button")
	public void clickconclude() {
		Talk talk=new Talk(talk1.driver);
		talk.clickOnConclude().click();
	}
	
	@When("^User conclude the task with the comment")
	public void commentconclude() {
		Talk talk=new Talk(talk1.driver);
		talk.concludeTalkBoxclick().click();
	}
	
	@When("^User enters the conclude message")
	public void commconclude() {
		Talk talk=new Talk(talk1.driver);
		talk.concludemsg1().sendKeys("conclude the talk");
	}
	
	@When("^User clicks on the conclude button at the bottom of the conclude section")
	public void clicksconclude() {
		Talk talk=new Talk(talk1.driver);
		talk.concludeTalk().click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
