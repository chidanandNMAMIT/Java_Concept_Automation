package com.Myntra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra.qa.base.TestBase;

public class HomePage extends TestBase {

	// page factory or Object repository
	
	@FindBy(xpath = "//span[text()='Profile']")
	WebElement ProfileImage;
	
	@FindBy(xpath = "//a[text()='log in']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	WebElement MyntraLogo;
	
	@FindBy(xpath = "//div[text()='aravindcr11@gmail.com']")
	WebElement UserNameLable;
	
	@FindBy(xpath = "//div[text()=' Logout ']")
	WebElement LogoutButton;
	
	
	
	
	// initialize the current class variables
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validateTitle() {
		return driver.getTitle();
	}

	public boolean validateImage() {
		return MyntraLogo.isDisplayed();
	}
	
	public boolean verifyCorrectUserName() {
		Actions action=new Actions(driver);
		action.moveToElement(ProfileImage).build().perform();
		return UserNameLable.isDisplayed();
	}

	public void logOut() {
		Actions action=new Actions(driver);
		action.moveToElement(ProfileImage).build().perform();
		LogoutButton.click();
		
	}

}

