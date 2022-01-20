package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.signupfbPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signupfb {
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php");
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		signupfbPOM myobj = new signupfbPOM(driver);
		
		myobj.firstname().sendKeys(arg1);
		myobj.lastname().sendKeys(arg2);
		myobj.email().sendKeys(arg3);
		myobj.password().sendKeys(arg4);
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	    
		signupfbPOM sel = new signupfbPOM(driver);
		
		Select dropdown =new Select (sel.click_month);
		//dropdown.selectByValue("6");
		dropdown.selectByIndex(5);
		
		Select dropdown1 =new Select (sel.click_day);
		dropdown1.selectByValue("6");
		
		
		Select dropdown2= new Select (sel.click_year);
		dropdown2.selectByVisibleText("1999");
		
		driver.quit();
		
	}



}
