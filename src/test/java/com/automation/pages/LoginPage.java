package com.automation.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.automation.utility.Helper;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//span[contains(text(),'Profile')]") 
	@CacheLookup
	WebElement ClickonProfile;
	
	@FindBy(xpath="//a[@href='/register?referer=https://www.myntra.com/']")
	@CacheLookup
	WebElement SignUp;
	
	@FindBy(xpath="//input[@name='email']") 
	@CacheLookup
	WebElement EnterEmail;
	
	@FindBy(xpath="//input[@name='password']") 
	@CacheLookup
	WebElement PassWrd;
	
	@FindBy(xpath="//input[@name='mobile']") 
	@CacheLookup
	WebElement EnterNumber;
	
	@FindBy(xpath="//input[@name='gender' and @value='male']") 
	@CacheLookup
	WebElement ClickonMale;
	
	@FindBy(xpath="//button[contains(text(),'REGISTER')]") 
	@CacheLookup
	WebElement Reg;
	
	
	
	@FindBy(xpath="//input[@name='email' and @placeholder='Your Email Address']") 
	@CacheLookup
	WebElement fpUname;
	
	@FindBy(xpath="//input[@name='password' and @placeholder='Enter Password']") 
	@CacheLookup
	WebElement fpPwd;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]") 
	@CacheLookup
	WebElement fpLogin;
	
	@FindBy(xpath="//a[contains(text(),'log in')]") 
	@CacheLookup
	WebElement ClickonSignIn;
	
	@FindBy(xpath="//a[contains(text(),'Men')]") 
	@CacheLookup
	WebElement clickOnMenTab;
	
	@FindBy(xpath="//a[contains(text(),'Casual Shirts')]")
	@CacheLookup
	WebElement clklonCasualShirts;
	
	@FindBy(xpath="//ul[@class='price-list']/li[1]") 
	@CacheLookup
	WebElement firstPriceList;
	
	@FindBy(xpath="//ul[@class='results-base']/li[4]")
	@CacheLookup
	WebElement BeneKleedShirt;
	
	@FindBy(xpath="//p[contains(text(),'39')]") 
	@CacheLookup
	WebElement clickOnSize39;
	
	@FindBy(xpath="//input[@type='text' and @name='pincode']")
	@CacheLookup
	WebElement enterPincode;
	
	@FindBy(xpath="//input[@type='submit' and @value='Check']") 
	@CacheLookup
	WebElement verifyPincode;
	
	@FindBy(xpath="//span[contains(text(),'Bag')]") 
	@CacheLookup
	WebElement chkProdOnCart;
	
	
	public void SignUpMyntra(String regEmail,String pwd,String mobNumber)
	{
		
		ClickonProfile.click();
		
		SignUp.click();
		
		EnterEmail.sendKeys(regEmail);
		
		PassWrd.sendKeys(pwd);
		
		EnterNumber.sendKeys(mobNumber);
		
		ClickonMale.click();
		
		Reg.click();
	}
	
	public void loginToMynta(String appsUsername,String appsPassword) throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		ClickonProfile.click();
		ClickonSignIn.click();
		fpUname.sendKeys(appsUsername);
		fpPwd.sendKeys(appsPassword);
		fpLogin.click();
		
		Thread.sleep(3000);
	}
	
	public void buyMenShirt(String pin)
	{
		//clickOnMenTab.click();
		Actions act = new Actions(driver);
		act.moveToElement(clickOnMenTab).perform();
		
		clklonCasualShirts.click();
		firstPriceList.click();
		BeneKleedShirt.click();
//		String parent = driver.getWindowHandle();
//		Set<String> allWindows = driver.getWindowHandles();
//		for(String child:allWindows)
//		{
//			if(!parent.equalsIgnoreCase(child))
//				driver.switchTo().window(child);
//		}
		Helper.mulipleWindows(driver); //added by me if its not working plz uncomment the above comment & reove this line
		clickOnSize39.click();
		enterPincode.sendKeys(pin);
		verifyPincode.click();
		chkProdOnCart.click();
	}
	
}
