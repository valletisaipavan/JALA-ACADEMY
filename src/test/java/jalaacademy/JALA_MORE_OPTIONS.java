package jalaacademy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjectmodel.assertion_pom;
import com.pageobjectmodel.login_pom;
import com.pageobjectmodel.moreoptions_pom;

public class JALA_MORE_OPTIONS extends BASECLASS {

	public JALA_MORE_OPTIONS() throws Throwable {
		super();

	}

	public WebDriver driver;
	assertion_pom assertionpom;
	moreoptions_pom moreoptionspom;
	login_pom loginpom;

	@BeforeMethod
	public void setup() {
		driver = initializationmethod();
		 loginpom = new login_pom(driver);
		loginpom.combine_login(prop.getProperty("email"), prop.getProperty("password"));
		moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickmoreoption();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void MENU() {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickmenuoption();
		moreoptionspom.clicksinglemenu();
		moreoptionspom.clicksinglemenuJAVA();
		moreoptionspom.displayedJAVAnote();
		moreoptionspom.clicksinglemenuDATABASE();
		moreoptionspom.displaydatabasenote();
	}

	@Test(priority = 2)
	public void MULTITABS() {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickmultipletabs();
		moreoptionspom.clickmuliplePLANTOSUCCED();
		moreoptionspom.displayplantosuccedDATA();
	}

	@Test(priority = 3)
	public void COLLAPSIBLE_CONTENT() {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickcollapsableoption();
		moreoptionspom.clickmultiplecollapse();
		moreoptionspom.clickcolabirateoption();
		moreoptionspom.ckeckcollapsabletext(); // -----
//	String text = driver.findElement(By.xpath("//p[text()='Teach and learn from each other']")).getText();-----------
	}

	@Test(priority = 4)
	public void AUTOCOMPLETE() {
		 moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickautocomplete();
		moreoptionspom.clickautomultiplevalues();
		moreoptionspom.checktxtMultipleAutoComplete1("ja");
		moreoptionspom.varifychecktext1();
		moreoptionspom.checktxtMultipleAutoComplete2("A");
		moreoptionspom.varifychecktext2();

	}

	@Test(priority = 5)
	public void IMAGE() throws Exception {
		moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickimageoption();
				Thread.sleep(3000);
		new Actions(driver).click(driver.findElement(By.xpath("//input[@id='file']"))).perform(); // contextclick
																									// usedfor mouse
																									// right click

		StringSelection sc = new StringSelection("C:\\Users\\PAVAN\\Desktop\\PAVAN.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test(priority = 6)
	public void CSS_PROPERTIES() throws Throwable {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickcssproperties();
		moreoptionspom.clickcsspropertieLINK();
		moreoptionspom.clickcsspropertiesLINK1();
		Thread.sleep(3000);
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainwindowID = itr.next();
		String childwindowID = itr.next();
		driver.switchTo().window(childwindowID);
		assertionpom = new assertion_pom(driver);
	Assert.assertTrue(assertionpom.checkcsspropertiesgoogle());
	}

	@Test(priority = 7)
	public void LINKS() {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clicklinkoption();
		moreoptionspom.clicklinkimageoption();
		moreoptionspom.clicklinkimagelogo();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainwindow = itr.next();
		String childwindow = itr.next();
		driver.switchTo().window(childwindow);
		//moreoptionspom.displayLINKGOOGLE();
	}

	@Test(priority = 8)
	public void TOOLTIPS() {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clicktooltips();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("btnTooltip"))).click().perform();

	}

	@Test(priority = 9)
	public void POPUPS() throws Throwable {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickpopups();
		moreoptionspom.clickpopupoption1();
				Alert alert = driver.switchTo().alert();
		alert.accept();
		moreoptionspom.clickpopuplogout();
				driver.navigate().back();
	}

	@Test(priority = 10)
	public void IFRAMES() throws Throwable {
		moreoptions_pom moreoptionspom = new moreoptions_pom(driver);
		moreoptionspom.clickiframe();
				driver.switchTo().frame(1);
		Actions actions = new Actions(driver);
		actions.scrollToElement(driver.findElement(By.xpath("//a[@href='https://jalaacademy.com/']"))).perform();
		Thread.sleep(3000);
		moreoptionspom.clickiframelinkpage();
		

	}
}
