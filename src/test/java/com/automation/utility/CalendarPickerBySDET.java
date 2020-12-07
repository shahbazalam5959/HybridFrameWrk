package com.automation.utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//important date picker

public class CalendarPickerBySDET {

	public static void main(String[] args) throws Exception {
		
		String month = "November 2020";
		String day = "20";
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		
		while(true)
		{
			String text = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div[@class='ui-datepicker-title']")).getText();
		
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}	
		
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
		
		for(WebElement ele : alldates)
		{
			//System.out.println(ele.getText()); //if getting txt assciated with month then 1st store it string type array and then split it then chk for condition str[].equals(day) then click
			String dateNum = ele.getText();
			if(dateNum.equals(day))
			{
				ele.click();
				break;
			}
		}
	}

}

//if the date picker table is of different kind means if the calendar header is of link type.
// Then we need to take xpath in this way
//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td[contains(text(),'15')]




