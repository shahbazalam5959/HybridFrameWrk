package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

	
public class Helper {
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+"/Screenshot/Myntra_"+getCurrentDateTime()+".png";
		
		System.out.println("Screenshot captured!");
		
		try 
		{	
			FileHandler.copy(src, new File(screenshotPath));
		} 
		catch (IOException e) 
		{
			System.out.println("Unable to capture screenshot "+e.getMessage());
		}
		
		return screenshotPath;
}
	//This method will return currentDate & Time
	public static String getCurrentDateTime()
	{
		DateFormat df = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate = new Date();
		
		return df.format(currentDate);
	}
	
	//This method will use to work with miltiple windows
	public static void mulipleWindows(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String child : allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
			}
		}
		
	}
	
	//This method will use for highlighting webElement
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor jsx=(JavascriptExecutor)driver; 
	 
	jsx.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	jsx.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	}
	//This method will handle alert
	public static void handleAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
}