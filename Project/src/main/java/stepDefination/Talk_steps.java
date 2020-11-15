package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Login;
import pageObjects.Talk;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Talk_steps {
	Login_steps talk1 = new Login_steps();
	
	@When("^User click on the Talk Button")
	public void clickTalkButton() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkBtn().click();
}
	@When("^User enter the text on the talk page")
	public void talkText() {
		Talk talk=new Talk(talk1.driver);
		talk.TalkText().sendKeys("test talk");
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
		talk.passwordBTN().sendKeys("Wooqer@1234");
		Thread.sleep(2000);
	}

	
}
