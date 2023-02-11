package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CartPage {
	
	public static void getCartProductName(WebDriver wd,String productName ) throws Exception {
		Thread.sleep(3000);
		String title=wd.getTitle();
		System.out.println(title);
		String cartPageProductName	=wd.findElement(By.xpath("(.//div[@class='_2-uG6-'])")).getText();
		wd.manage().window().maximize();
	//	Assert.assertEquals(productName, cartPageProductName);
      if (cartPageProductName.contains(productName)) {
			
		}else {
			System.out.println("product name not matched");
			throw new Exception();
		}
		
	}
	public static void getCartProductPrice(WebDriver wd,String productPrice ) {
	
		String cartPageProductPrice	=wd.findElement(By.xpath("(.//span[@class='_2-ut7f _1WpvJ7'])")).getText();
		Assert.assertEquals(productPrice, cartPageProductPrice);
		
	}
	public static void clickCartRemoveButton(WebDriver wd) {
		WebElement remove=wd.findElement(By.xpath("(.//div[@class='_3dsJAO'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].scrollIntoView(true)", remove);
		
		wd.findElement(By.xpath("(.//div[@class='_3dsJAO'])[2]")).click();
		
	}
    public static void clickRemoveConformation(WebDriver wd) {
    	
     wd.findElement(By.xpath("(.//div[@class='_3dsJAO _24d-qY FhkMJZ'])")).click();
     }
    public static void validateProductRemoved(WebDriver wd,String cartMessage) {
     String message  = wd.findElement(By.xpath("(.//div[@class='_1LCJ1U'])")).getText();
        Assert.assertEquals(cartMessage, message);      
        }
    
    
    
}
