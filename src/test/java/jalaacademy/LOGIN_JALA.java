package jalaacademy;

import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.JALA.utils.utilities;
import com.pageobjectmodel.assertion_pom;
import com.pageobjectmodel.login_pom;

public class LOGIN_JALA extends BASECLASS {
	public LOGIN_JALA() {
		super();
	}

	public WebDriver driver;
	assertion_pom assertionpom;
	login_pom loginpom;

	@BeforeMethod
	public void setup() {
		driver = initializationmethod();

	}

	@Test(priority = 1)
	public void LOGINwithvalidcredentials() throws Throwable {
			 loginpom = new login_pom(driver);
		 Thread.sleep(2000);
		 loginpom.combine_login(prop.getProperty("email"), prop.getProperty("password"));
	 assertionpom = new assertion_pom(driver);
		Assert.assertTrue(assertionpom.welcometohomepage());

	}

	@Test(priority = 2)
	public void LOGINinvalidcredentails() {
		 loginpom = new login_pom(driver);
		 loginpom.combine_login(generateemailtimestamp(), generateemailtimestamp());
		 assertionpom = new assertion_pom(driver);
		Assert.assertTrue(assertionpom.errorisdisplayed());

	}

	@Test(priority = 3)
	public void LOGINvalidgmailandinvalidpassword() {
		 loginpom = new login_pom(driver);
		 loginpom.combine_login(prop.getProperty("email"), generateemailtimestamp());
		 assertionpom = new assertion_pom(driver);
		Assert.assertTrue(assertionpom.errorisdisplayed());
	}

	@Test(priority = 4)
	public void LOGINinvalidgmailandvalidpassword() {
		 loginpom = new login_pom(driver);
		 loginpom.combine_login(generateemailtimestamp(), prop.getProperty("password"));
		 assertionpom = new assertion_pom(driver);
		Assert.assertTrue(assertionpom.errorisdisplayed());
	}

	@Test(priority = 5)
	public void LOGINwithoutanycredentials() {
		 loginpom = new login_pom(driver);
		 loginpom.combine_login(" ", "");
		 assertionpom = new assertion_pom(driver);
		Assert.assertTrue(assertionpom.errorisdisplayed());
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	public static String generateemailtimestamp() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	}
}
