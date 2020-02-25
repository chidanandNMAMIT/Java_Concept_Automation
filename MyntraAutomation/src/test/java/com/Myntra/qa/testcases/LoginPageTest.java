package com.Myntra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Myntra.qa.base.TestBase;
import com.Myntra.qa.pages.HomePage;
import com.Myntra.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		Initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void LoginTest() throws Exception {
		homepage=loginpage.login(prop.getProperty("UserName"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
