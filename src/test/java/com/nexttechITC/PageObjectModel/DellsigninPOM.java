package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsigninPOM {
	
	WebDriver driver;
	
	public DellsigninPOM (WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
			
	}
	
	@FindBy(xpath="//span[@id='um-si-label']")
	WebElement signin_option;
	
	public WebElement signin_click() {
		return signin_option;
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/a[1]")
	WebElement click_signin_option;
	
	public WebElement signinoption_click() {
		return click_signin_option;
		
	}
	
	@FindBy(xpath="//input[@id='EmailAddress']")
	WebElement email;
	
	public WebElement enter_email() {
		return email;
		
	}

	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	public WebElement enter_password() {
		return password;
		
	}
	
	@FindBy(xpath="//button[@id='sign-in-button']")
	WebElement click_signin_button;
	
	public WebElement signinbutton() {
		return click_signin_button;
		
	}
	
	@FindBy(xpath="//h2[text()='Ingenuity at its finest']")
	WebElement verify_ppage;
	
	public WebElement profilepage_verification() {
		return verify_ppage;
		
		
	}
}
