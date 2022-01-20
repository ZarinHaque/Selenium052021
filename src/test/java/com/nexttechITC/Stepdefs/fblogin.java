package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.fbloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fblogin {
	
	WebDriver driver;
	
	
	@Given("^I want to visit facebook homepage$")
	public void i_want_to_visit_facebook_homepage() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/*soft wait/ global wait | implicit wait is global wait | soft wait ,
		 which we use  in between browser & URL. This is why it's a global wait.*/

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// how to maximize the browser
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
	}

	@When("^I want to give valid \"([^\"]*)\" address$")
	public void i_want_to_give_valid_address(String arg1) throws Throwable {
		fbloginPOM mail = new fbloginPOM(driver); 
		
		mail.enteremail().sendKeys(arg1);
	}

	@Then("^I want to give valid \"([^\"]*)\"$")
	public void i_want_to_give_valid(String arg1) throws Throwable {
		fbloginPOM pass = new fbloginPOM(driver); 
		
		pass.enterpassword().sendKeys(arg1);
	}

	@Then("^I want to click login button$")
	public void i_want_to_click_login_button() throws Throwable {
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		fbloginPOM login = new fbloginPOM(driver); 
		login.clicklogin().click();
		
		/* explicit wait || Explicit wait is local wait | soft wait | webdriver wait
		which we use in between web elements so every single step can execute without any interruption. 
		This is why its local wait. */

		
	}

	@Then("^I verify the success of my homepage$")
	public void i_verify_the_success_of_my_homepage() throws Throwable {
		fbloginPOM verify = new fbloginPOM(driver); 
		verify.verifing().equals(verify);
		
		/*This is Heard wait | in hard wait you have to wait as long the time is mentioned. you can't 
		leave early even though you found your Web element */
		Thread.sleep(3000);
		
		// Hard wait 
		//Thread.sleep(3000);
		
		
		// how to close the window
		driver.close();
		driver.quit();
		
	}



}
