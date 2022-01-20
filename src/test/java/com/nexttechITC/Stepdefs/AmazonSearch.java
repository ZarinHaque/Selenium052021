package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearch {
	WebDriver driver;
	
	@Given("^user visits amazon home page$")
	public void user_visits_amazon_home_page() throws Throwable {

		// how to open the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
		  // how to open the URL
		  
		  driver.get("https://www.amazon.com/"); 
		  /* driver.get with parentheses and inside of parentheses 
		  i use 2 double "" and at last finish with semicolon */
	}

	@When("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonsearchPOM amazonSearch = new AmazonsearchPOM(driver);
		amazonSearch.searchbutton().sendKeys(arg1);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonsearchPOM searchClick = new AmazonsearchPOM(driver);
		searchClick.submit().click();
	
	}


   @Then("^verify the page$")
   public void verify_the_page() throws Throwable {
	   AmazonsearchPOM verify_product = new AmazonsearchPOM(driver);
	   verify_product.verification().isDisplayed();
   }


}
