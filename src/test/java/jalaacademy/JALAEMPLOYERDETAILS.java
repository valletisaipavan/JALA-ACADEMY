package jalaacademy;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjectmodel.assertion_pom;
import com.pageobjectmodel.employer_pom;
import com.pageobjectmodel.login_pom;

public class JALAEMPLOYERDETAILS extends BASECLASS {

	public JALAEMPLOYERDETAILS() throws Throwable {
		super();

	}

	assertion_pom assertionpom;
	employer_pom employerpom;
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = initializationmethod();
		login_pom loginpom = new login_pom(driver);
		loginpom.combine_login(prop.getProperty("email"), prop.getProperty("password"));
//		loginpom.enteremailaddress(prop.getProperty("email"));
//		loginpom.enterpassword(prop.getProperty("password"));
//		loginpom.clicklogin();
		employerpom = new employer_pom(driver);
		 employerpom.clickemployeeoption();
		employerpom.clickcreateoption();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void CREATEVALIDEMPLOYEEDETAILS() {
		
		employerpom.enterfirstname(prop.getProperty("FirstName"));
		employerpom.enterLastName(prop.getProperty("Lastname"));
		employerpom.enteremailid(prop.getProperty("EmailId"));
		employerpom.entermobileno(prop.getProperty("MobileNo"));
		employerpom.dateofbirth(prop.getProperty("DOB"));
		employerpom.selectgender();
		employerpom.enteraddress(prop.getProperty("Address"));
		employerpom.enterCountryId(prop.getProperty("CountryId"));
		employerpom.enterCity(prop.getProperty("CityId"));
		employerpom.skillbox1();
		employerpom.skillbox2();
		employerpom.clicksavebutton();
		assertionpom = new assertion_pom(driver);
		Assert.assertTrue(assertionpom.savedemployerdetails());

	}

	@Test(priority = 2)
	public void CREATEWITHOUTDETAILS() throws Throwable {
	
		employerpom.enterfirstname(" ");
		employerpom.enterLastName(" ");
		employerpom.enteremailid(" ");
		employerpom.entermobileno(" ");
		employerpom.dateofbirth(" ");
		employerpom.selectgender();
		employerpom.enteraddress(" ");
		employerpom.enterCountryId(" ");
		employerpom.enterCity(" ");
		employerpom.skillbox1();
		employerpom.skillbox2();
		employerpom.clicksavebutton();
		assertionpom = new assertion_pom(driver);
		Thread.sleep(2000);
		Assert.assertTrue(assertionpom.errormessegedisplayed());
	}

}
