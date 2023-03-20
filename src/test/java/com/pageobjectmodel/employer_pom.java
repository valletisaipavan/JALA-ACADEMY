package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employer_pom {
WebDriver driver;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private	WebElement lastName;
	@FindBy(id="EmailId")
	private	WebElement EmailId;
	@FindBy(id="MobileNo")
	private	WebElement MobileNo;
	@FindBy(id="DOB")
	private	WebElement DOB;
	@FindBy(id="rdbMale")
	private	WebElement gender;
	@FindBy(id="Address")
	private	WebElement Address;
	@FindBy(id="CountryId")
	private	WebElement CountryId;
	@FindBy(id ="CityId")
	private	WebElement CityId;
	@FindBy(id="chkSkill_5")
	private	WebElement skill1;
	@FindBy(id="chkSkill_6")
	private WebElement skill2;
	@FindBy(id="Name")
	private WebElement searchname;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement saveoption;
	@FindBy(xpath="//i[@class='fa fa-users']")
	private WebElement clickemployee;
	@FindBy(xpath="//i[@class='fa fa-pencil-square-o']")
	private WebElement clickcreate;
	@FindBy(xpath="//i[@class='fa fa-search']")
	private WebElement searchoption;
	@FindBy(id="MobileNo")
	private WebElement mobilenum;
	@FindBy(id="btnSearch")
	private WebElement searchATsearch;
	public employer_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void enterfirstname(String firstnametext) {
		firstname.sendKeys(firstnametext);
	}
	public void enterLastName(String lastnametext) {
		lastName.sendKeys(lastnametext);
	}
	
	public void enteremailid(String emailtext) {
		EmailId.sendKeys(emailtext);
	}
	
	public void entermobileno(String mobileno) {
		MobileNo.sendKeys(mobileno);
	}
	
	public void dateofbirth(String date) {
		DOB.sendKeys(date);
	}
	public void selectgender() {
		gender.click();
	}
	
	public void enteraddress(String addresstext) {
		Address.sendKeys(addresstext);
	}
	
	public void enterCountryId(String countrytext) {
		CountryId.sendKeys(countrytext);
	}
	public void enterCity(String citytext) {
		CityId.sendKeys(citytext);
	}
	
	public void skillbox1() {
		skill1.click();
	}
	
	public void skillbox2() {
		skill2.click();
	}
	public void clicksavebutton() {
		saveoption.click();
	}
	public void clickemployeeoption() {
		clickemployee.click();
		
	}
	
	public void clickcreateoption() {
		clickcreate.click();
		
	}
	
	public void clicksearchoption() {
		searchoption.click();
	}
	
	public void clicksearchnamefields(String nametext) {
		searchname.sendKeys(nametext);
	}
	
	public void clicksearchmobileno(String mobilenotext) {
		mobilenum.sendKeys(mobilenotext);
	}
	
	public void clicksearchATsearch() {
		searchATsearch.click();
	}
	
	public void searchdetails(String nametext,String mobilenotext) {
		searchname.sendKeys(nametext);
		mobilenum.sendKeys(mobilenotext);
		searchATsearch.click();
	}
	public void clickemployesearch(){
		clickemployee.click();
		searchoption.click();
	}
}
