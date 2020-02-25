package com.qa.flipkart.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Hashtable;

import java.util.List;

import java.util.Random;


import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.ArrayUtil;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;

import com.qa.flipkart.browser.DriverManger;
import com.qa.flipkart.constants.Constants;
import com.qa.flipkart.listeners.ListenerClass;
import com.qa.flipkart.Pages.HomePage;





/*
 * All the utilities needed for the framework is placed in this class including excel utilities, screenshot capture.
 * We have used method overloading concept in getCellContent Method.
 */
public class TestUtils {

	public static FileInputStream fs;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static  FileOutputStream fileOut;

/*	public static void createExcelAndWriteIntoIt(List<String> text) {
		try {
			String filepath=Constants.EXCELPATH+"\\"+HomePage.getUsername()+".xlsx";
         XSSFWorkbook workbook = new XSSFWorkbook();
         XSSFSheet sheet = workbook.createSheet("TC01"); 
         Row row=sheet.createRow(0);
         for(int i=0;i<text.size();i++) {
         row.createCell(i).setCellValue(text.get(i));
         }
         
         fileOut = new FileOutputStream(Constants.EXCELPATH+"\\"+HomePage.getUsername()+".xlsx"); 
         workbook.write(fileOut); 
         fileOut.close(); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	

	/*
	 * public static Object getRowNumForTestCase(String testcasename) { Object
	 * a=null; for(Map.Entry m:rowAndTestCaseMap.entrySet()){
	 * if(m.getValue().toString().equalsIgnoreCase(testcasename)) { a= m.getKey(); }
	 * } return a; }
	 */

	/*
	 * Takes rowname and sheetname as parameter
	 * return row number based of rowname
	 */
	public static int getRowNumForRowName(String sheetname,String rowName) {
		int rownum=0;
		sheet=workbook.getSheet(sheetname);
		for(int i=1;i<=getLastRowNum(sheetname);i++) {
			if(rowName.equalsIgnoreCase(sheet.getRow(i).getCell(0).getStringCellValue())) {
				rownum=i;
				break;
			}
		}

		return rownum;
	}

	/*
	 * Takes columnname and sheetname as parameter
	 * return column number based of columnheader
	 */

	public static int getColumnNumForColumnName(String sheetname, String columnname) {
		int colnum=0;
		sheet=workbook.getSheet(sheetname);
		for(int i=0;i<getLastColumnNum(sheetname, 0);i++) {
			if(columnname.equalsIgnoreCase(sheet.getRow(0).getCell(i).getStringCellValue())) {
				colnum=i;
				break;
			}
		}

		return colnum;

	}


	/*
	 * Takes sheetname as parameter
	 * return last row number of the sheet
	 */
	public static int getLastRowNum(String sheetname) {
		return workbook.getSheet(sheetname).getLastRowNum();
	}

	/*
	 * Takes sheetname, row number as parameter
	 * return last cell number of the row
	 */
	public static int getLastColumnNum(String sheetname, int rownum) {
		return workbook.getSheet(sheetname).getRow(rownum).getLastCellNum();
	}


	/*
	 * Takes sheetname, row number, column number as parameter
	 * return cell value
	 */
	public static String getCellContent(String sheetname,int rownum,int colnum) {
		sheet=workbook.getSheet(sheetname);
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue().concat("").toString();

		
	}

	/*
	 * Takes sheetname, row number, column name as parameter
	 * return cell value
	 */
	public static String getCellContent(String sheetname,int rownum,String columnname) {
		sheet=workbook.getSheet(sheetname);
		return sheet.getRow(rownum).getCell(getColumnNumForColumnName(sheetname, columnname)).getStringCellValue().concat("").toString();

	}

	/*
	 * Takes sheetname, row name, column name as parameter
	 * return cell value
	 */
	public static String getCellContent(String sheetname,String rowname,String columnname) {
		sheet=workbook.getSheet(sheetname);
		int rownum=getRowNumForRowName(sheetname, rowname);
		int colnum=getColumnNumForColumnName(sheetname, columnname);
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue().concat("").toString();

	}



	


	/*
	 * Captures screenshot and returns the screenshot path
	 */
	public static String pullScreenshotPath()  {

		String destination=null;
	
			File scrFile = ((TakesScreenshot) DriverManger.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
					destination=Constants.SCREENSHOTPATH +"\\"+ListenerClass.getTestcaseName()+"\\"+ System.currentTimeMillis()+".png";
					FileUtils.copyFile(scrFile, new File(destination));
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		return destination;

	}

	/*
	 * Gives a base64 image which is used to append the screenshots in the extent report.
	 * Converting to base64 format avoids screenshots broken image if sent the exent report through email.
	 */
	public static String getBase64Image(String screenshotpath) {
		String base64 = null;
		try {
			InputStream is= new FileInputStream(screenshotpath);
			byte[] imageBytes = IOUtils.toByteArray(is);
			base64 = Base64.getEncoder().encodeToString(imageBytes);
		}
		catch (Exception e) {

		}
		return base64;

	}

	
	/*
	 * 
	 * DataProvider method used to provide data for multiple iterations.
	 * Never try to use multiple iterations when the invocation count is greater than 1. It may result in adhoc results.
	 * As long as the first name of the TestData has the same test case name it will be treated as iteration.
	 * 
	 */
	@DataProvider(name="dataProviderForIterations",parallel=true)
	public static Object[][] supplyDataForIterations(Method m){
		return getDataForDataprovider(Constants.TESTDATAPATH,"TestData",m.getName());
	}

	/*
	 * Finding number of iterations available for test case and return the data accordingly.
	 * Using hashtable avoids multiple parameters entry to the test case.
	 * 
	 */
	private static Object[][] getDataForDataprovider(String testdata, String sheetname, String testcasename) {
		int totalcolumns=getLastColumnNum(sheetname, 0);
		ArrayList<Integer> rowscount=getNumberofIterationsForATestCase(sheetname, testcasename);
		Object[][] b=new Object[rowscount.size()][1];
		Hashtable<String,String> table =null;
		for(int i=1;i<=rowscount.size();i++) {
			table=new Hashtable<String,String>();
			for(int j=0;j<totalcolumns;j++){
				table.put(getCellContent(sheetname, 0, j), getCellContent(sheetname, rowscount.get(i-1), j));
				b[i-1][0]=table;
			}
		}
		return b;
	}
	
	/*
	 * Used to return the rownumber of the test cases for multiple iterations.
	 * Suppose if testcase 1 is available in row 4 and 7 is test data , it return the arraylist with values 4,7
	 */
	private static ArrayList<Integer> getNumberofIterationsForATestCase(String sheetname,String testcasename) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=1;i<=getLastRowNum(sheetname);i++) {
			if(testcasename.equalsIgnoreCase(getCellContent(sheetname, i, 0))) {
				a.add(i);
			}
		}
			
		return a;
	}

}
