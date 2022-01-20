package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginPOM {
	
	WebDriver driver;
	
	public fbloginPOM(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailaddress;
	
	public WebElement enteremail() {
		return emailaddress;
		
	}
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement pass;
	
	public WebElement enterpassword() {
		return pass;
		
		
		
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	public WebElement clicklogin() {
		return login;
		
		
	}
	
	@FindBy(xpath = "//input[@name='approvals_code']")
	WebElement verification;
	
	public WebElement verifing() {
		return verification;
		
		
	}
	
}
