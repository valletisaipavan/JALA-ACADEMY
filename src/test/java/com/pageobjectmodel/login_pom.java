package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pom {
	WebDriver driver ;
    @FindBy(xpath="//input[@id='UserName']")
	private WebElement login_username;
	@FindBy(xpath="//input[@id='Password']")
 private   WebElement login_password;
	@FindBy(xpath="//button[@id='btnLogin']")
private	WebElement login;
	
	
	
	public login_pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremailaddress(String emailtext) {
		login_username.sendKeys(emailtext);
}
	
	public void enterpassword(String password) {
		login_password.sendKeys(password);
	}
	public void clicklogin() {
		login.click();
	}
	
	public void combine_login(String emailtext,String password) {
		login_username.sendKeys(emailtext);
		login_password.sendKeys(password);
		login.click();
	}
	
	
	
}

