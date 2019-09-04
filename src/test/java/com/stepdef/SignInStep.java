package com.stepdef;

import org.testng.Assert;

import com.common.Base;
import com.common.ScreenShot;
import com.pages.SignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStep extends Base {
	
	SignInPage sip;
	
	@Given("^user is able to go to homepage$")
	public void user_is_able_to_go_to_homepage() throws Throwable {
		driver=getdriver ();
	
	}

	@When("^user enters valid email$")
	public void user_enters_valid_email() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("01715600101");
		sip = new SignInPage(driver);
		sip.getId_Text().sendKeys("01715600101");
		
		ScreenShot.ScreenS(driver, "email"); //to take screenshot
		
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	    //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Don'tAsk");
		sip.getPass_Text().sendKeys("Don'tAsk");
	}

	@When("^user clicks sign in button$")
	public void user_clicks_sign_in_button() throws Throwable {
	   //driver.findElement(By.xpath("//input[@value='Log In']")).click();
		sip.getLogin_Button().click();
	}

	@Then("^user will be able to access account$")
	public void user_will_be_able_to_access_account() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Facebook");
		
		driver.close();
	}
	

}
