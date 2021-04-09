package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateResources;
import pageObjects.CreateRole;
import pageObjects.CreateStore;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.Talk;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateRole_steps{
	Login_steps User = new Login_steps();
	CreateRole CS =new CreateRole(User.driver);
	
	
	@When("^User click on the Roles tab")
	public void click_rolestab() {
		CS.ClickRolestab().click();
	}
	
	@When("^User click on the add new Role")
	public void click_addnewrole() {
		CS.click_AddRoles().click();
	}
	@When("^User enters the Name of new role")
	public void EnterResourceName() {
		CS.roles_name();
	}
	
	@When("^User click on Functions Dropdown")
	public void role_selectFunctionDropdown() {   
		CS.role_selectFunctionDropdown().click();
	}
	
	@When("^User choose function option From Dropdown")
	public void selectoption_From_Dropdown() {   
		CS.selectoption_FromDropdown().click();
	}
	@When("^User click on Topline checkbox")
	public void select_Topline_checkbox() {   
		CS.select_Topline_checkbox().click();
	}
	
	
	
	@When("^User click on save role button")
	public void SaveResource() {   
		CS.SaveRole().click();
	}
	@When("^User search for the role created")
	public void searchResource() throws InterruptedException {  
		Thread.sleep(4000);
		CS.searchRole();
	}
	@When("^User confirm the created role")
	public void ConfirmationResource() {   
		CS.ConfirmationRole();
	}
}