package com.thava.employeePages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class EmployeeDetailPage {
	
	 public static void enterFirstname(WebDriver wd,String firstName){
		 wd.findElement(By.xpath("(.//input[@placeholder='Type for hints...'])[1]")).sendKeys(firstName);
	  }
	 public static void clickSearchButton(WebDriver wd) throws InterruptedException{
		 wd.findElement(By.xpath("(.//button[@type='submit'])")).click();
		 Thread.sleep(5555);
	 }
	 public static void takeScreenShotSearchResult(WebDriver wd) throws IOException{
		 File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:/Batch251/G9_ExampleCucumber/screenshot/employee.jpeg"));
	  }
	 public static void getDetailsAndPrint(WebDriver wd){
		 String id	=wd.findElement(By.xpath("(.//div[@role='columnheader'])[2]")).getText();
			String first_middleName	=wd.findElement(By.xpath("(.//div[@role='columnheader'])[3]")).getText();
			String last_Name	=wd.findElement(By.xpath("(.//div[@role='columnheader'])[4]")).getText();
			String JobTitle 	=wd.findElement(By.xpath("(.//div[@role='columnheader'])[5]")).getText();
			String EmploymentStatus=wd.findElement(By.xpath("(.//div[@role='columnheader'])[6]")).getText();
			String SubUnit 	=wd.findElement(By.xpath("(.//div[@role='columnheader'])[7]")).getText();
			String Supervisor	=wd.findElement(By.xpath("(.//div[@role='columnheader'])[8]")).getText();
			
			String id_value =wd.findElement(By.xpath("(.//div[@role='cell'])[2]")).getText();
			String firstname_value =wd.findElement(By.xpath("(.//div[@role='cell'])[3]")).getText();
			String lastname_value =wd.findElement(By.xpath("(.//div[@role='cell'])[4]")).getText();
			String jobtitle_value =wd.findElement(By.xpath("(.//div[@role='cell'])[5]")).getText();
			String EmploymentStatus_value =wd.findElement(By.xpath("(.//div[@role='cell'])[6]")).getText();
			String SubUnit_value =wd.findElement(By.xpath("(.//div[@role='cell'])[7]")).getText();
			String Supervisor_value =wd.findElement(By.xpath("(.//div[@role='cell'])[8]")).getText();
				   System.out.println(id+"="+id_value);
				   System.out.println(first_middleName+"="+firstname_value);
				   System.out.println(last_Name+"="+lastname_value);
				   System.out.println(JobTitle+"="+jobtitle_value);
				   System.out.println(EmploymentStatus+"="+EmploymentStatus_value);
				   System.out.println(SubUnit+"="+SubUnit_value);
				   System.out.println(Supervisor+"="+Supervisor_value);
	  }
	
	   
	
									   
		
	 
}
