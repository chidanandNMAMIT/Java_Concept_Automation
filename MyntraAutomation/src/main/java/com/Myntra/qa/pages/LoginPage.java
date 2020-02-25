package com.Myntra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath = "//span[text()='Profile']")
	WebElement ProfileImage;
	
	@FindBy(xpath = "//a[text()='log in']")
	WebElement LoginButton;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement UserLoginButton;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage login(String un , String pwd) throws Exception {
	Actions action =new Actions(driver);
	action.moveToElement(ProfileImage).build().perform();
	LoginButton.click();
	username.sendKeys(un);
	password.sendKeys(pwd);
	UserLoginButton.click();
	Thread.sleep(3000);
	return new HomePage();
	}
	
	
}
