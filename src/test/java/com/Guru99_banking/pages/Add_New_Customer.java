package com.Guru99_banking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Guru99_banking.utilities.ReadPropertiesFiles;
import com.Guru99_banking.webcommons.webcommons;
import com.Guru99_banking.webdriver.WebDriverClass;

public class Add_New_Customer extends webcommons {

	// Add New Customer page elements;
	@FindBy(xpath = "//input[@onkeyup='validatecustomername();']")
	private WebElement custnametxt;

	@FindBy(xpath = "//input[@value='m']")
	private WebElement malebtn;

	@FindBy(xpath = "//input[@value='f']")
	private WebElement femalbtn;

	@FindBy(xpath = "//input[@name='dob']")
	private WebElement dobbtn;

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

	@FindBy(xpath = "//input[@onkeyup='validatepassword();']")
	private WebElement passwordtxt;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitbtn;

	@FindBy(xpath = "//p[text()='Customer Registered Successfully!!!']")
	private WebElement successmsg;

	@FindBy(xpath = "//td[text()='Customer Name']")
	private WebElement custnamespell;

	@FindBy(xpath = "//td[text()='Gender']")
	private WebElement GenderSpell;

	@FindBy(xpath = "//td[text()='Date of Birth']")
	private WebElement DOBSpell;

	@FindBy(xpath = "//td[text()='Address']")
	private WebElement AddressSpell;

	@FindBy(xpath = "//td[text()='City']")
	private WebElement CitySpell;

	@FindBy(xpath = "//td[text()='State']")
	private WebElement StateSpell;

	@FindBy(xpath = "//td[text()='PIN']")
	private WebElement PinSpell;

	@FindBy(xpath = "//td[text()='Mobile Number']")
	private WebElement MobileSpell;

	@FindBy(xpath = "//td[text()='E-mail']")
	private WebElement EmailSpell;

	@FindBy(xpath = "//td[text()='Password']")
	private WebElement PasswordSpell;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement SubmitSpell;

	@FindBy(xpath = "//input[@value='Reset']")
	private WebElement resetSpell;

	// Action Methods on Add New Customer Page;

	// Method to click on Customer Name text box;
	public void newcustclick() {
		HomePage home = HomePage.getHomePage();
		home.clicknewcust();
	}

	// Method to enter text in Customer Name text box;
	public void custname() {
		entertext(custnametxt, ReadPropertiesFiles.readData("config.properties").getProperty("username"));
	}

	// Method to select Male button;
	public void genderisMale() {
		click(malebtn);
	}

	// Method to select Female button;
	public void genderisFamale() {
		click(femalbtn);
	}

	// Method to enter date in Date of birth text box;
	public void enterDOB() {
		entertext(dobbtn, ReadPropertiesFiles.readData("config.properties").getProperty("date"));
		entertext(dobbtn, ReadPropertiesFiles.readData("config.properties").getProperty("month"));
		entertext(dobbtn, ReadPropertiesFiles.readData("config.properties").getProperty("year"));
	}

	// Method to enter text in Address text box;
	public void enterAddress() {
		entertext(Addresstxt, ReadPropertiesFiles.readData("config.properties").getProperty("address"));
	}

	// Method to enter text in city text box;
	public void entercity() {
		entertext(citytxt, ReadPropertiesFiles.readData("config.properties").getProperty("city"));
	}

	// Method to enter text in State text box;
	public void enterstate() {
		entertext(statetxt, ReadPropertiesFiles.readData("config.properties").getProperty("state"));
	}

	// Method to enter number in Pin text box;
	public void enterpin() {
		entertext(pintxt, ReadPropertiesFiles.readData("config.properties").getProperty("pin"));
	}

	// Method to enter number in Mobile number text box;
	public void entermobnum() {
		entertext(phonenumtxt, ReadPropertiesFiles.readData("config.properties").getProperty("phonenumber"));
	}

	// Method to enter text in Password text box;
	public void enterpassword() {
		entertext(passwordtxt, ReadPropertiesFiles.readData("config.properties").getProperty("password"));
	}

	// Method to enter text in E-mail text box;
	public void entermail() {
		String email = randomtext(5) + "@gmail.com";
		entertext(emailtxt, email);
	}

	// Method to click on submit button;
	public void clicksubmit() {
		click(submitbtn);
	}

	// Methods to verify Add New customer page spellings;

	public void CustomerSpell() {
		scrollToElement(custnamespell);
		Assert.assertEquals(custnamespell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("custsp"));
	}

	public void GenderSpell() {
		scrollToElement(GenderSpell);
		Assert.assertEquals(GenderSpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Gendersp"));
	}

	public void DOBSpell() {
		scrollToElement(DOBSpell);
		Assert.assertEquals(DOBSpell.getText(), ReadPropertiesFiles.readData("config.properties").getProperty("dobsp"));
	}

	public void AddressSpell() {
		scrollToElement(AddressSpell);
		Assert.assertEquals(AddressSpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("addresssp"));
	}

	public void citySpell() {
		scrollToElement(CitySpell);
		Assert.assertEquals(CitySpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("citysp"));
	}

	public void StateSpell() {
		scrollToElement(StateSpell);
		Assert.assertEquals(StateSpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("statesp"));
	}

	public void pinSpell() {
		scrollToElement(PinSpell);
		Assert.assertEquals(PinSpell.getText(), ReadPropertiesFiles.readData("config.properties").getProperty("pinsp"));
	}

	public void mobilenumSpell() {
		scrollToElement(MobileSpell);
		Assert.assertEquals(MobileSpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("numbersp"));
	}

	public void EmailSpell() {
		scrollToElement(EmailSpell);
		Assert.assertEquals(EmailSpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("mailsp"));
	}

	public void passwSpell() {
		scrollToElement(PasswordSpell);
		Assert.assertEquals(PasswordSpell.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("passwsp"));
	}

	public void submitSpell() {
		scrollToElement(SubmitSpell);
		Assert.assertEquals(SubmitSpell.getAttribute("value"),
				ReadPropertiesFiles.readData("config.properties").getProperty("subsp"));
	}

	public void ResetSpell() {
		scrollToElement(resetSpell);
		Assert.assertEquals(resetSpell.getAttribute("value"),
				ReadPropertiesFiles.readData("config.properties").getProperty("ressp"));
	}

	// Method to check login button is displayed;
	public void submitbtndisp() {
		elementdisplay(SubmitSpell);
	}

	// Method to check login button is enabled;

	public boolean submitenab() {
		return enabledelement(SubmitSpell);
	}

	// Method to verify registration success;
	public boolean regisSuccess() {
		Assert.assertEquals(getElementText(successmsg),
				ReadPropertiesFiles.readData("config.properties").getProperty("success"));
		return true;

	}

	public static Add_New_Customer getnewcust() {
		return PageFactory.initElements(WebDriverClass.getDriver(), Add_New_Customer.class);
	}

}
