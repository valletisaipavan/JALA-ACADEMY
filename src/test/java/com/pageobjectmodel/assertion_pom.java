package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class assertion_pom {
	WebDriver driver;

	@FindBy(xpath = "//center[@class='pt_100']/h1")
	private WebElement welcometojala;

	@FindBy(xpath = "//div[@class='toast-title']")
	private WebElement error;

	@FindBy(xpath = "//h3[@class='box-title']")
	private WebElement saveddetails;
	@FindBy(xpath="//div[@class='toast-message']")
	private WebElement errormessege;
	@FindBy(xpath="(//tr[@role='row']/td)[1]")
	private WebElement searchATname;
	@FindBy(xpath="//img[@class='lnXdpd']")
	private WebElement csspropertiesgoogle;

	public assertion_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean welcometohomepage() {
		boolean displaystatus = welcometojala.isDisplayed();
		return displaystatus;
	}

	public boolean errorisdisplayed() {
		boolean errdisplaystatus = error.isDisplayed();
		return errdisplaystatus;
	}

	public  boolean savedemployerdetails() {
		boolean saved = saveddetails.isDisplayed();
		return saved;
	}
	public boolean errormessegedisplayed() {
		boolean errordisplayed=errormessege.isDisplayed();
		return errordisplayed;
	}
	
	public boolean namedisplayed_searchfunctionality() {
		boolean namedisplay=searchATname.isDisplayed();
		return namedisplay;
	}
	public  boolean checkcsspropertiesgoogle() {
		boolean cssgoogle=csspropertiesgoogle.isDisplayed();
		return cssgoogle;
	}
}
