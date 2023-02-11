package com.flipkart.pages;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import junit.framework.Assert;

public class ProductDetailPage {
	
	public static void getDetailproductName(WebDriver wd,String productName ) throws Exception {
		Set<String>sessions=wd.getWindowHandles();
		Iterator<String> it =sessions.iterator();
		String homepage=it.next();
		String childpage =it.next();
		wd.switchTo().window(childpage);
		String detailPageProductName	=wd.findElement(By.xpath("(.//span[@class='B_NuCI'])[1]")).getText();
		
	
		if (detailPageProductName.contains(productName)) {
			
		}else {
			System.out.println("product name not matched");
			throw new Exception();
		}
		
	}
	public static void getDetailProductPrice(WebDriver wd,String productPrice ) {
	
		String detailPageProductPrice	=wd.findElement(By.xpath("(.//div[@class='_30jeq3 _16Jk6d'])")).getText();
		Assert.assertEquals(productPrice, detailPageProductPrice);	
	}
	public static void clickAddToCartButton(WebDriver wd) {
		
		wd.findElement(By.xpath("(.//button[@class='_2KpZ6l _2U9uOA _3v1-ww'])")).click();
		
	}
}