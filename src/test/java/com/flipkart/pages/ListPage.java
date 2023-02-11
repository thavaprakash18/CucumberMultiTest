package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class ListPage {
	public static void validateListPage(WebDriver wd,String productListType ) throws Exception {
	String text	=wd.findElement(By.xpath("(.//div[@class='TB_InB'])[2]")).getText();
		//Assert.assertEquals(productListType, text);
	if (text.contains(productListType)) {
		
	}else {
		System.out.println("product name not matched");
		throw new Exception();
	}
	}
	public static String getFirstProductName(WebDriver wd ) {
		String productName	=wd.findElement(By.xpath("(.//div[@class='_4rR01T'])[1]")).getText();
		//String ProductPrice	=wd.findElement(By.xpath("(.//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();	
		return productName;
	}
	public static String getFirstProductPrice(WebDriver wd ) {
	//	String ProductName	=wd.findElement(By.xpath("(.//div[@class='_4rR01T'])[1]")).getText();
		String productPrice	=wd.findElement(By.xpath("(.//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		return productPrice;	
	}
	public static void clickFirstProduct(WebDriver wd ) {
		wd.findElement(By.xpath("(.//div[@class='_4rR01T'])[1]")).click();
			
	}
}
