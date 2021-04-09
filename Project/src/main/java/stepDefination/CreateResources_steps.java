package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateResources;
import pageObjects.CreateStore;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.Talk;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateResources_steps{
	Login_steps User = new Login_steps();
	CreateResources CS =new CreateResources(User.driver);
	
	
	@When("^User click on the Resource tab")
	public void click_resourcetab() {
		CS.ClickResourcestab().click();
	}
	
	@When("^User click on the add new Resource")
	public void click_addnewresource() {
		CS.click_AddResource().click();
	}
	@When("^User enters the Name of new resource")
	public void EnterResourceName() {
		CS.resource_name();
	}
	
	@When("^User enters the Defination of new resource")
	public void EnterDefination() {   
		CS.resource_Defination().sendKeys("Defination " + CS.getCurrentTimeStamp());
	}
	
	@When("^User choose Resource type as store")
	public void Select_StoreType() {   
		CS.store_radiobtn().click();
	}
	@When("^User click on store list")
	public void select_Stores() {   
		CS.select_Stores().click();
	}
	
	
	@When("^User selects all stores")
	public void Store_selectAll() {   
		CS.select_all().click();
	}
	@When("^User click on done button after selection")
	public void Select_doneBtn() {   
		CS.Select_doneBtn().click();
	}
	
	@When("^User search for manager")
	public void manager() {   
		CS.manager().sendKeys("Gourav");
	}
	@When("^User select manager from Dropdown")
	public void Store_countryDropdown() throws InterruptedException { 
		Thread.sleep(3000);
	CS.selectManagerName().click();
	}
	@When("^User click on save resource button")
	public void SaveResource() {   
		CS.SaveResource().click();
	}
	@When("^User search for the resource created")
	public void searchResource() {   
		CS.searchResource();
	}
	@When("^User confirm the created resource")
	public void ConfirmationResource() {   
		CS.ConfirmationResource();
	}
}