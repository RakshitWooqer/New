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
	
	
	@When("^User click on the user icon on the Producer page")
	public void clickUserButton() {
		CreateUser CS =new CreateUser(User.driver);
		CS.ClickUserBTN().click();
	}
}