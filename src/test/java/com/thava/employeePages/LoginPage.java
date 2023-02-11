package com.thava.employeePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   public static void enterUsername(WebDriver wd,String username){
	  wd.findElement(By.name("username")).sendKeys(username);
 }
   public static void enterPassword(WebDriver wd,String password){
   wd.findElement(By.name("password")).sendKeys(password); 
	  
   }
   public static void clickLoginButton(WebDriver wd){
	  wd.findElement(By.xpath("(.//button[@type='submit'])")).click();
   }
}
