package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CommonObjects;;

public class ChapterModule {
	
	public WebDriver driver = null;
	public ChapterModule(WebDriver driver) {
		this.driver = driver;
	}
	CommonObjects CB = new CommonObjects(driver);
    Date dt = new Date();
    public String append = new SimpleDateFormat("hhmmsss").format(dt);
	
    public void rename_ModuleFile(String file_NewName) {
    	
		driver.findElement(By.xpath("//a[contains(text(),'Rename')]")).click();
		 driver.findElement(By.name("setTheChapterName")).sendKeys(file_NewName);
		 driver.findElement(By.className("saveRenamedFile")).click();
	}
    
	public WebElement chapterTab() {
		return driver.findElement(By.xpath("//a[contains(text(),'Chapters')]"));
		
	}
	
	
	public WebElement chapterAddNew() {
		return driver.findElement(By.xpath("//span[contains(text(),'Add New')]"));
		
	}
	
	public WebElement chapterName() {
		return driver.findElement(By.xpath("//input[@id='chapterName']"));
		
	}
	
	public WebElement chapterSummary() {
		return driver.findElement(By.xpath("//textarea[@id='summary']"));
		
	}
	
	
	

	public void selectChapterfile(String filePath) {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), filePath);
	}
	public void selectChapterPDF() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), "C:\\Users\\golab\\Desktop\\release notes\\Release Notes 2021_01.pdf");
	}
	
	public WebElement chapterAddNewQuestion() {
		return driver.findElement(By.xpath("//a[@id='addChapter']"));
	}
	
	
	public WebElement chapterClosingText() {
		return driver.findElement(By.xpath("//input[@id='closingText']"));
	}
	
	public WebElement chapterSaveBtn() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tempUploadInput']")));
		 
		 
	}
	
	public WebElement chapterSharePopup() {
		return driver.findElement(By.xpath("//button[contains(text(),'Share')]"));
	}
	
	
	public WebElement moduleName() {
		return driver.findElement(By.xpath("//input[@id='name']"));
	}
	
	
	public WebElement moduleObjective() {
		return driver.findElement(By.xpath("//input[@id='objective']"));
	}
	
	public WebElement moduleSummary() {
		return driver.findElement(By.xpath("//textarea[@id='summary']"));
	}
	
	public void selectModule_jpg() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), System.getProperty("user.dir") +"/fileUploads/image_Jpg_file.jpg");
		rename_ModuleFile("JPG "+append);
	}
	public void selectModule_PDF() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), System.getProperty("user.dir") +"/fileUploads/doc_pdf_file.pdf");
		String temp ="PDF "+append;
		rename_ModuleFile(temp);
	}
	
	public void selectModule_Excel() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), System.getProperty("user.dir") +"/fileUploads/XLS_file.xls");
		rename_ModuleFile("Excel "+append);
	}
	public void selectModule_Mp4() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), System.getProperty("user.dir") +"/fileUploads/sample_mp4_file.mp4");
		rename_ModuleFile("Mp4 "+append);
		}
	
	public void selectModule_Mov() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), System.getProperty("user.dir") +"/fileUploads/sample_mov_file.mov");
		rename_ModuleFile("Mov "+append);
	}
	public void selectModule_Ppt() {
		CB.SelectFile_local(driver.findElement(By.name("qqfile")), System.getProperty("user.dir") +"/fileUploads/example_PPT_file.ppt");
		rename_ModuleFile("PPT "+append);
	}
	
	public WebElement upgrade_radioBtn() {
		return driver.findElement(By.xpath("//input[@id='type2']"));
	}
	public WebElement spotlight_radioBtn() {
		return driver.findElement(By.xpath("//input[@id='type3']"));
	}
	
	public WebElement customtype_Text() {
		return driver.findElement(By.xpath("//input[@id='customType']"));
	}
	
	public WebElement moduleDuration() {
		return driver.findElement(By.xpath("//input[@id='duration']"));
	}
	

	
	
	public WebElement moduleSave_Btn() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='moduleFormSubmitButton']")));
		 	 
	}
	
	public WebElement moduleAssign_PopupBtn() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Assign')]")));
		 	 
	}

	
	
	public WebElement moduleAssign(String UserName) {
		return driver.findElement(By.xpath("//td[contains(text(),'"+UserName+"')]/following-sibling::td[4]/*[contains(text(),'Assign')]"));
	}
	

	public WebElement moduleActivateBtn() {
		return driver.findElement(By.xpath("//a[@id='activateDeactivateModule']"));
	}
	
	public WebElement home_tab() {
		return driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
	}
	
	public WebElement clickOn_Module(String moduleName) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'"+ moduleName +"')]")));
		
	}
	public WebElement clickOn_chapterHome(String chapterName) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='"+chapterName+"']")));
		
		
	}
	
	public WebElement clickOn_chapterComplete() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		return wait.until(ExpectedConditions.elementToBeClickable(By.className("mark-complete-button")));
		
	}
	
	
	public WebElement chapterHome_JPG() {
		return driver.findElement(By.xpath("(//a[contains(text(),'JPG')])[1]"));
	}
	public WebElement chapterHome_Mp4() {
		return driver.findElement(By.xpath("(//a[contains(text(),'Mp4')])[1]"));
	}
	
	public WebElement chapterHome_Excel() {
		return driver.findElement(By.xpath("(//a[contains(text(),'Excel')])[1]"));
	}
	public WebElement chapterHome_PDF() {
		return driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[1]"));
	}
	
	public WebElement chapterHome_Mov() {
		return driver.findElement(By.xpath("(//a[contains(text(),'Mov')])[1]"));
	}
	
	
	public WebElement chapterHome_PPT() {
		return driver.findElement(By.xpath("(//a[contains(text(),'PPT')])[1]"));
	}
	
	
	public void validateVideoUpload() {
	 
		
		WebElement e =driver.findElement(By.xpath("//div[@class='chap-videos']/*/video[@id='chapter-video-audio']"));
		
		//driver.findElement(By.xpath("//div[@id='content_not_available']"));
        //driver.findElement(By.xpath("//div[@id='content_not_ready']"));
		
		if(e.isDisplayed()==true) {
			System.out.println("Video File is loading");
		}
		else 
			System.out.println("Error: Video Content is not rendering");
	}
	
public void validatePDFImageUpload() {
	 
		
		WebElement e =driver.findElement(By.xpath("//div[@id='pdf-main-container']//div[@id='pdf-contents']"));
		
		//driver.findElement(By.xpath("//div[@id='content_not_available']"));
        //driver.findElement(By.xpath("//div[@id='content_not_ready']"));
		if(e.isDisplayed()==true) {
			System.out.println("File is loading");
		}
		else 
			System.out.println("Error: Content is not loading");
	}
	
	public WebElement pdfCanvas_Viewer() {
		return driver.findElement(By.xpath("//canvas[@id='pdf-canvas']"));
		
	}
	
	
	
	
}





