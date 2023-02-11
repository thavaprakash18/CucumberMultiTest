package com.makeMyTrip.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripDetailPage {
	 public static void closePopupModule(WebDriver wd){
		 WebDriverWait waits = new WebDriverWait(wd, Duration.ofMinutes(2));
	  		waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//span[@class='bgProperties icon20 overlayCrossIcon'])")));
		 WebElement popupModuleClose =	wd.findElement(By.xpath("(.//span[@class='bgProperties icon20 overlayCrossIcon'])"));
		 JavascriptExecutor js = (JavascriptExecutor)wd; 	
		 js.executeScript("arguments[0].click()", popupModuleClose);
 	}
	 public static void selectLowestPriceOfFlight(WebDriver wd) throws InterruptedException{
		 WebDriverWait wait = new WebDriverWait(wd, Duration.ofMinutes(1));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//p[text()='Flights from '])")));
		   	WebElement scrollDown	=wd.findElement(By.xpath("(.//p[text()='Flights from '])"));
	 	JavascriptExecutor js = (JavascriptExecutor)wd; 	
		   		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		   	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//div[@class='listingCard '])")));
		   	 
		   	List<WebElement> departPriceList =	wd.findElements(By.xpath("(.//div[@class='listingCardWrap'])[1]//div[@class='listingCard ']"));
			ArrayList departFlightPrices = new ArrayList();
		      for (int i = 0; i < departPriceList.size(); i++) {
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//div[@class='makeFlex column relative splitfare '])")));
		 String flightPrice = departPriceList.get(i).findElement(By.xpath("(.//div[@class='makeFlex column relative splitfare '])")).getText();
		 departFlightPrices.add(flightPrice);
	      }Collections.sort(departFlightPrices);
			String lowestprice =(String) departFlightPrices.get(0);
			
				String midXpath_depart= lowestprice.substring(2,7);
		                                                         // (.//p[text()='₹ 6,700'])[3]/following::span[1]
			WebElement flight_depart =wd.findElement(By.xpath("((.//p[text()='₹ "+midXpath_depart+"'])[3]/following::span[1]"));
			js.executeScript("arguments[0].click()", flight_depart);

		//	WebElement flight_depart =wd.findElement(By.xpath("((.//p[text()='₹ "+midXpath_depart+"'])[5]/following::span[1])"));
		//	js.executeScript("arguments[0].click()", flight_depart);
	
				List<WebElement> returnPriceList =	wd.findElements(By.xpath("(.//div[@class='listingCardWrap'])[2]//div[@class='listingCard ']"));
				ArrayList returnFlightPrices = new ArrayList();
			      for (int i = 0; i < returnPriceList.size(); i++) {
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(.//div[@class='makeFlex column relative splitfare '])")));
			 String flightPrice = returnPriceList.get(i).findElement(By.xpath("(.//div[@class='makeFlex column relative splitfare '])")).getText();
			 returnFlightPrices.add(flightPrice);
		      }
			   Collections.sort(returnFlightPrices);
			String lowestprice_return =(String) returnFlightPrices.get(0);
			//System.out.println(lowestprice);
				String midXpath_return= lowestprice.substring(2,7);
				//System.out.println(midXpath);
				//String startingXpath= "((.//p[text()='₹ "+midXpath+"'])[5]/following::button[1])"))";
		//	WebElement viewAll_return =wd.findElement(By.xpath("((.//p[text()='₹ "+midXpath_return+"'])[5]/following::button[1])"));
		//	js.executeScript("arguments[0].click()", viewAll_return);
			//Thread.sleep(5000);      // (.//p[text()='₹ 5,500'])[3]/following::span[1]
			WebElement flight_return =wd.findElement(By.xpath("((.//p[text()='₹ "+midXpath_return+"'])[3]/following::span[1])"));
			js.executeScript("arguments[0].click()", flight_return);
		//	Thread.sleep(5000);
 	}
	 public static void clickBooknowButton(WebDriver wd) throws InterruptedException{
		 WebElement bookNow =wd.findElement(By.xpath("(.//button[text()='Book Now'])"));
		 JavascriptExecutor js = (JavascriptExecutor)wd; 	
			js.executeScript("arguments[0].click()", bookNow);
		//	Thread.sleep(5000);
 	}
	 public static void clickConformButton(WebDriver wd){
		 WebElement conform =wd.findElement(By.xpath("(.//button[text()='Continue'])"));
		 JavascriptExecutor js = (JavascriptExecutor)wd; 	
			js.executeScript("arguments[0].click()", conform);
 	}

}
