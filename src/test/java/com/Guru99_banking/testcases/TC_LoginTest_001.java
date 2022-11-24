package com.Guru99_banking.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Guru99_banking.pages.HomePage;
import com.Guru99_banking.pages.Loginpage;
import com.Guru99_banking.utilities.ReadExcelFiles;
import com.Guru99_banking.webdriver.WebDriverClass;

public class TC_LoginTest_001 extends WebDriverClass {

	@Test(priority=3 ,dataProvider = "logindata",groups = {"Regression","Smoke"})
	public void verifyloginfunctionality(String username, String password) {
		Loginpage login = Loginpage.getLoginpage();
		HomePage home = HomePage.getHomePage();
		login.loginfunc(username, password);
		login.customreport("usrname and password entered");
		if (login.Alertispresent() == true) {
			login.customreport("Login Failed");
			Assert.assertTrue(false);
			} else {
			login.customreport("Login successed");
			Assert.assertTrue(true);
			home.logout();
			login.Acptalert();
		}
	}

	@Test(priority=4,groups = {"Regression"})
	public void verifyLoginPageSpell() {
		Loginpage login = Loginpage.getLoginpage();
		login.Useridspell();
		login.customreport("User ID text field spelling is matched");
		login.PassSpell();
		login.customreport("Password text field spelling is matched");
		login.LogSpell();
		login.customreport("Login text field spelling is matched");
		
	}

	@Test(priority=1,groups = {"Regression"})
	public void verifyLoginbtndisp() {
		Loginpage login = Loginpage.getLoginpage();
		login.logindis();
		if(login.logindis()==true) {
			login.customreport("Login button is displayed");
			Assert.assertTrue(true);
		}else {
		login.customreport("Login button is not displayed");
		Assert.assertTrue(false);
		}
	}

	@Test(priority=2,groups = {"Regression","Smoke"})
	public void verifyLoginBtnenable() {
		Loginpage login = Loginpage.getLoginpage();
		login.loginenable();
		if (login.loginenable() == true) {
			login.customreport("Login button is enabled");
			login.clickLogin();
			login.Acptalert();
		} else {
			login.customreport("Login button is disabled");
			Assert.assertTrue(false);

		}
	}

	@DataProvider(name = "logindata")
	public String[][] readdata() {
		String[][] data = ReadExcelFiles.readData("Guru99_banking.xlsx", "sheet1");
		return data;
	}

}
