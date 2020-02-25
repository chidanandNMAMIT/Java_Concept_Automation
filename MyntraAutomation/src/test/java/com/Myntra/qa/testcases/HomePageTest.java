package com.Myntra.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Myntra.qa.base.TestBase;
import com.Myntra.qa.pages.HomePage;
import com.Myntra.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		Initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("UserName"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateTitleTest() {
		String homepageTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		Assert.assertEquals(homepage.validateTitle(), homepageTitle);		
	}
	
	@Test(priority=2)
	public void ValidateMyntarLogoTest() {
		Assert.assertTrue(homepage.validateImage());
	}
	
	@Test(priority=3)
	public void verifyCorrectUserNameTest() {
		Assert.assertTrue(homepage.verifyCorrectUserName());
	}
	
	@Test(priority=4)
	public void logOutTest() {
		homepage.logOut();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
