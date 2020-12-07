package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorPage {

	WebDriver driver;
	
	public LocatorPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(id="login")
	WebElement login;
	
	public void userName(String Uname)
	{
		login.sendKeys(Uname);
	}
	
	@FindBy(id="passwd")
	WebElement pwd;
	
	public void passWord(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	@FindBy(xpath="//input[@id='sub_but1']")
	WebElement clickOnlogin;
	
	public void submit()
	{
		clickOnlogin.click();
	}
	
	@FindBy(xpath="//div[@id='employer_pop_super']//div[@class='right rpop_close']")
	WebElement LoginPage_popup;
	
	public void CanclePopUp_inLoginPage()
	{
		LoginPage_popup.click();
	}
	
	
	@FindBy(xpath="//li[@id='mpower']")
	WebElement mPowerSearch;
	
	public void Click_On_mPowerSearch()
	{
		mPowerSearch.click();
	}
	
	@FindBy(linkText="older version?")
	WebElement olderVersionClick;
	
	public void Click_on_OlderVersion()
	{
		olderVersionClick.click();
	}
	
	@FindBy(xpath="//div[@id='selDay']")
	WebElement activedropdownClick;
	
	public void Click_on_ActiveDD()
	{
		activedropdownClick.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'in last 1 day')]")
	WebElement clickinLast1Day;
	
	public void Select_on_LastOneDay()
	{
		clickinLast1Day.click();
	}
	
//	@FindBy(xpath="//a[contains(text(),'in last 7 days')]")
//	WebElement clickinLast7Day;
	
	@FindBy(linkText="in last 7 days")
	WebElement click_in_Last7Days;
	
	public void Select_on_LastSevenDay()
	{
		click_in_Last7Days.click();
	}
	
//	public void Select_on_LastSevenDay()
//	{
//		clickinLast7Day.click();
//	}
	
	@FindBy(xpath="//input[@id='search_submit']")
	WebElement clickGetResumes;
	
	public void Click_on_GetResume()
	{
		clickGetResumes.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Resumes Found')]")
	WebElement NoResumesFor1Day;
	
	
	
	public String Find_Active_Resume_For1Day()
	{
		return NoResumesFor1Day.getText();
	}
	
	@FindBy(xpath="//span[contains(text(),'Resumes Found')]")
	WebElement NoResumesFor7Day;
	
	public String Find_Active_Resume_For7Day()
	{
		return NoResumesFor7Day.getText();
	}
	
	@FindBy(xpath="//input[@id='radNup1']")
	WebElement ClkOnCreatedRadioButton;
	
	public void Click_On_CreatedButton()
	{
		ClkOnCreatedRadioButton.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'in last 1 day')]")
	WebElement clickUnderCreatedinLast1Day;
	
	public void Click_On_Created_inLast1day()
	{
		clickUnderCreatedinLast1Day.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'in last 7 days')]")
	WebElement clickUnderCreatedinLast7Day;	
	
	public void Click_On_Created_inLast7day()
	{
		clickUnderCreatedinLast7Day.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Resumes Found')]")
	 WebElement no_of_CreatedResume_for_7Day;
	
	public String Find_Created_Resume_For7Day()
	{
		return no_of_CreatedResume_for_7Day.getText();
	}
	
}
