package com.automation.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.txw2.Document;

public class writeWithoutSendkeys {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		
		// This will execute JavaScript in your script
		jsx.executeScript("document.getElementById('email').value='you tube';");
		
		}

}
