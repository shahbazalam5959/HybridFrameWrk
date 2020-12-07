package com.automation.utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyOfverifyBrokenLinks {

	public static void main(String[] args) throws Exception 
	{
			int count=0;
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://makemysushi.com/404?");
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			links.addAll(driver.findElements(By.tagName("img")));
			
			System.out.println("Total links are "+links.size());
			
			ExcelDataProvider exl = new ExcelDataProvider();
			
			for(int i=0;i<links.size();i++)
			{
				if(links.get(i).getAttribute("href") !=null && !(links.get(i).getAttribute("href").contains("javascript")))
				{
				 if(!(links.get(i).getAttribute("href").contains("tel")))
				 {
					WebElement ele= links.get(i);
				
					String url=ele.getAttribute("href");
					
					exl.setCellData(0, i, 0, url);
					
					count++;
					
					verifyActiveLink(url);
				 }
				}
			}
			
			System.out.println("Size of active links & images :"+count);
			
		}
		
		public static void verifyActiveLink(String linkUrl)
		{
			
			
	           try 
	           {
	        	   URL url = new URL(linkUrl);
				   
				   HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
				   
				   httpURLConnect.setConnectTimeout(3000);
				   
				   httpURLConnect.connect();
				   
				   if(httpURLConnect.getResponseCode()==200)
				   {
				       System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
				   }
				   if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) 
				   {
				       System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
//					   System.out.println(linkUrl+" - "+"Broken link");
				   }
			} 
	           catch (Exception e) 
	           {
	        	   System.out.println(e.getMessage());
	           } 
		}
	        
	 } 