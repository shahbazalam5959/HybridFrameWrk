package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

		XSSFWorkbook wb;
	
		public ExcelDataProvider()
		{
			File src = new File("./TestData/TestData.xlsx");
			
			try {
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
				} 
			catch (Exception e) 
				{
				System.out.println("Unable to Read Excel File"+e.getMessage());
				}
		}
		public String getExcelData(int SheetIndex,int row,int col)
		{
			return wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();
		}
		public String getExcelData(String SheetName,int row,int col)
		{
			return wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
		}
		public double getNumExcelData(String SheetName,int row,int col)
		{
			return wb.getSheet(SheetName).getRow(row).getCell(col).getNumericCellValue();
		}
		
}
