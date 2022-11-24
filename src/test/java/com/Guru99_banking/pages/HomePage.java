package com.Guru99_banking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Guru99_banking.utilities.ReadPropertiesFiles;
import com.Guru99_banking.webcommons.webcommons;
import com.Guru99_banking.webdriver.WebDriverClass;

public class HomePage extends webcommons {

	// Home page elements;
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logoutbtn;

	By logout = By.xpath("//a[text()='Log out']");

	@FindBy(xpath = "//a[text()='New Customer']")
	private WebElement Newcustlink;

	By Newcust = By.xpath("//a[text()='New Customer']");

	@FindBy(xpath = "//p[text()='Add New Customer']")
	private WebElement Newcustform;

	By newcustform = By.xpath("//p[text()='Add New Customer']");

	@FindBy(xpath = "//a[text()='Edit Customer']")
	private WebElement Editcustlink;

	By Editcust = By.xpath("//a[text()='Edit Customer']");

	@FindBy(xpath = "//p[text()='Edit Customer Form']")
	private WebElement Editcustform;

	By editcustform = By.xpath("//p[text()='Edit Customer Form']");

	@FindBy(xpath = "//a[text()='Delete Customer']")
	private WebElement DelCustlink;

	By DelCust = By.xpath("//a[text()='Delete Customer']");

	@FindBy(xpath = "//p[text()='Delete Customer Form']")
	private WebElement DelCustform;

	By delcustform = By.xpath("//p[text()='Delete Customer Form']");

	@FindBy(xpath = "//a[text()='New Account']")
	private WebElement NewAclink;

	By NewAc = By.xpath("//a[text()='New Account']");

	@FindBy(xpath = "//p[text()='Add new account form']")
	private WebElement NewAcform;

	By newacform = By.xpath("//p[text()='Add new account form']");

	@FindBy(xpath = "//a[text()='Edit Account']")
	private WebElement EditAclink;

	By EditAc = By.xpath("//a[text()='Edit Account']");

	@FindBy(xpath = "//p[text()='Edit Account Form']")
	private WebElement EditAcform;

	By editAcform = By.xpath("//p[text()='Edit Account Form']");

	@FindBy(xpath = "//a[text()='Delete Account']")
	private WebElement DeleteAclink;

	By DeleteAc = By.xpath("//a[text()='Delete Account']");

	@FindBy(xpath = "//p[text()='Delete Account Form']")
	private WebElement DeleteAcform;

	By deleteAcform = By.xpath("//p[text()='Delete Account Form']");

	@FindBy(xpath = "//a[text()='Deposit']")
	private WebElement Depositlink;

	By Deposit = By.xpath("//a[text()='Deposit']");

	@FindBy(xpath = "//p[text()='Amount Deposit Form']")
	private WebElement Depositform;

	By depositform = By.xpath("//p[text()='Amount Deposit Form']");

	@FindBy(xpath = "//a[text()='Withdrawal']")
	private WebElement Withdrawallink;

	By withdrawal = By.xpath("//a[text()='Withdrawal']");

	@FindBy(xpath = "//p[text()='Amount Withdrawal Form']")
	private WebElement Withdrawalform;

	By withdrawalform = By.xpath("//p[text()='Amount Withdrawal Form']");

	@FindBy(xpath = "//a[text()='Fund Transfer']")
	private WebElement FundTranslink;

	By fundtrans = By.xpath("//a[text()='Fund Transfer']");

	@FindBy(xpath = "//p[text()='Fund transfer']")
	private WebElement FundTransform;

	By fundtransform = By.xpath("//p[text()='Fund transfer']");

	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement ChangePasslink;

	By Password = By.xpath("//a[text()='Change Password']");

	@FindBy(xpath = "//p[text()='Change Password']")
	private WebElement ChangePassform;

	By Passwordform = By.xpath("//p[text()='Change Password']");

	@FindBy(xpath = "//a[text()='Balance Enquiry']")
	private WebElement BalEnqlink;

	By BalEnq = By.xpath("//a[text()='Balance Enquiry']");

	@FindBy(xpath = "//p[text()='Balance Enquiry Form']")
	private WebElement BalEnqform;

	By balenqform = By.xpath("//p[text()='Balance Enquiry Form']");

	@FindBy(xpath = "//a[text()='Mini Statement']")
	private WebElement MiniStatemlink;

	By Statement = By.xpath("//a[text()='Mini Statement']");

	@FindBy(xpath = "//p[text()='Mini Statement Form']")
	private WebElement MiniStatemform;

