package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	
	WebDriver driver;
	
	public  AmazonsearchPOM (WebDriver driver) {
		 this.driver=driver;
		 
		 PageFactory.initElements(driver, this);
		 
	}
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	  WebElement click_search;
	 
	public WebElement searchbutton(){
		return click_search;
		
		
	   }
	  
	  @FindBy(xpath="//*[@id='nav-search-submit-button']")
	  WebElement click_product;
	 
	  public WebElement submit() {
		return click_product;
		  
	  }
	  
	  @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
	  WebElement verify_productitem;
	 
	  public WebElement verification() {
		return verify_productitem;
		  
	  }

	

}
