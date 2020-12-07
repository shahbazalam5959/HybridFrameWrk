package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJS {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		
		String dateValue = "13/08";
		
		selectDateByJS(driver, date, dateValue);
	}
	//created utility for datePicker NAUT
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue)
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}

}
