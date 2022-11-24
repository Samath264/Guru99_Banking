package com.Guru99_banking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Guru99_banking.utilities.ReadPropertiesFiles;
import com.Guru99_banking.webcommons.webcommons;
import com.Guru99_banking.webdriver.WebDriverClass;

public class Loginpage extends webcommons {

	// Login page elements;
	@FindBy(xpath = "//input[@name='uid']")
	private WebElement usertxtbx;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordtxtbx;

	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement loginbtn;

	By login = By.xpath("//input[@name='btnLogin']");

	@FindBy(xpath = "//td[text()='UserID']")
	private WebElement Usertxt;

	@FindBy(xpath = "//td[text()='Password']")
	private WebElement Passwordtxt;

	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement Logintxt;

	@FindBy(xpath = "//input[@name='btnReset']")
	private WebElement Resettxt;

	// Login page actions;

	// Method to verify login functionality;
	public void loginfunc(String username, String password) {
		waitForElement(login);
		entertext(usertxtbx, username);
		entertext(passwordtxtbx, password);
		click(loginbtn);
	}
	// Method to Login;
	public void login() {
		waitForElement(login);
		entertext(usertxtbx,ReadPropertiesFiles.readData("config.properties").getProperty("USERNAME"));
		entertext(passwordtxtbx, ReadPropertiesFiles.readData("config.properties").getProperty("PASSWORD"));
		click(loginbtn);
	
	}

	// Method to click on login button;
	public void clickLogin() {
		click(loginbtn);
	}

	// Methods to verify spellings;
	public void Useridspell() {
		Assert.assertEquals(Usertxt.getText(), ReadPropertiesFiles.readData("config.properties").getProperty("user"));
	}

	public void PassSpell() {
		Assert.assertEquals(Passwordtxt.getText(),
				ReadPropertiesFiles.readData("config.properties").getProperty("Passw"));
	}

	public void LogSpell() {
		Assert.assertEquals(Logintxt.getAttribute("value"),
				ReadPropertiesFiles.readData("config.properties").getProperty("log"));
	}

	public void Resetpell() {
		Assert.assertEquals(Resettxt.getAttribute("value"),
				ReadPropertiesFiles.readData("config.properties").getProperty("Rest"));
	}

	// Methods to verify elements are displayed;
	public boolean logindis() {
		return elementdisplay(Logintxt);
	}

	// Methods to check elements are enabled;
	public boolean loginenable() {
		return enabledelement(Logintxt);
	}

	// Method to verify alert is present;
	public boolean Alertispresent() {
		try {
			Acptalert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Loginpage getLoginpage() {
		return PageFactory.initElements(WebDriverClass.getDriver(), Loginpage.class);
	}

}
