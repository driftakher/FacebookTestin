package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	
	public SignInPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Id_Text;
	public WebElement getId_Text() {
		return Id_Text;
	}
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement Pass_Text;
	public WebElement getPass_Text() {
		return Pass_Text;		
	}
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement Login_Button;
	public WebElement getLogin_Button() {
		return Login_Button;
		
	}
	
}
