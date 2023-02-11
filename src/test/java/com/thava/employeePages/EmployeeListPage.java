package com.thava.employeePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeListPage {
	public static void clickAddButton(WebDriver wd){
		wd.findElement(By.xpath("(.//button[@type='button'])[3]")).click();
	   }
	 public static void enterFirstname(WebDriver wd,String firstName){
		 wd.findElement(By.name("firstName")).sendKeys(firstName);
	  }
	 public static void enterMiddleName(WebDriver wd,String middleName){
		 wd.findElement(By.name("middleName")).sendKeys(middleName);
	  }
	 public static void enterLastName(WebDriver wd,String lastName){
		 wd.findElement(By.name("lastName")).sendKeys(lastName);
	  }
	 public static void clickSaveButton(WebDriver wd) throws InterruptedException{
		 wd.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		 Thread.sleep(10000); 
	 }
	  
	
	   
}
