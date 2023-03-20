package jalaacademy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BASECLASS {
	WebDriver driver;
	Properties prop;
	

	

	public BASECLASS()  {
						File propfile = new File(
				"E:\\Automation workspace\\mavenproject\\src\\test\\java\\jalaacademy\\propertiesfile-1");
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(propfile);
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
		

	}

	public WebDriver initializationmethod() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
//	public static String generateemailtimestamp() {
//		Date date = new Date();
//		String gentareemal = date.toString().replace(" ", "_").replace(":", "_");
//		return gentareemal;
//	}
}


