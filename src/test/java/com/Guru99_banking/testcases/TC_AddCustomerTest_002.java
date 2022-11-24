package com.Guru99_banking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99_banking.pages.Add_New_Customer;
import com.Guru99_banking.pages.Loginpage;
import com.Guru99_banking.webdriver.WebDriverClass;

public class TC_AddCustomerTest_002 extends WebDriverClass {
	
	@Test(priority=3,groups= {"Regression","Smoke"})
	public void VerifyAddNewCustomer() {
		Loginpage login = Loginpage.getLoginpage();
		Add_New_Customer newcust = Add_New_Customer.getnewcust();
		login.login();
		login.customreport("Login successed");
		login.waitForNextline();
		newcust.newcustclick();
		newcust.customreport("Clicked on New Customer link");
		newcust.waitForNextline();
		newcust.custname();
		newcust.customreport("Entered Customer name");
		newcust.genderisMale();
		newcust.customreport("Male option selected");
		newcust.enterDOB();
		newcust.customreport("Entered Date of birth");
		newcust.enterAddress();
		newcust.customreport("Entered Address");
		login.waitForNextline();
		newcust.entercity();
		newcust.customreport("Entered City");
		newcust.enterstate();
		newcust.customreport("Entered State");
		newcust.enterpin();
		newcust.customreport("Entered Pin number");
		newcust.entermobnum();
		newcust.customreport("Entered Mobile number");
		newcust.entermail();
		newcust.customreport("Entered E-mail address");
		newcust.enterpassword();
		newcust.customreport("Entered password");
		newcust.clicksubmit();
		newcust.customreport("Clicked on submit button");
		boolean RES= newcust.regisSuccess();
		if(RES==true) {
			newcust.customreport("New Customer Added successfully");
			Assert.assertTrue(true);
		}else {
			newcust.customreport("New Customer didn't added");
			Assert.assertTrue(false);
		}
	}
		
		@Test(priority=4,groups= {"Regression"})
		public void verifyAddCustPageSpell() {
		Loginpage login = Loginpage.getLoginpage();
		Add_New_Customer newcust = Add_New_Customer.getnewcust();
		login.login();
		login.customreport("Login successed");
		login.waitForNextline();
		newcust.newcustclick();
		newcust.customreport("Clicked on New Customer link");
		newcust.waitForNextline();
		newcust.CustomerSpell();
		newcust.customreport("Customer name text field spelling is matched");
		newcust.GenderSpell();
		newcust.customreport("Gender text field spelling is matched");
		newcust.DOBSpell();
		newcust.customreport("Date of Birth text field spelling is matched");
		newcust.AddressSpell();
		newcust.customreport("Address text field spelling is matched");
		newcust.citySpell();
		newcust.customreport("City text field spelling is matched");
		newcust.StateSpell();
		newcust.customreport("State text field spelling is matched");
		newcust.pinSpell();
		newcust.customreport("Pin number text field spelling is matched");
		newcust.mobilenumSpell();
		newcust.customreport("Mobile number text field spelling is matched");
		newcust.EmailSpell();
		newcust.customreport("E-mail address text field spelling is matched");
		newcust.passwSpell();
		newcust.customreport("Password text field spelling is matched");
		newcust.submitSpell();
		newcust.customreport("Submit button spelling is matched");
		newcust.ResetSpell();
		newcust.customreport("Reset button spelling is matched");
		}
		
		@Test(priority=1,groups={"Regression"})
		public void verifyBtnsDisplayed() {
			Loginpage login = Loginpage.getLoginpage();
			Add_New_Customer newcust = Add_New_Customer.getnewcust();
			login.login();
			login.customreport("Login successed");
			login.waitForNextline();
			newcust.newcustclick();
			newcust.customreport("Clicked on New Customer link");
			newcust.waitForNextline();
			newcust.submitbtndisp();
			newcust.customreport("Submit button is displayed");
			}
		
		@Test(priority=2,groups = {"Regression","Smoke"})
		public void verifyBtnsEnabled() {
			Loginpage login = Loginpage.getLoginpage();
			Add_New_Customer newcust = Add_New_Customer.getnewcust();
			login.login();
			login.customreport("Login successed");
			login.waitForNextline();
			newcust.newcustclick();
			newcust.customreport("Clicked on New Customer link");
			newcust.waitForNextline();
			newcust.submitenab();
			if(newcust.submitenab()==true) {
			newcust.customreport("Submit button is enabled");
			newcust.clicksubmit();
			newcust.Acptalert();
			}else {
				newcust.customreport("Submit button is disabled");
				Assert.assertTrue(false);
			}
			}
		}
