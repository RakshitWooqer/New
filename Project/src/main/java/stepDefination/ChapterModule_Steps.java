package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.ChapterModule;
import pageObjects.CommonObjects;
import pageObjects.CreateUser;
import pageObjects.Login;
import pageObjects.Talk;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class ChapterModule_Steps {
	Login_steps talk1 = new Login_steps();
	ProcessCreation_steps PC = new ProcessCreation_steps();
	ChapterModule CM =new ChapterModule(talk1.driver);
	
	public static String chapterName="";
	public static String moduleName="";
	
	
	@When("^User click on the Chapter tab")
	public void clickTalkButton() {
		CM.chapterTab().click();
	}
	
	@When("^User click on the Chapter Add New")
	public void chapterAddNew() throws InterruptedException {
		CM.chapterAddNew().click();
		Thread.sleep(2000);
	}
	
	@When("^User enter the chapter Name")
	public void talkText() {
		chapterName = "Chapter Auto" + CommonObjects.getCurrentTimeStamp();
		CM.chapterName().sendKeys(chapterName);
	
	}
	
	@When("^User enter the chapter Summary")
	public void chapterSummary() {
		
		CM.chapterSummary().sendKeys("Automated Chapter summary");
	
	}
		
	@When("^User selects the image for chapter")
	public void selectChapterfileImage() throws InterruptedException {
		CM.selectChapterfile(System.getProperty("user.dir") +"/fileUploads/doc_pdf_file.pdf");
		Thread.sleep(2000);
	}


	

	@When("^User click on Add new btn question for chapter")
	public void chapterAddNewQuestion() throws InterruptedException {
		
		CM.chapterAddNewQuestion().click();
		Thread.sleep(6000);
	}
	
	@When("^User click on save chapter Button")
	public void chapterSaveBtn() throws InterruptedException {
	    Thread.sleep(3000);
		CM.chapterSaveBtn().click();
	
	}
	
	
	@When("^User click on Share chapter Button")
	public void chapterSharePopup() {
		
		CM.chapterSharePopup().click();
	
	}
	
	
	@When("^User enter module name")
	public void moduleName() {
		moduleName = "Module Auto" + CommonObjects.getCurrentTimeStamp();
		
		CM.moduleName().sendKeys(moduleName);
	
	}
	
	@When("^User enter module objective")
	public void moduleObjective() {
		
		CM.moduleObjective().sendKeys(moduleName);
	
	}
	
	@When("^User enter module summary")
	public void moduleSummary() {
		
		CM.moduleSummary().sendKeys(moduleName);
	
	}
	
	@When("^User add PDF for module")
	public void selectModulePDF() throws InterruptedException {
		CM.selectModule_PDF();
		Thread.sleep(2000);
		
	}
	
	@When("^User add Mp4 for module")
	public void selectModule_Mp4() throws InterruptedException {
		CM.selectModule_Mp4();
		Thread.sleep(2000);
		
	}
	
	@When("^User add Jpg for module")
	public void selectModule_jpg() throws InterruptedException {
		CM.selectModule_jpg();
		Thread.sleep(2000);
	}
	
	@When("^User add Mov for module")
	public void selectModule_Mov() throws InterruptedException {
		CM.selectModule_Mov();
		Thread.sleep(2000);
	}
	
	@When("^User add Excel for module")
	public void selectModule_Excel() throws InterruptedException {
		CM.selectModule_Excel();
		Thread.sleep(2000);
	}
	
	@When("^User add PPT for module")
	public void selectModule_Ppt() throws InterruptedException {
		CM.selectModule_Ppt();
		Thread.sleep(2000);
	}
	
	@When("^User click on spotlight radio Btn")
	public void spotlight_radioBtn() {
		
		CM.spotlight_radioBtn().click();
	
	}
	@When("^User enters custom type Text")
	public void customtype_Text() {
		
		CM.customtype_Text().sendKeys(moduleName);
	
	}
	
	
	@When("^User click on save Module btn")
	public void moduleSave_Btn() throws InterruptedException {
		Thread.sleep(20000);
		CM.moduleSave_Btn().click();
	
	}
	
	
	@When("^User click on assign on popup")
	public void moduleAssign_PopupBtn() {
		
		CM.moduleAssign_PopupBtn().click();
	
	}
	
	@When("^User assign module to Nimish jain")
	public void moduleAssign_NimishUser() {
		
		CM.moduleAssign("Nimish Jain").click();
	
	}
	
	
	@When("^User click on Activate Module")
	public void moduleActivateBtn() throws InterruptedException {
		Thread.sleep(3000);
		CM.moduleActivateBtn().click();
	
	}
	
	@When("^User click on Home tab")
	public void home_tab() {
		
		CM.home_tab().click();
	
	}
	
	@When("^User click on Module in home page")
	public void clickOn_Module() {
		
		CM.clickOn_Module(moduleName).click();
		
	}
	@When("^User click on Chapter in home page")
	public void clickOn_chapterHome() throws InterruptedException {
		Thread.sleep(3000);
		CM.clickOn_chapterHome(chapterName).click();
		Thread.sleep(3000);
		
	}
	
	
	@When("^User click on JPG file Chapter in home page")
	public void chapterHome_JPG() throws InterruptedException {
		Thread.sleep(3000);
		CM.chapterHome_JPG().click();
		Thread.sleep(3000);
	}
	
	@When("^User click on Mp4 file Chapter in home page")
	public void chapterHome_Mp4() throws InterruptedException {
		Thread.sleep(3000);
		CM.chapterHome_Mp4().click();
		Thread.sleep(3000);
	}
	
	
	@When("^User click on Excel file Chapter in home page")
	public void chapterHome_Excel() throws InterruptedException {
		Thread.sleep(3000);
		CM.chapterHome_Excel().click();
		Thread.sleep(3000);
	}
	
	@When("^User click on PPT file Chapter in home page")
	public void chapterHome_PPT() throws InterruptedException {
		Thread.sleep(3000);
		CM.chapterHome_PPT().click();
		Thread.sleep(3000);
	}
	@When("^User click on PDF file Chapter in home page")
	public void chapterHome_PDF() throws InterruptedException {
		Thread.sleep(3000);
		CM.chapterHome_PDF().click();
		Thread.sleep(3000);
	}
	
	
	@When("^User click on Mov file Chapter in home page")
	public void chapterHome_Mov() throws InterruptedException {
		Thread.sleep(3000);
		CM.chapterHome_Mov().click();
		Thread.sleep(3000);
	}
	
	
	
	
	@When("^User click on chapter complete btn")
	public void clickOn_chapterComplete() {
		
		CM.clickOn_chapterComplete().click();
		
	}
	
	@When("^Validate that chapter video content is loading")
	public void contentNotFound_Error() throws InterruptedException {
		Thread.sleep(6000);
		CM.validateVideoUpload();
		
	}
	@When("^Validate that PDF or Image content is loading")
	public void validatePDFImageUpload() throws InterruptedException {
		Thread.sleep(6000);
		CM.validatePDFImageUpload();
		
	}
	
}

