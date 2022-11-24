package com.Guru99_banking.listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Guru99_banking.reports.ExtentReportsclass;
import com.Guru99_banking.webcommons.webcommons;
import com.relevantcodes.extentreports.LogStatus;

public class TestListners extends ExtentReportsclass implements ITestListener {

	// This class will have all the methods related testng listeners top perform the
	// actions on top of the test method;

	public void onTestStart(ITestResult result) {
		logger = extent.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(LogStatus.PASS, "Test case is passed :" + result.getMethod().getMethodName());
		extent.endTest(logger);
	}

	public void onTestFailure(ITestResult result) {
		logger.log(LogStatus.FAIL, "Test case is Failed :" + result.getMethod().getMethodName());
		logger.log(LogStatus.FAIL, "Test case is Failed with error :" + result.getThrowable());
		logger.addScreenCapture(new webcommons().takeScreenshot(result.getMethod().getMethodName()));
		extent.endTest(logger);
	}

	public void onTestSkipped(ITestResult result) {
		logger.log(LogStatus.SKIP, "Test case is skipped :" + result.getMethod().getMethodName());
		logger.addScreenCapture(new webcommons().takeScreenshot(result.getMethod().getMethodName()));
		extent.endTest(logger);

	}

	public static void logMessage(String message) {
		logger.log(LogStatus.INFO, message);
	}

}
