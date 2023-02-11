package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static void loginModuleClose(WebDriver wd ) {
	wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	}
	public static void searchProduct(WebDriver wd,String productCategory ) {
		wd.findElement(By.name("q")).sendKeys(productCategory);
		wd.findElement(By.name("q")).submit();
		}
}
