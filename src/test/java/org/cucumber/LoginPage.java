package org.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NewPages.LoginPageObjects;
import io.cucumber.java.en.*;

public class LoginPage{

	WebDriver driver;

	LoginPageObjects login;
	
	@Given("user open crome browser")
	public void user_open_crome_browser() {

		System.setProperty("webdriver.chrome.driver","C:/Users/mathaiah/eclipse-workspace/CucumberNew2/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	
		driver.navigate().to("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	//	driver.manage().window().maximize();
		
	}

	@When("user enter valid (.*) and (.*)")
	public void user_enter_valid_username_and_password(String username,String  password) throws InterruptedException {
	
		login=new LoginPageObjects(driver);
	
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(2000);		
	}

	@When("click on login button")
	public void click_on_login_button() {
	
		login.clickLogin();
		
	}

	@Then("user naviagte home page")
	public void user_naviagte_home_page() {
	
		login.checklogoutisDisplayed();
		
	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
	
		
		login.clickLogin();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}


}
