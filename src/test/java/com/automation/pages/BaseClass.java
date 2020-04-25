package com.automation.pages;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;
import com.automation.utility.browserFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;
	public ExcelDataProvider excel;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void SetUpSuite()
	{
		Reporter.log("Setting Up report and Test is getting ready...",true);
		
		config = new ConfigDataProvider();
		excel = new ExcelDataProvider();
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/MyntraLogin"+".html"));
		report = new ExtentReports();
		report.attachReporter(extent);

	}

	@BeforeClass
	public void SetUp()
	{
		Reporter.log("Setting Done Test can be Started...",true);
		
		driver = browserFactory.startApplication(driver, config.getBrowser(), config.getStagingUrl());
		
	}
	
	@AfterClass
	public void tearDown()
	{
		browserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		Reporter.log("Test is about to end!!!",true);
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		
//		else if(ITestResult.SUCCESS==result.getStatus())
//		{
//			logger.pass("Test Succes", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
//		}
		else if(ITestResult.SKIP==result.getStatus())
		{
			logger.skip("Test Skipped", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		report.flush();
	}	
}
