package Testpakage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport {

	@Test
	public void report()
	{
	
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/Myownreport.html");
		ExtentReports extent=new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("loginTest");
		
		logger.log(Status.INFO, "login info");
		logger.log(Status.FAIL, "fail");
		extent.flush();
		
		
	}
	
	@Test
	public void report2()
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/Myownreport.html");
		ExtentReports extent=new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest logger2 = extent.createTest("loginTest");
		
		logger2.log(Status.INFO, "login info");
		logger2.log(Status.PASS, "pass");
		extent.flush();
		
	}
}
