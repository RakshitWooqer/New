package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateStore;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.Talk;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateStore_steps{
	Login_steps User = new Login_steps();
	CreateStore CS =new CreateStore(User.driver);
	
	
	@When("^User click on the Store icon on the Producer page")
	public void clickUserButton() {
		CS.ClickStoreBTN().click();
	}
	
	@When("^User enters the Name of new store")
	public void EnterStorename() {
		CS.StoreName().sendKeys("Store " + CS.getCurrentTimeStamp());
	}
	
	@When("^User enters the Display name of new store")
	public void EnterDisplayname() {   
		CS.Store_DisplayName().sendKeys("Disname" + CS.getCurrentTimeStamp());
	}
	
	@When("^User enters the BrandName of new store")
	public void EnterBrandName() {   
		CS.Store_BrandName().sendKeys("Automated Store");
	}
	
	@When("^User enters the Store address of new store")
	public void Store_address() {   
		CS.Store_address().sendKeys("Automated address");
	}
	@When("^User enters the Store Area of new store")
	public void Store_area() {   
		CS.Store_Area().sendKeys("Automated Area");
	}
	
	@When("^User click on Country of new store")
	public void Store_countryName() {   
		CS.Store_countryName().click();
	}
	@When("^User select India from Dropdown")
	public void Store_countryDropdown() throws InterruptedException { 
		Thread.sleep(3000);
	CS.Country_select("India");
	}
	@When("^User click on State of new store")
	public void Store_StateName() {   
		CS.Store_StateName().sendKeys("Assam");
	}
	@When("^User select Assam from Dropdown")
	public void Store_StateDropdown() throws InterruptedException { 
		Thread.sleep(3000);
	CS.State_select().click();
	}
	@When("^User click on City of new store")
	public void Store_CityName() {   
		CS.Store_CityName().click();
	}
	@When("^User select city from Dropdown")
	public void Store_CityDropdown() throws InterruptedException {   
		Thread.sleep(3000);
	CS.City_select().click();
	}
	@When("^User fill on Zip of new store")
	public void Store_Zip() {   
		CS.Store_Zip().sendKeys("460033");
	}
	
	@When("^User click on SaveStore")
	public void SaveStore() {   
		CS.SaveStore().click();
	}
//	@When("^User selects content creation checkbox")
//	public void Select_contentcreation() {   
//		CS.ContentCreation().click();
//	}
//	
//	@When("^User selects View Reports checkbox")
//	public void Select_ViewReports() {   
//		CS.ViewReports().click();
//	}
//	
//	@When("^User selects HRViewRights checkbox")
//	public void Select_HRViewRights() {   
//		CS.HRViewRights().click();
//	}
//	
//	@When("^User selects Message InboxRights checkbox")
//	public void Select_MessageInboxRights() {   
//		CS.MessageInboxRights().click();
//	}
//	
//	@When("^User selects Media ManagementRights checkbox")
//	public void Select_MediaManagementRights() {   
//		CS.MediaManagementRights().click();
//	}
//	@When("^User selects User ManagementRights checkbox")
//	public void Select_UserManagementRights() {   
//		CS.UserManagementRights().click();
//	}
//	@When("^User click on save user button")
//	public void SaveUser() {   
//		CS.SaveUser().click();
//	}
//	@When("^User click on ok button of confirmation")
//	public void SuccessPopup() {   
//		CS.SuccessPopup().click();
//		System.out.println("User created");
//	}
}