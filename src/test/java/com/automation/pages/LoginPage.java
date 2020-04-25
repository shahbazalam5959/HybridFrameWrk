package com.automation.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//span[contains(text(),'Profile')]") WebElement ClickonProfile;
	
	@FindBy(xpath="//a[@href='/register?referer=https://www.myntra.com/']")
	WebElement SignUp;
	
	@FindBy(xpath="//input[@name='email']") WebElement EnterEmail;
	
	@FindBy(xpath="//input[@name='password']") WebElement PassWrd;
	
	@FindBy(xpath="//input[@name='mobile']") WebElement EnterNumber;
	
	@FindBy(xpath="//input[@name='gender' and @value='male']") WebElement ClickonMale;
	
	@FindBy(xpath="//button[contains(text(),'REGISTER')]") WebElement Reg;
	
	
	
	@FindBy(xpath="//input[@name='email' and @placeholder='Your Email Address']") WebElement fpUname;
	@FindBy(xpath="//input[@name='password' and @placeholder='Enter Password']") WebElement fpPwd;
	@FindBy(xpath="//button[contains(text(),'Log in')]") WebElement fpLogin;
	
	@FindBy(xpath="//a[contains(text(),'log in')]") WebElement ClickonSignIn;
	
	@FindBy(xpath="//a[contains(text(),'Men')]") WebElement clickOnMenTab;
	@FindBy(xpath="//a[contains(text(),'Casual Shirts')]") WebElement clklonCasualShirts;
	@FindBy(xpath="//ul[@class='price-list']/li[1]") WebElement firstPriceList;
	
	@FindBy(xpath="//ul[@class='results-base']/li[4]") WebElement BeneKleedShirt;
	@FindBy(xpath="//p[contains(text(),'39')]") WebElement clickOnSize39;
	@FindBy(xpath="//input[@type='text' and @name='pincode']") WebElement enterPincode;
	@FindBy(xpath="//input[@type='submit' and @value='Check']") WebElement verifyPincode;
	@FindBy(xpath="//span[contains(text(),'Bag')]") WebElement chkProdOnCart;
	
	
	
	public  void SignUpMyntra(String regEmail,String pwd,String mobNumber)
	{
		
		ClickonProfile.click();
		
		SignUp.click();
		
		EnterEmail.sendKeys(regEmail);
		
		PassWrd.sendKeys(pwd);
		
		EnterNumber.sendKeys(mobNumber);
		
		ClickonMale.click();
		
		Reg.click();
	}
	
	public void loginToMynta(String appsUsername,String appsPassword)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		ClickonProfile.click();
		ClickonSignIn.click();
		fpUname.sendKeys(appsUsername);
		fpPwd.sendKeys(appsPassword);
		fpLogin.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void buyMenShirt(String pin)
	{
		//clickOnMenTab.click();
		Actions act = new Actions(driver);
		act.moveToElement(clickOnMenTab).perform();
		
		clklonCasualShirts.click();
		firstPriceList.click();
		BeneKleedShirt.click();
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
				driver.switchTo().window(child);
		}
		clickOnSize39.click();
		enterPincode.sendKeys(pin);
		verifyPincode.click();
		chkProdOnCart.click();
	}
	
}
