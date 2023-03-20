package com.JALA.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BASECLAS {
	WebDriver driver;
	Properties prop;
	

	

	public BASECLAS() throws Throwable {
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://magnus.jalatechnologies.com/");
		return driver;
	}

}


