package com.automation.utility;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {

		public static WebDriver startApplication(WebDriver driver,String browserName,String qaURL)
		{
			if(browserName.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				
				driver = new ChromeDriver();
				
//				Map<String, Object> prefs = new HashMap<String, Object>();
//			      
//		        // Set the notification setting it will override the default setting
//				prefs.put("profile.default_content_setting_values.notifications", 2);
//				
//				ChromeOptions options = new ChromeOptions();
//		        
//				options.setExperimentalOption("prefs", prefs); // Set the experimental option
//
//				driver = new ChromeDriver(options);
				
			}
			else if(browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else
			{
				System.out.println("Sorry!!! We do not support this browser...");
			}
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(qaURL);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			return driver;
		}
		
		public static void quitBrowser(WebDriver driver)
		{
			driver.quit();
		}
}
