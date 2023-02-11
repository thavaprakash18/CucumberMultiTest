package com.thava.employeePages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class RecruitmentVacancyViewPage {
	 public static void clickAllCheckBoxes(WebDriver wd) throws InterruptedException{
		 WebElement view =wd.findElement(By.xpath("(.//button[@type='button'])[4]"));
		   JavascriptExecutor js = (JavascriptExecutor)wd;
      js.executeScript("arguments[0].scrollIntoView(true)", view);
      int i = 0;
      while (true) {
    	  try{
    		  String fullXpath="(.//input[@value='"+i+"'])";
    		  i++;
    	      WebElement checkbox=wd.findElement(By.xpath(fullXpath));
    	     if (checkbox.isSelected()) {
    			System.out.println("checkbox is already selected");
    		} else {
    			js.executeScript("arguments[0].click()", checkbox);
    		}
     }catch (Exception e) {
		System.out.println("end of the element");
		break;
	}
      
      
      }
     
	 }
	 public static void takeScreenShotVacancyDetails(WebDriver wd) throws IOException{
		 File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:/Batch251/G9_ExampleCucumber/screenshot/selectedcheckboxes.jpeg"));
	  }
}
