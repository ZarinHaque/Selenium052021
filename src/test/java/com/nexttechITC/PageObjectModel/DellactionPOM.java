package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPOM {
	
	WebDriver driver;

	public DellactionPOM(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	 WebElement act_Solutions;
	 public WebElement Solutions() { 
	  return act_Solutions;
	  }
	 
	 
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/a")
	 WebElement click_AllSolutions;
	 public WebElement AllSolutions() { 
	    return click_AllSolutions;
	    }
	 
	 @FindBy(xpath = "//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[2]/div/div[1]/a/div/div")
	 WebElement security_soluation;
	 
	 public WebElement security_s() {
		return security_soluation;
		
		
		 
		 
	 }
	 
	
}
