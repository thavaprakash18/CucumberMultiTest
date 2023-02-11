package com.flipkart.testCases;

import org.openqa.selenium.WebDriver;

import com.flipkart.pages.CartPage;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.ListPage;
import com.flipkart.pages.ProductDetailPage;
import com.thava.base.Base;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base {
	public  String productName;
	public  String productPrice;
	
	public  WebDriver wd;
    @Given ("open browser as {string}")
	public void openBrowser(String browser){
		wd=openBrowser(wd,browser);
	}
    @When ("enter url as {string}")
    public void enterUrl(String url){
		loadUrl(wd, url);
	}
    @When ("close the login module")
    public void loginModuleClose(){
		HomePage.loginModuleClose(wd);
	}
    @When ("search product as {string}")
    public void searchProduct(String productCategory){
		HomePage.searchProduct(wd, productCategory);
	}
    @Then ("validate list page as {string}")
    public void validateListPage(String productListType) throws Exception{
		ListPage.validateListPage(wd, productListType);
	}
    @When ("get the first product name")
    public void getFirstProductName(){
	String productName	=ListPage.getFirstProductName(wd);
	this.productName=productName;
	}
    @And ("get the first product price")
    public void getFirstProductPrice(){
	String productPrice	=ListPage.getFirstProductPrice(wd);
	this.productPrice=productPrice;
	}
    @And ("click the first product")
    public void clickFirstProduct(){
		ListPage.clickFirstProduct(wd);
	}
    @When ("get the detail page product name match with list page product name")
    public void getDetailproductName() throws Exception{
	     ProductDetailPage.getDetailproductName(wd, productName);
	}
    @And ("get the detail page product price and match with list page product price")
    public void getDetailProductPrice(){
	     ProductDetailPage.getDetailProductPrice(wd, productPrice);
	}
    @And ("click add to cart button")
    public void clickAddToCartButton(){
	     ProductDetailPage.clickAddToCartButton(wd);
	}
    @When ("get the product name of the cart product and match with the detail page product name")
    public void getCartProductName() throws Exception{
	    CartPage.getCartProductName(wd, productName);
	}
    @And ("get the product price of the cart product and match with the detail page product price")
    public void getCartProductPrice(){
	     CartPage.getCartProductPrice(wd, productPrice);
	}
    @And ("click cart remove button")
    public void clickCartRemoveButton(){
	     CartPage.clickCartRemoveButton(wd);
	}
    @When ("click remove in Remove Item module")
    public void clickRemoveConformation(){
		CartPage.clickRemoveConformation(wd);
	}
    @Then ("validate the product is removed as {string}")
    public void validateProductRemoved(String cartMessage){
		CartPage.validateProductRemoved(wd, cartMessage);
	}
 
    
}
