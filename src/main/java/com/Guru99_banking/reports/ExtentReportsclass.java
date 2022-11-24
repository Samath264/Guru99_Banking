package com.Guru99_banking.reports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Guru99_banking.webcommons.webcommons;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsclass extends webcommons{
	
	// This class will have all the methods to generate html reports
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite(alwaysRun=true)
	public static void setupReport() {
	String timestamp =getUniqueId();
	String repname = "AutomationReport"+timestamp+".html";
	
	extent = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\"+repname);	
	extent.addSystemInfo("Project Name", "inetbanking").addSystemInfo("Tester","samath");
	}
	
	@AfterSuite(alwaysRun=true)
	public static void teardownReport() {
		extent.flush();
		extent.close();
	}

}
