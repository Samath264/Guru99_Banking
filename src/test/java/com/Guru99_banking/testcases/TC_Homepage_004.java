package com.Guru99_banking.testcases;

import org.testng.annotations.Test;

import com.Guru99_banking.pages.HomePage;
import com.Guru99_banking.pages.Loginpage;
import com.Guru99_banking.webdriver.WebDriverClass;

public class TC_Homepage_004 extends WebDriverClass{
	
	// This test case verifies all the link available in home page;
	
	@Test(groups = {"Regression","Smoke"})
	public void verifyHomePagelinks() {
		Loginpage login = Loginpage.getLoginpage();
		HomePage Home = HomePage.getHomePage();
		login.login();
		login.customreport("Login is successed");
		Home.clicknewcust();
		Home.customreport("clicked on New customer link");
		Home.verifyNewCust();
		Home.customreport("New customer link is enabled");
		Home.clickEditCust();
		Home.customreport("clicked on Edit customer link");
		Home.verifyEditCust();
		Home.customreport("Edit customer link is enabled");
		Home.clickDelCust();
		Home.customreport("clicked on Delete customer link");
		Home.verifyDelCust();
		Home.customreport("Delete customer link is enabled");
		Home.clickEditAC();
		Home.customreport("clicked on Edit Account link");
		Home.verifyEditAc();
		Home.customreport("Edit Account link is enabled");
		Home.clickDelAC();
		Home.customreport("clicked on Delete Account linked");
		Home.verifyDelAc();
		Home.customreport("Delete Account link is enabled");
		Home.clickDeposit();
		Home.customreport("clicked on Deposit link");
		Home.verifyDeposit();
		Home.customreport("Deposit link is enabled");
		Home.clickWithdraw();
		Home.customreport("clicked on withdraw link");
		Home.verifyWithdraw();
		Home.customreport("Withdraw link is enabled");
		Home.clickFundTrans();
		Home.customreport("clicked on Funds Transfer link");
		Home.verifyFundTrans();
		Home.customreport("Funds Transfer link is enabled");
		Home.clickChanPass();
		Home.customreport("clicked on Password link");
		Home.verifyChanPass();
		Home.customreport("Change Passaword link is enabled");
		Home.clickBalEnq();
		Home.customreport("clicked on Balance Enqiry link ");
		Home.verifyBalEnq();
		Home.customreport("Balanced Enqiry link is enabled");
		Home.clickMiniStat();
		Home.customreport("clicked on Mini Statement link");
		Home.verifyMiniStat();
		Home.customreport("Mini Statement link is enabled");
		Home.clickCustStat();
		Home.customreport("clicked on Customized Statement");
		Home.verifyCustStat();
		Home.customreport("Customized Statement link is enabled");
		Home.logout();

	}

}
