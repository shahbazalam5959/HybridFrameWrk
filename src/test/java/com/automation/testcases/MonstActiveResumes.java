package com.automation.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonstActiveResumes {

	@Test()
	public void getActiveResumesCnt() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("login")).sendKeys("monsterinternaldtest");
	 
	 driver.findElement(By.id("passwd")).sendKeys("7522RmmidZ");
	 
	 driver.findElement(By.xpath("//input[@id='sub_but1']")).click();
	 
	 String actTitle = driver.getTitle();
	 
	 Assert.assertEquals("MonsterIndia.com - More jobs for Indians", driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 driver.findElement(By.xpath("//div[@id='employer_pop_super']//div[@class='right rpop_close']")).click();
	 
	 driver.findElement(By.xpath("//li[@id='mpower']")).click();
	 
	 Thread.sleep(5000);
	 //driver.findElement(By.xpath("//a[contains(text(),'older version?')]")).click();
	 driver.findElement(By.linkText("older version?")).click();
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 1600)");
	 
	 driver.findElement(By.xpath("//div[@id='selDay']")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(),'in last 1 day')]")).click();
	 
	 driver.findElement(By.xpath("//input[@id='search_submit']")).click();
	 
	 String ResumeCNT = driver.findElement(By.xpath("//span[contains(text(),'Resumes Found')]")).getText();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Active Resumes for 1 Day  : ");
	 
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
	public void getActiveResumesCnt_Last7Days() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("login")).sendKeys("monsterinternaldtest");
	 
	 driver.findElement(By.id("passwd")).sendKeys("7522RmmidZ");
	 
	 driver.findElement(By.xpath("//input[@id='sub_but1']")).click();
	 
	 String actTitle = driver.getTitle();
	 
	 Assert.assertEquals("MonsterIndia.com - More jobs for Indians", driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 driver.findElement(By.xpath("//div[@id='employer_pop_super']//div[@class='right rpop_close']")).click();
	 
	 driver.findElement(By.xpath("//li[@id='mpower']")).click();
	 
	 Thread.sleep(5000);
	 //driver.findElement(By.xpath("//a[contains(text(),'older version?')]")).click();
	 driver.findElement(By.linkText("older version?")).click();
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 2500)");
	 
	 driver.findElement(By.xpath("//div[@id='selDay']")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(),'in last 7 days')]")).click();
	 
	 driver.findElement(By.xpath("//input[@id='search_submit']")).click();
	 
	 String ResumeCNT = driver.findElement(By.xpath("//span[contains(text(),'Resumes Found')]")).getText();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.println("Number of Active Resumes for Last 7 Days  : ");
	 
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
	
	
	
	@Test
	public void getCreatedResumesCnt_for_1Day() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("login")).sendKeys("monsterinternaldtest");
	 
	 driver.findElement(By.id("passwd")).sendKeys("7522RmmidZ");
	 
	 driver.findElement(By.xpath("//input[@id='sub_but1']")).click();
	 
	 String expTitle = driver.getTitle();
	 
	 Assert.assertEquals(expTitle, driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 driver.findElement(By.xpath("//div[@id='employer_pop_super']//div[@class='right rpop_close']")).click();
	 
	 driver.findElement(By.xpath("//li[@id='mpower']")).click();
	 
	 Thread.sleep(5000);
	 //driver.findElement(By.xpath("//a[contains(text(),'older version?')]")).click();
	 driver.findElement(By.linkText("older version?")).click();
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 2500)");
	 
	 driver.findElement(By.xpath("//input[@id='radNup1']")).click();
	 
	 driver.findElement(By.xpath("//div[@id='selDay']")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(),'in last 1 day')]")).click();
	 
	 driver.findElement(By.xpath("//input[@id='search_submit']")).click();
	 
	 String ResumeCNT = driver.findElement(By.xpath("//span[contains(text(),'Resumes Found')]")).getText();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Created Resumes for 1 Day  : ");
	 
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
	
	@Test
	public void getCreatedResumesCnt_for_7Day() throws Exception
	{
		
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://recruiter.monsterindia.com/");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("login")).sendKeys("monsterinternaldtest");
	 
	 driver.findElement(By.id("passwd")).sendKeys("7522RmmidZ");
	 
	 driver.findElement(By.xpath("//input[@id='sub_but1']")).click();
	 
	 String expTitle = driver.getTitle();
	 
	 Assert.assertEquals(expTitle, driver.getTitle());
	 
	 System.out.println("Logged in Successfully !!!");
	
	 driver.findElement(By.xpath("//div[@id='employer_pop_super']//div[@class='right rpop_close']")).click();
	 
	 driver.findElement(By.xpath("//li[@id='mpower']")).click();
	 
	 Thread.sleep(5000);
	 //driver.findElement(By.xpath("//a[contains(text(),'older version?')]")).click();
	 driver.findElement(By.linkText("older version?")).click();
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	 
	 Thread.sleep(5000);

	 jsx.executeScript("scroll(0, 2500)");
	 
	 driver.findElement(By.xpath("//input[@id='radNup1']")).click();
	 
	 driver.findElement(By.xpath("//div[@id='selDay']")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(),'in last 7 days')]")).click();
	 
	 driver.findElement(By.xpath("//input[@id='search_submit']")).click();
	 
	 String ResumeCNT = driver.findElement(By.xpath("//span[contains(text(),'Resumes Found')]")).getText();
	 
	 System.out.println(ResumeCNT);
	 
	 char arr[] = ResumeCNT.toCharArray();
	 
	 System.out.print("Number of Created Resumes for 1 Day  : ");
	 
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
