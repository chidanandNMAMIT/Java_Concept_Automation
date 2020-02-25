package com.qa.flipkart.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.flipkart.Utility.JsonParser;

public class LoginPage extends BasePage{
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement crosmark;
	
	@FindBy(xpath="	(//input[@type='text'])[2]")
	WebElement txtbox_username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtbox_password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement Login_Btn;
	
	
	public HomePage login() throws IOException {
		sendkeys(txtbox_username,JsonParser.getValue("config.global.username"));
		sendkeys(txtbox_password,JsonParser.getValue("config.global.password"));
		Login_Btn.click();
		return new HomePage();
	}
	
	
}
