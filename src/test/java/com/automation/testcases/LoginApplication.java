package com.automation.testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utility.Retry;
import com.automation.utility.browserFactory;

public class LoginApplication extends BaseClass
{
		
		@Test(enabled=false)
		public void createAccount()
		{
			
			LoginPage Sup = PageFactory.initElements(driver,LoginPage.class);
			
			Sup.SignUpMyntra("shahbaz.alam55187@gmail.com", "Shahbaz@123", "7003800041");
			
		}
	
		@Test(priority=1,retryAnalyzer=Retry.class)
		public void signIn()
		{
			LoginPage sIN = PageFactory.initElements(driver,LoginPage.class);
			
			sIN.loginToMynta("shahbaz.alam55187@gmail.com", "Shahbaz@123");
			
			//String verifylogin = "FILTERS";
			
			
		}
		
		@Test(priority=2)
		public void buyShirt()
		{
			LoginPage buy = PageFactory.initElements(driver,LoginPage.class);
			
			buy.buyMenShirt("700013");
		}
}
