package com.automation.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableHandle {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//ArrayList<String> lst = new ArrayList<String>();
		
		String beforeXpath ="//*[@id='customers']/tbody/tr[";
		String afterXpath ="]/th[";
		String afterXpathNew ="]/td[";
		String endPart ="]";
		
		List<WebElement> lst = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCNT=lst.size();
		
		List<WebElement> lstCol = driver.findElements(By.xpath("//table[@id='customers']//th"));
		int colCNT=lstCol.size();
		System.out.println(colCNT);
		
		ExcelDataProvider exl = new ExcelDataProvider();
		
		ExcelDataProvider.sh = ExcelDataProvider.wb.getSheetAt(0);
		
     	for(int i=1;i<=rowCNT;i++)
		{
     		
     		XSSFRow rows = ExcelDataProvider.sh.createRow(i);
     		for(int j=1;j<=colCNT;j++)
			{
     			if(i<2)
     			{
				String actXpath = beforeXpath+i+afterXpath+j+endPart;
				String str = driver.findElement(By.xpath(actXpath)).getText();
				System.out.println(str);
				exl.setCellData(rows, j, str);
     			}
     			else
     			{
     				String actXpath = beforeXpath+i+afterXpathNew+j+endPart;
    				String str = driver.findElement(By.xpath(actXpath)).getText();
    				System.out.println(str);
    				exl.setCellData(rows, j, str);
     			}
     				
			}
		}
     	ExcelDataProvider.wb.close();
	}

}
