package com.automation.utility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.automation.pages.BaseClass;

public class HandlePopUp {
	//xtra class added
	//public static void main(String[] args) throws Exception {
	
	  public static void handlePopUp()
	  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahzad\\Desktop\\Selenium Webdriver Tutorial Basics+Advanced+Interview Guide\\Browswer_Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
        // Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();
      
        // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
        
		options.setExperimentalOption("prefs", prefs); // Set the experimental option

		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.myntra.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Profile')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@href='/register?referer=https://www.myntra.com/']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shahbazalam59@gmail.com");
}
}