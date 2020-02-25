package com.qa.flipkart.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	
	@FindBy(name="q")
	WebElement Searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

public static String mob="mobiles";
	public void HomePage() {
		Searchbox.isEnabled();
		Searchbox.sendKeys(mob);
		submit.click();
		
	}

}
