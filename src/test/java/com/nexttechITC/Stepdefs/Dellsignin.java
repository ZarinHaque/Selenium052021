package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.DellsigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellsignin {
	WebDriver driver;
	
	@Given("^User visit dell homepage\\.$")
	public void user_visit_dell_homepage() throws Throwable {
	
		// how to open the browser 
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//how to open the url
		driver.get("https://www.dell.com/en-us");
		
		
	}

	@When("^User clcik on Sign in button\\.$")
	public void user_clcik_on_Sign_in_button() throws Throwable {
		// create object of pom class use object name to call locators
		
		DellsigninPOM user_click_signin_button = new DellsigninPOM(driver);
		user_click_signin_button.signin_click().click();
		
	}

	@When("^User clcik on Signin$")
	public void user_clcik_on_Signin() throws Throwable {
		
		DellsigninPOM user_clcik_on_Signin = new DellsigninPOM(driver);
		user_clcik_on_Signin.signinoption_click().click();
	 
	}

	@When("^User clcik enter email address \"([^\"]*)\"$")
	public void user_clcik_enter_email_address(String arg1) throws Throwable {
	
		DellsigninPOM user_clcik_enter_email_address = new DellsigninPOM(driver);
		user_clcik_enter_email_address.enter_email().sendKeys(arg1);
	}

	@When("^User clcik enter password \"([^\"]*)\"$")
	public void user_clcik_enter_password(String arg1) throws Throwable {
	    
		DellsigninPOM user_clcik_enter_password = new DellsigninPOM(driver);
		user_clcik_enter_password.enter_password().sendKeys(arg1);
	}

	@Then("^User clcik on signin Option & go to profilepage$")
	public void user_clcik_on_signin_Option_go_to_profilepage() throws Throwable {
		
		DellsigninPOM user_clcik_on_signin_Option_go_to_profilepage = new DellsigninPOM(driver);
		user_clcik_on_signin_Option_go_to_profilepage.signinbutton().click();
	}

	@Then("^I verify the passed of my profilepage$")
	public void i_verify_the_passed_of_my_profilepage() throws Throwable {
	
		DellsigninPOM i_verify_the_passed_of_my_profilepage = new DellsigninPOM(driver);
		i_verify_the_passed_of_my_profilepage.profilepage_verification().isDisplayed();
		
		driver.quit();
	}

	
	
}
