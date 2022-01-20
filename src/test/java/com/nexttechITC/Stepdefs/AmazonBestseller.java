package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.AmazonBestSellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonBestseller {

	WebDriver driver;

	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		
		// how to open the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
		  // how to open the URL
		  
		  driver.get("https://www.amazon.com/"); 
		  /* driver.get with parentheses and inside of parentheses 
		  i use 2 double "" and at last finish with semicolon */


	}

	@When("^user clicks on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
	   AmazonBestSellerPOM bestsell = new AmazonBestSellerPOM(driver);
	   bestsell.bestseller().click();
	}

	@Then("^user should be able to redirect to the Best Seller Page$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
	   
	}
}
