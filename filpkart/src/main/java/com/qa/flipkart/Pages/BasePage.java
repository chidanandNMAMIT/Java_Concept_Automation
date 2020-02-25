package com.qa.flipkart.Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.flipkart.browser.DriverManger;
import com.qa.flipkart.constants.Constants;
import com.qa.flipkart.Report.LogStatus;
import com.qa.flipkart.Utility.TestUtils;




public class BasePage {
	
	protected BasePage(){
		PageFactory.initElements(DriverManger.getDriver(), this);
	}

	
	public static void click(WebElement element)  {
		explicitlyWait(element);
		element.click();
		LogStatus.pass("Clicking is successfull on "+ element);
		
	}
	
	public static void switchToNewWindow() {
		String parentWinHandle = DriverManger.getDriver().getWindowHandle();
		Set<String> winHandles = DriverManger.getDriver().getWindowHandles();
		for(String temp:winHandles) {
			if(!temp.equalsIgnoreCase(parentWinHandle)) {
				DriverManger.getDriver().switchTo().window(temp);
			}
		}
	}
	
	public static void selectByValue(WebElement element,String text) {
		new Select(element).selectByValue(text);
	}
	
	public static void click(By by)  {
		click(DriverManger.getDriver().findElement(by));
	}


	private static void explicitlyWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(DriverManger.getDriver(),Constants.EXPLICITWAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	public static void sendkeys(WebElement element, String text)  {
		element.sendKeys(text);
		LogStatus.pass(text + " is entered in to the "+ element);
	}
	
	public static void sendkeys(By by, String text)  {
		sendkeys(DriverManger.getDriver().findElement(by), text);
	}
	
	public static void moveToElement(WebElement element) {
		Actions actions= new Actions(DriverManger.getDriver());
		actions.moveToElement(element).build().perform();
	}
	
	public static void moveToElement(By by) {
		moveToElement(DriverManger.getDriver().findElement(by));
	}
	
	
}