	By Statementform = By.xpath("//p[text()='Mini Statement Form']");

	@FindBy(xpath = "//a[text()='Customised Statement']")
	private WebElement CustStatemlink;

	By CustStatment = By.xpath("//a[text()='Customised Statement']");

	@FindBy(xpath = "//p[text()='Customized Statement Form']")
	private WebElement CustStatemform;

	By CustStatmentform = By.xpath("//p[text()='Customized Statement Form']");

	// Home page actions;

	// Method to logout ;
	public void logout() {
		waitForElement(logout);
		click(logoutbtn);
	}

	// Method to click on New customer link;
	public void clicknewcust() {
		waitForElement(Newcust);
		click(Newcustlink);
	}

	// Method to verify New customer link ;
	public void verifyNewCust() {
		waitForElement(newcustform);
		Assert.assertEquals(Newcustform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Customer"));
	}

	// Method to click on Edit Customer link;
	public void clickEditCust() {
		waitForElement(Editcust);
		click(Editcustlink);
	}

	// Method to verify Edit customer link;
	public void verifyEditCust() {
		waitForElement(editcustform);
		Assert.assertEquals(Editcustform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("EditCust"));
	}

	// Method to click on Delete Customer link;
	public void clickDelCust() {
		waitForElement(DelCust);
		click(DelCustlink);
	}

	// Method to verify Delete customer link;
	public void verifyDelCust() {
		waitForElement(delcustform);
		Assert.assertEquals(DelCustform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("DelCust"));
	}

	// Method to click on Edit Account link;
	public void clickEditAC() {
		waitForElement(EditAc);
		click(EditAclink);
	}

	// Method to verify Edit Account link;
	public void verifyEditAc() {
		waitForElement(editAcform);
		Assert.assertEquals(EditAcform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("EditAC"));
	}

	// Method to click on Delete Account link;
	public void clickDelAC() {
		waitForElement(DeleteAc);
		click(DeleteAclink);
	}

	// Method to verify Delete Account link;
	public void verifyDelAc() {
		waitForElement(deleteAcform);
		Assert.assertEquals(DeleteAcform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("DelAC"));
	}

	// Method to click on Deposit link;
	public void clickDeposit() {
		waitForElement(Deposit);
		click(Depositlink);
	}

	// Method to verify Deposit link;
	public void verifyDeposit() {
		waitForElement(depositform);
		Assert.assertEquals(Depositform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Deposite"));
	}

	// Method to click on Withdrawal link;
	public void clickWithdraw() {
		waitForElement(withdrawal);
		click(Withdrawallink);
	}

	// Method to verify Withdrawal link;
	public void verifyWithdraw() {
		waitForElement(withdrawalform);
		Assert.assertEquals(Withdrawalform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Withdrawal"));
	}

	// Method to click on Change Password link;
	public void clickChanPass() {
		waitForElement(Password);
		click(ChangePasslink);
	}

	// Method to verify Change Password link;
	public void verifyChanPass() {
		waitForElement(Passwordform);
		Assert.assertEquals(ChangePassform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Password"));
	}

	// Method to click on Fund Transfer link;
	public void clickFundTrans() {
		waitForElement(fundtrans);
		click(FundTranslink);
	}

	// Method to verify Fund Transfer link;
	public void verifyFundTrans() {
		waitForElement(fundtransform);
		Assert.assertEquals(FundTransform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Funds"));
	}

	// Method to click on Balance Enquiry link;
	public void clickBalEnq() {
		waitForElement(BalEnq);
		click(BalEnqlink);
	}

	// Method to verify Balance Enquiry link;
	public void verifyBalEnq() {
		waitForElement(balenqform);
		Assert.assertEquals(BalEnqform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Enquiry"));
	}

	// Method to click on Mini Statement link;
	public void clickMiniStat() {
		waitForElement(Statement);
		click(MiniStatemlink);
	}

	// Method to verify Mini Statement link;
	public void verifyMiniStat() {
		waitForElement(Statementform);
		Assert.assertEquals(MiniStatemform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Mini"));
	}

	// Method to click on Customized Statement link;
	public void clickCustStat() {
		waitForElement(CustStatment);
		click(CustStatemlink);
	}

	// Method to verify Customized Statement link;
	public void verifyCustStat() {
		waitForElement(CustStatmentform);
		Assert.assertEquals(CustStatemform.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Custm"));
	}

	public static HomePage getHomePage() {
		return PageFactory.initElements(WebDriverClass.getDriver(), HomePage.class);
	}

}
