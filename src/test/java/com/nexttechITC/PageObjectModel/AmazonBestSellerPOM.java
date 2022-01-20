package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBestSellerPOM {
	
	WebDriver driver; // "driver" is a global variable
	
	/*
	 * page factory is a library 
	 * /*
	 * constructor is not a method but special type of method
	 * 1. Constructor name should be match with classname
	 * 2. it has no return type
	 we use constructor to access code from 1 class to another
	 */
	
	public  AmazonBestSellerPOM (WebDriver driver) { // this "driver" is local driver.
		
		this.driver=driver; // making local driver same as global driver.
		 
		PageFactory.initElements(driver, this); // pageFactory initializing elements of local driver to this class.
		 }
	
	@FindBy(xpath="//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")
	  WebElement click_bestseller;
	  public WebElement bestseller(){
		return click_bestseller;
		
	   }

}
