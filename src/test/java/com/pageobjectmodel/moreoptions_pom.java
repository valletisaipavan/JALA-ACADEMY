package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class moreoptions_pom {
	WebDriver driver;
@FindBy(xpath="//i[@class='fa fa-th-list']")
	private WebElement moreoptions;
@FindBy(xpath="(//i[@class='fa fa-hand-o-right'])[2]")
private WebElement menuoption;
@FindBy(xpath="(//a[@data-toggle='tab'])[1]")
private WebElement singlemenu;
@FindBy(id="b1")
private WebElement singlemenuJAVA;
@FindBy(id="label")
private WebElement javanote;
@FindBy(id="b4")
private WebElement singlemenuDATABASE;
@FindBy(id="label")
private WebElement databasenote;
@FindBy(xpath="//a[@href='/Home/Tabs'][text()=' Multiple Tabs']")
private WebElement multipletabs;
@FindBy(xpath="//a[@data-toggle='tab'][text()='Plan to Succeed']")
private WebElement multipletabplantosucced;
@FindBy(xpath="//p[contains(text(),'Congratulations')][1]")
private WebElement plantosuccedDATA;
@FindBy(xpath="//a[@href='/Home/Collapse']")
private WebElement collapsableoption;
@FindBy(xpath="//a[@aria-expanded='false'][text()='Multiple Collapse']")
private WebElement multiplecollapse;
@FindBy(xpath="//a[@aria-controls='collapseFour']")
private WebElement colabirate;
@FindBy(xpath="//p[text()='Teach and learn from each other']")
private WebElement collapsabletext;
@FindBy(xpath="//a[@href='/Home/AutoComplete']")
private WebElement autocomplete;
@FindBy(xpath="//a[@data-toggle='tab'][text()='Multiple Values']")
private WebElement automultiplevalues;
@FindBy(xpath="//input[@name='txtMultipleAutoComplete']")
private WebElement txtMultipleAutoComplete1;
@FindBy(xpath="//div[@class='ui-menu-item-wrapper'][text()='Java']")
private WebElement checktext1;
@FindBy(xpath="//input[@name='txtMultipleAutoComplete']")
private WebElement txtMultipleAutoComplete2;
@FindBy(xpath="//div[@class='ui-menu-item-wrapper'][text()='Asp']")
private WebElement checktext2;
@FindBy(xpath="//a[@href='/Home/CssProperty'][text()=' CSS Properties']")
private WebElement cssproperties;
@FindBy(xpath="//a[@data-toggle='tab'][text()='Links']")
private WebElement csspropertieLINK;
@FindBy(xpath="//a[@href='https://www.google.co.in/']")
private WebElement csspropertiesLINK1;
@FindBy(xpath="//a[@href='/Home/Links']")
private WebElement linkoption;
@FindBy(xpath="//a[@aria-expanded='false'][text()='Image Links']")
private WebElement linkimageoption;
@FindBy(xpath="//img[@alt='Goggle Link']")
private WebElement linkimagelogo;
@FindBy(xpath="//a[@href='/Home/Tooltip']")
private WebElement tooltips;
@FindBy(xpath="//a[@href='/Home/Popup']")
private WebElement popups;
@FindBy(id="confirmBox")
private WebElement popupoption1;
@FindBy(xpath="//a[@href='/Home/Iframe']")
private WebElement iframe;
@FindBy(xpath="//a[@href='https://jalaacademy.com/']")
private WebElement iframelinkpage;
@FindBy(xpath="//span[@class='hidden_xs']")
private WebElement popuplogout;
@FindBy(xpath="//a[@href='/Home/UploadImage'][text()=' Images']")
private WebElement imageoption;
@FindBy(xpath="//img[@alt='Google']")
private WebElement LINKGOOGLE;


public moreoptions_pom(WebDriver driver ) {
	this .driver = driver;
	PageFactory.initElements(driver, this);
	
}

public void clickmoreoption() {
	moreoptions.click();
}
public void clickmenuoption() {
	menuoption.click();
}

public void clicksinglemenu() {
	singlemenu.click();
}
public void clicksinglemenuJAVA() {
	singlemenuJAVA.click();	
}
public boolean displayedJAVAnote() {
	boolean displayJnote = javanote.isDisplayed();
	return displayJnote;
}
public void clicksinglemenuDATABASE() {
	singlemenuDATABASE.click();
}
public boolean displaydatabasenote() {
	boolean displayDBnote= databasenote.isDisplayed();
	return displayDBnote;
}

public void clickmultipletabs() {
	multipletabs.click();
}

public void clickmuliplePLANTOSUCCED() {
	multipletabplantosucced.click();
}
public boolean displayplantosuccedDATA() {
	boolean succeddata= plantosuccedDATA.isDisplayed();
	return succeddata;
}
public void clickcollapsableoption() {
	collapsableoption.click();
}
public void clickmultiplecollapse() {
	multiplecollapse.click();
}
public void clickcolabirateoption() {
	colabirate.click();
}
public String ckeckcollapsabletext() {
	String str=collapsabletext.getText();
	return str;
}
public void clickautocomplete() {
	autocomplete.click();
}

public void clickautomultiplevalues() {
	automultiplevalues.click();
}

public void checktxtMultipleAutoComplete1(String text1) {
	txtMultipleAutoComplete1.sendKeys(text1);
}

public void varifychecktext1() {
	checktext1.click();
}
public void checktxtMultipleAutoComplete2(String text2) {
	txtMultipleAutoComplete2.sendKeys(text2);
}
public void varifychecktext2() {
	checktext2.click();
}
public void clickcssproperties() {
	cssproperties.click();
}
public void clickcsspropertieLINK() {
	csspropertieLINK.click();
}
public void clickcsspropertiesLINK1() {
	csspropertiesLINK1.click();
}
public void clicklinkoption() {
	linkoption.click();
}
public void clicklinkimageoption() {
	linkimageoption.click();
}
public void clicklinkimagelogo() {
	linkimagelogo.click();
}
public void clicktooltips() {
	tooltips.click();
}
public void clickpopups() {
	popups.click();
}
public void clickpopupoption1() {
	popupoption1.click();
}
public void clickiframe() {
	iframe.click();
}

public void clickiframelinkpage() {
	iframelinkpage.click();
}
public void clickpopuplogout() {
	popuplogout.click();
}
public void clickimageoption() {
	imageoption.click();
}
public boolean displayLINKGOOGLE() {
	boolean linkgoogle=LINKGOOGLE.isDisplayed();
	return linkgoogle;
}






	}
