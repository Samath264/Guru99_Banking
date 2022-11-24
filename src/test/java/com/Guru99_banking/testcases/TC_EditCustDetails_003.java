package com.Guru99_banking.testcases;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.Guru99_banking.pages.Edit_Customer_Details;
import com.Guru99_banking.pages.HomePage;
import com.Guru99_banking.pages.Loginpage;
import com.Guru99_banking.webdriver.WebDriverClass;

public class TC_EditCustDetails_003 extends WebDriverClass {

	@Test(groups = {"Regression","Smoke"})
	public void VerifyEditCustomer() {
		Loginpage login = Loginpage.getLoginpage();
		HomePage Home = HomePage.getHomePage();
		Edit_Customer_Details Update = Edit_Customer_Details.getUpdateCust();
		login.login();
		login.customreport("Login successed");
		Home.clickEditCust();
		Home.customreport("Clicked on the Edit customer link");
		Update.waitForNextline();
		Update.clickCustId("80333");
		Update.customreport("Entered Customer Id");
		Update.waitForNextline();
		Update.updateAddress();
		Update.customreport("Entered Updated customer Address");
		Update.updateCity();
		Update.customreport("Entered Updated customer city");
		Update.updateState();
		Update.customreport("Entered Updated customer state");
		Update.updatePin();
		Update.customreport("Entered Updated customer pin number");
		Update.updateMobnum();
		Update.customreport("Entered Updated customer mobile number");
		Update.updateMail();
		Update.customreport("Entered Updated customer E-mail address");
		Update.clickSubmit();
		Update.customreport("Clicked on submit button");
		Update.waitForNextline();
		if (Update.UpdateAlertisPresent() == true) {
			Update.customreport("Customer details are updated successfully");
			Assert.assertTrue(true);
		} else {
			Update.customreport("Customer details are not updated");
			Assert.assertTrue(false);
		}
	}
	
	

}
