package com.automation.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.LocatorPage;

public class CopyOfMonstActiveResumes {

	WebDriver driver=null;
	
	@Test()
	public void getActiveResumesCnt() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 LocatorPage lp = PageFactory.initElements(driver, LocatorPage.class);
	 
	 lp.userName("monsterinternaldtest");
	 
	 lp.passWord("7522RmmidZ");
	 
	 lp.submit();
	 
	 //Assert.assertEquals("MonsterIndia.com - More jobs for Indians", driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 lp.CanclePopUp_inLoginPage();
	 
	 lp.Click_On_mPowerSearch();

	 Thread.sleep(5000);
	 
	 lp.Click_on_OlderVersion();
	 
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 2500)");
	 
	 lp.Click_on_ActiveDD();
	 
	 lp.Select_on_LastOneDay();
	 
	 lp.Click_on_GetResume();
	 
	 String ResumeCNT = lp.Find_Active_Resume_For1Day();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Active Resumes for 1 Day  : ");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>=48 && arr[i]<=56)
		 {
			 System.out.print(arr[i]);
		 }
		 System.out.println();
	 }
	 
	 driver.quit();
	}
	
	@Test()
	public void get_Active_Resumes_For7Days_Cnt() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	 driver.manage().window().maximize();
	 
	 LocatorPage lp = PageFactory.initElements(driver, LocatorPage.class);
	 
	 lp.userName("monsterinternaldtest");
	 
	 lp.passWord("7522RmmidZ");
	 
	 lp.submit();
	 
	 //Assert.assertEquals("MonsterIndia.com - More jobs for Indians", driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 lp.CanclePopUp_inLoginPage();
	 
	 lp.Click_On_mPowerSearch();

	 Thread.sleep(3000);
	 
	 lp.Click_on_OlderVersion();
	 
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(3000);
	 
	 jsx.executeScript("scroll(0, 2500)");
	 
	 lp.Click_on_ActiveDD();
	 
	 Thread.sleep(5000);
	 
	 lp.Select_on_LastSevenDay();
	 
	 lp.Click_on_GetResume();
	 
	 String ResumeCNT = lp.Find_Active_Resume_For7Day();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Active Resumes for 7 Day  : ");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>=48 && arr[i]<=56)
		 {
			 System.out.print(arr[i]);
		 }
		 
	 }
	 System.out.println();
	 driver.quit();
	}
	
	@Test()
	public void getCreatedResumesCnt() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 LocatorPage lp = PageFactory.initElements(driver, LocatorPage.class);
	 
	 lp.userName("monsterinternaldtest");
	 
	 lp.passWord("7522RmmidZ");
	 
	 lp.submit();
	 
	 Assert.assertEquals("MonsterIndia.com - More jobs for Indians", driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 lp.CanclePopUp_inLoginPage();
	 
	 lp.Click_On_mPowerSearch();

	 Thread.sleep(5000);
	 
	 lp.Click_on_OlderVersion();
	 
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 2500)");
	 
	 lp.Click_On_CreatedButton();
	 
	 lp.Click_on_ActiveDD();
	 
	 Thread.sleep(3000);
	 
	 lp.Select_on_LastOneDay();
	 
	 lp.Click_on_GetResume();
	 
	 String ResumeCNT = lp.Find_Active_Resume_For1Day();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Created Resumes for last 1 Day  : ");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>=48 && arr[i]<=57)
		 {
			 System.out.print(arr[i]);
		 }
	 }
	 System.out.println();
	 driver.quit();
	}
	
	@Test()
	public void getCreatedResumesCnt_For_7Days() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
	 
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 LocatorPage lp = PageFactory.initElements(driver, LocatorPage.class);
	 
	 lp.userName("monsterinternaldtest");
	 
	 lp.passWord("7522RmmidZ");
	 
	 lp.submit();
	 
	 Assert.assertEquals("MonsterIndia.com - More jobs for Indians", driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 lp.CanclePopUp_inLoginPage();
	 
	 lp.Click_On_mPowerSearch();

	 Thread.sleep(5000);
	 
	 lp.Click_on_OlderVersion();
	 
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 2500)");
	 
	 lp.Click_On_CreatedButton();
	 
	 lp.Click_on_ActiveDD();
	 
	 Thread.sleep(3000);
	 
	 lp.Click_On_Created_inLast7day();
	 
	 lp.Click_on_GetResume();
	 
	 String ResumeCNT = lp.Find_Created_Resume_For7Day();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Created Resumes for last 7 Day  : ");
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>=48 && arr[i]<=57)
		 {
			 System.out.print(arr[i]);
		 }
	 }
	 System.out.println();
	 driver.quit();
	}
	
	
	
}
