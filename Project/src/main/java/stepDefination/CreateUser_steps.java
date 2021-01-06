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

public class CreateUser_steps{
	Login_steps User = new Login_steps();
	CreateUser CS =new CreateUser(User.driver);
	
	@When("^User click on the user icon on the Producer page")
	public void clickUserButton() {
		CS.ClickUserBTN().click();
	}
	
	@When("^User enters the firstname of new user")
	public void EnterFirstname() {
		CS.User_FirstName().sendKeys("FN" + CS.getCurrentTimeStamp());
	}
	
	@When("^User enters the Lastname of new user")
	public void EnterLastname() {   
		CS.User_LastName().sendKeys("LN");
	}
	
	@When("^User enters the Email of new user")
	public void Enter_Email() {   
		CS.User_Email().sendKeys("test" + CS.getCurrentTimeStamp()+"@gmail.com");
	}
	
	@When("^User selects content creation checkbox")
	public void Select_contentcreation() {   
		CS.ContentCreation().click();
	}
	
	@When("^User selects View Reports checkbox")
	public void Select_ViewReports() {   
		CS.ViewReports().click();
	}
	
	@When("^User selects HRViewRights checkbox")
	public void Select_HRViewRights() {   
		CS.HRViewRights().click();
	}
	
	@When("^User selects Message InboxRights checkbox")
	public void Select_MessageInboxRights() {   
		CS.MessageInboxRights().click();
	}
	
	@When("^User selects Media ManagementRights checkbox")
	public void Select_MediaManagementRights() {   
		CS.MediaManagementRights().click();
	}
	@When("^User selects User ManagementRights checkbox")
	public void Select_UserManagementRights() {   
		CS.UserManagementRights().click();
	}
	@When("^User click on save user button")
	public void SaveUser() {   
		CS.SaveUser().click();
	}
	@When("^User click on ok button of confirmation")
	public void SuccessPopup() {   
		CS.SuccessPopup().click();
		System.out.println("User created");
	}
}