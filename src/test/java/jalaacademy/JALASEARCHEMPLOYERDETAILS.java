package jalaacademy;

import org.testng.annotations.Test;

import com.pageobjectmodel.assertion_pom;
import com.pageobjectmodel.employer_pom;
import com.pageobjectmodel.login_pom;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class JALASEARCHEMPLOYERDETAILS extends BASECLASS {
	public JALASEARCHEMPLOYERDETAILS() throws Throwable {
		super();

	}

	public WebDriver driver;

	@Test
	public void SEARCHDETAILS() throws Throwable {
		employer_pom employerpom = new employer_pom(driver);
		employerpom.clickemployesearch();//2
		employerpom.searchdetails(prop.getProperty("FirstName"), prop.getProperty("MobileNo"));//2
		assertion_pom assertionpom = new assertion_pom(driver);
		Thread.sleep(2000);
		assertionpom.namedisplayed_searchfunctionality();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = initializationmethod();
		login_pom loginpom = new login_pom(driver);
		loginpom.combine_login(prop.getProperty("email"), prop.getProperty("password"));
 	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
