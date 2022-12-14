package com.Guru99_banking.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Guru99_banking.reports.ExtentReportsclass;
import com.Guru99_banking.utilities.ReadPropertiesFiles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverClass extends ExtentReportsclass{
	
	// This class will have all the methods related browser;
	
	private static WebDriver driver;
	
	// This method will be used to launch browser window;
	@BeforeMethod(alwaysRun=true)
	@Parameters(value="browser")
	public void setupBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ReadPropertiesFiles.readData("config.properties").getProperty("URL"));
	}
	
	// This method will be used to close browser window;
	@AfterMethod(alwaysRun=true)
	public void teardownBrowser() {
		driver.quit();
	}
	
	// Method to share driver details with other classes;
	public static WebDriver getDriver() {
		return driver;
	}

}
