package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Login;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_steps
{
	public static WebDriver driver;
	
	@Before public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				}
	
	@Given("^I am on QA homepage$")
	public void goToTuto() {
		driver.get("https://qa.wooqer.com");
		
	}
	
	@When("^User enters the Nimish username")
	public void clickusernameNimish() throws InterruptedException {
		Login login = new Login(driver);
		login.usernameBTN().sendKeys("nimish@wooqer.com");
	}
	
	@When("^User enters the Nimish password")
	public void enterpasswordNimish() throws InterruptedException {
		Login login = new Login(driver);
		login.passwordBTN().sendKeys("Wooqer@123");
		Thread.sleep(2000);
		
	}
	@When("^User enters the Gourav username")
	public void clickusernameGourav() throws InterruptedException {
		Login login = new Login(driver);
		login.usernameBTN().sendKeys("Gourav@wooqer.com");
	}
	
	@When("^User enters the Gourav password")
	public void enterpasswordGourav() throws InterruptedException {
		Login login = new Login(driver);
		login.passwordBTN().sendKeys("Wooqer@123");
		Thread.sleep(2000);
		
	}
	@When("^User clicks on the signin button")
	public void login() {
		Login login= new Login(driver);
		login.loginclk();
	}
	
	@When("^User verify the homepage tittle to check whether login is working or not")
	public void homepage() {
		Login login= new Login(driver);
		String title = login.HomepageTitle().getText();
		System.out.println(title + " is Visible, Login succesfull");
	
}
}

