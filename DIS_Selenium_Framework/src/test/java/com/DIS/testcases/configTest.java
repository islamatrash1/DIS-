package com.DIS.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.DIS.base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;


public class configTest extends TestBase {
	
	@BeforeSuite()
	public void setExtent() {

		extent = new ExtentReports("AutoReport/index.html", true);
		extent.addSystemInfo("Framework", "Page Object");
		extent.addSystemInfo("Author", "Islam Alatrash");
		extent.addSystemInfo("Enviroment", "Windows");
		extent.addSystemInfo("Test", "Test Name");

	}

	@AfterSuite()
	public void endReport() {

		extent.flush();

	}
	
	

}
