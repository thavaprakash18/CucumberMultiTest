package com.thava.employeePages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RecruitmentCanditateDetails {
	 public static void getDetailsAndWriteInExcel(WebDriver wd) throws IOException{
		 WebElement view =wd.findElement(By.xpath("(.//label[text()='Method of Application'])"));
		   JavascriptExecutor js = (JavascriptExecutor)wd;
         js.executeScript("arguments[0].scrollIntoView(true)", view);
         
        File f = new File("C:/Batch251/G9_ExampleCucumber/src/test/resources/output/EmployeeDetails.xlsx");
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Home");
        
        XSSFRow row = sheet.createRow(0);
         
         for (int i = 2; i <=6; i++) {
			String fullXpath = "(.//div[@role='columnheader'])["+i+"]";
			String data=wd.findElement(By.xpath(fullXpath)).getText();
			
			XSSFCell cell = row.createCell(i-2);
			cell.setCellValue(data);
	}
         XSSFRow firstRow = sheet.createRow(1);
         for (int i = 2; i <=6; i++) {
 			String fullXpath = "(.//div[@role='cell'])["+i+"]";
 			String data=wd.findElement(By.xpath(fullXpath)).getText();
 			
 			XSSFCell cell = firstRow.createCell(i-2);
 			cell.setCellValue(data);
 	}XSSFRow secondRow = sheet.createRow(2);
  for (int i = 9; i <=13; i++) {
		String fullXpath = "(.//div[@role='cell'])["+i+"]";
		String data=wd.findElement(By.xpath(fullXpath)).getText();
		
		XSSFCell cell = secondRow.createCell(i-9);
		cell.setCellValue(data);
}XSSFRow thirdRow = sheet.createRow(3);
for (int i = 16; i <=20; i++) {
	                      
	String fullXpath = "(.//div[@role='cell'])["+i+"]";
	String data=wd.findElement(By.xpath(fullXpath)).getText();
	
	XSSFCell cell = thirdRow.createCell(i-16);
	cell.setCellValue(data);
}
         
         
         FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
	  }
}
