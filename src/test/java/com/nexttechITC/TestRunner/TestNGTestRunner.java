package com.nexttechITC.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {

	// import the "CucumberOptions(Cucumber.api)
	
	@CucumberOptions (
			   
			   features = {"Features"},
			   glue = {"com.nexttechITC.stepdefs"}
			   
			   )
	
	                              //import testng.AbstractTestNGCucumberTests
	
	public class TestRunner extends AbstractTestNGCucumberTests{}
	
	
	
}



