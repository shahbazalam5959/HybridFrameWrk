package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

		static XSSFWorkbook wb;
		static XSSFSheet sh;
		static XSSFRow row;
		static XSSFCell col;
		FileOutputStream  fout;
		FileInputStream fis;
		File src;
		public ExcelDataProvider()
		{
			 src = new File("./TestData/TestData.xlsx");
			 
			try {
				fis = new FileInputStream(src);
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
		public int getNumExcelData(String SheetName,int row,int col)
		{
			return (int)wb.getSheet(SheetName).getRow(row).getCell(col).getNumericCellValue();
		}
		
		public void setCellData(XSSFRow rows,int column,String data) throws IOException
		{	
			rows.createCell(column).setCellValue(data);
			
			fout = new FileOutputStream(src);
			
			wb.write(fout);
			
		}
		
		//By SDET
		public void setCellData(int sheetIndex,int rownum,int column,String data) throws IOException
		{
			sh = wb.getSheetAt(sheetIndex);
			row = sh.createRow(rownum);
			col = row.createCell(column);
			col.setCellValue(data);
			fout = new FileOutputStream(src);
			wb.write(fout);
			fis.close();
			fout.close();
		}
		
}
