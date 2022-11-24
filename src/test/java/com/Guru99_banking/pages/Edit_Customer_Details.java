package com.Guru99_banking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru99_banking.utilities.ReadPropertiesFiles;
import com.Guru99_banking.webcommons.webcommons;
import com.Guru99_banking.webdriver.WebDriverClass;

public class Edit_Customer_Details extends webcommons {

	// Edit Customer Details elements;

	@FindBy(xpath = "//input[@onkeyup='validatecustomerid();']")
	private WebElement CustIDtxt;

	@FindBy(xpath = "//input[@name='AccSubmit']")
	private WebElement Submitbtn;

	@FindBy(xpath = "//textarea[@onkeyup='validateAddress();']")
	private WebElement Addresstxt;

	@FindBy(xpath = "//input[@onkeyup='validateCity();']")
	private WebElement citytxt;

	@FindBy(xpath = "//input[@onkeyup='validateState();']")
	private WebElement statetxt;

	@FindBy(xpath = "//input[@onkeyup='validatePIN();']")
	private WebElement pintxt;

	@FindBy(xpath = "//input[@onkeyup='validateTelephone();']")
	private WebElement phonenumtxt;

	@FindBy(xpath = "//input[@onkeyup='validateEmail();']")
	private WebElement emailtxt;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitbtn;

	// Actions methods to update details;

	// Method to enter id in customer ID text box;
	public void clickCustId(String id) {
		entertext(CustIDtxt, id);
		click(Submitbtn);
	}

	// Method to enter text in Address text box;
	public void updateAddress() {
		entertext(Addresstxt, ReadPropertiesFiles.readData("config.properties").getProperty("updateAddress"));
	}

	// Method to enter text in city text box;
	public void updateCity() {
		entertext(citytxt, ReadPropertiesFiles.readData("config.properties").getProperty("updateCity"));
	}

	// Method to enter text in state text box;
	public void updateState() {
		entertext(statetxt, ReadPropertiesFiles.readData("config.properties").getProperty("updateState"));
	}

	// Method to enter number in pin text box;
	public void updatePin() {
		entertext(pintxt, ReadPropertiesFiles.readData("config.properties").getProperty("updatePin"));
	}

	// Method to enter number in mobile number text box;
	public void updateMobnum() {
		entertext(phonenumtxt, ReadPropertiesFiles.readData("config.properties").getProperty("updatePhonenumber"));
	}

	// Method to enter text in E-mail text box;
	public void updateMail() {
		String email = randomtext(5) + "@gmail.com";
		entertext(emailtxt, email);
	}

	// Method to click on the submit button;
	public void clickSubmit() {
		click(submitbtn);
	}

	// Method to verify alert is present;
	public boolean UpdateAlertisPresent() {
		try {
			Acptalert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Edit_Customer_Details getUpdateCust() {
		return PageFactory.initElements(WebDriverClass.getDriver(), Edit_Customer_Details.class);
	}

}
