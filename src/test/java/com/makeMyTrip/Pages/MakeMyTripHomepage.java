package com.makeMyTrip.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripHomepage {
	public static void clickRoundTrip(WebDriver wd){
		//WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//li[text()='Round Trip'])")));
	WebElement roundtrip=wd.findElement(By.xpath("(.//li[text()='Round Trip'])"));
	JavascriptExecutor js = (JavascriptExecutor)wd;
	js.executeScript("arguments[0].click()", roundtrip);
	}
	public static void enterFromCity(WebDriver wd,String fromCity) throws InterruptedException{
		//WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//input[@id='fromCity'])")));
	    WebElement from =wd.findElement(By.xpath("(.//input[@id='fromCity'])"));
	    JavascriptExecutor js = (JavascriptExecutor)wd;
	    js.executeScript("arguments[0].click()", from);
	    from.sendKeys("chennai");
	    Thread.sleep(3000);
	  //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//li[@id='react-autowhatever-1-section-0-item-0'])")));
	    WebElement	chennai    =wd.findElement(By.xpath("(.//li[@id='react-autowhatever-1-section-0-item-0'])"));
           js.executeScript("arguments[0].click()", chennai);
	}
	 public static void enterToCity(WebDriver wd,String toCity) throws InterruptedException{
		 //WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
    	// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//input[@id='toCity'])")));
 		WebElement to =	wd.findElement(By.xpath("(.//input[@id='toCity'])"));
 		JavascriptExecutor js = (JavascriptExecutor)wd;
 		js.executeScript("arguments[0].click()", to);
 		to.sendKeys("delhi");
 		Thread.sleep(3000);
 	 //   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//li[@id='react-autowhatever-1-section-0-item-0'])")));
 	    WebElement	delhi    =wd.findElement(By.xpath("(.//li[@id='react-autowhatever-1-section-0-item-0'])"));
            js.executeScript("arguments[0].click()", delhi);
	}
    
    
     public static void selectDepartureDate(WebDriver wd,String departureDate){
    //	 WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(20));
    //	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//div[@aria-label='"+departureDate+"'])")));
    		WebElement fromDate =	wd.findElement(By.xpath("(.//div[@aria-label='"+departureDate+"'])"));
    		JavascriptExecutor js = (JavascriptExecutor)wd;
    		js.executeScript("arguments[0].click()", fromDate);
    		
	}
     public static void selectReturnDate(WebDriver wd,String returnDate){
    	 WebElement toDate =	wd.findElement(By.xpath("(.//div[@aria-label='"+returnDate+"'])[2]"));
    	 JavascriptExecutor js = (JavascriptExecutor)wd;
    		js.executeScript("arguments[0].click()", toDate);
 	}
     public static void clickSearchButton(WebDriver wd){
    	 WebElement search =	wd.findElement(By.xpath("(.//a[@class='primaryBtn font24 latoBold widgetSearchBtn '])"));
    	 JavascriptExecutor js = (JavascriptExecutor)wd;
    	js.executeScript("arguments[0].click()", search);
 		
 	}
	
}
