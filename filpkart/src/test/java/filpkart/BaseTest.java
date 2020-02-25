package filpkart;

import java.awt.Desktop;
import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.flipkart.browser.Driver;
import com.qa.flipkart.browser.DriverManger;
import com.qa.flipkart.constants.Constants;
import com.qa.flipkart.Report.ExtentReport;



public class BaseTest {
	
	@BeforeMethod
	public void setUp() {
		try {
			Driver.initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

	@AfterMethod
	public void wrapUp() {
		DriverManger.getDriver().quit();
	}

	@BeforeSuite
	public void beforeSuite() throws Exception {
		ExtentReport.initialize();
		
	}

	@AfterSuite
	public void afterSuite() throws Exception {

		ExtentReport.report.flush();
		File htmlFile = new File(Constants.EXTENTREPORTPATH);
		Desktop.getDesktop().browse(htmlFile.toURI());
		
	}

}
