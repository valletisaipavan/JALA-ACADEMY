package mylistners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.JALA.utils.EXTENDREPORTS;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class JALAlistners implements ITestListener {
	ExtentReports extendreports;
	ExtentTest extendtext;

	public void onTestStart(ITestResult result) {
		String testname = result.getName();
		 extendtext = extendreports.createTest(testname);
		extendtext.log(Status.INFO, testname+"started execute");
		//System.out.println(testname);
	}

	public void onTestSuccess(ITestResult result) {
		String testname = result.getName();
	 extendtext = extendreports.createTest(testname);
		extendtext.log(Status.PASS, testname+"onTestSuccess");
		
	}

	public void onTestFailure(ITestResult result) {
		String testname = result.getName();
		WebDriver driver=null;
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			
			e.printStackTrace();
		} catch (SecurityException e) {
			
			e.printStackTrace();
		}
	
	
	 File srcfile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String destfile = System.getProperty("user.dir"+"\\screenshot\\"+"\\testname.png");
	 try {
		FileHandler.copy(srcfile, new File(destfile));
	} catch (IOException e) {
				e.printStackTrace();
	}
	extendtext.addScreenCaptureFromPath(destfile);
	extendtext.log(Status.INFO, result.getThrowable());
	extendtext.log(Status.FAIL, testname+"failed");
		//System.out.println(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		String testname = result.getName();
	  extendtext = extendreports.createTest(testname);
		extendtext.log(Status.SKIP, testname+"onTestskip");
		extendtext.log(Status.INFO, result.getThrowable());
			//System.out.println(result.getThrowable());
	}

	public void onStart(ITestContext context) {
		try {
			extendreports=EXTENDREPORTS.generateextendreportsjala();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		extendreports.flush();
	}

}
