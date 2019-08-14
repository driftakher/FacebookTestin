package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature/signin.feature",
		glue="com.stepdef"
		)
public class TestRunner extends AbstractTestNGCucumberTests { 

}
