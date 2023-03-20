package com.JALA.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class EXTENDREPORTS {
	
public static ExtentReports generateextendreportsjala() throws Throwable {
	
	ExtentReports extendreports = new ExtentReports();
	File file= new File(("user.dir")+"\\test-output\\extendreport\\ectendreport.html");
	
	ExtentSparkReporter spark = new ExtentSparkReporter(file);
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("JALA-ACADEMY-REPORT");
	spark.config().setReportName("jala academy automation reports");
	spark.config().setTimeStampFormat("dd//mm//yyyy hh:mm:ss");
	extendreports.attachReporter(spark);
	Properties configprop = new Properties();
	File configfile= new File("E:\\Automation workspace\\mavenproject\\src\\test\\java\\jalaacademy\\propertiesfile-1");
	FileInputStream configfis= new FileInputStream(configfile);
		configprop.load(configfis);
		
	extendreports.setSystemInfo("Application url", configprop.getProperty("url"));
	extendreports.setSystemInfo("Browsername",configprop.getProperty("browsername"));
	extendreports.setSystemInfo("emailaddress", configprop.getProperty("email"));
	extendreports.setSystemInfo("password", configprop.getProperty("password"));
	extendreports.setSystemInfo("operating system", configprop.getProperty("os.name"));
	extendreports.setSystemInfo("user name", configprop.getProperty("user.name"));
	extendreports.setSystemInfo("java version", configprop.getProperty("java.version"));
	return extendreports;
}
}
