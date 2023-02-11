package com.makeMyTripTestCases;

import org.openqa.selenium.WebDriver;

import com.makeMyTrip.Base.MakeMyTripBase;
import com.makeMyTrip.Pages.MakeMyTripDetailPage;
import com.makeMyTrip.Pages.MakeMyTripHomepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;


public class StepDefinationMakeMyTrip extends MakeMyTripBase {

	public  WebDriver wd;
    @Given ("openbrowser as {string}")
	public void openBrowser(String browser){
		wd=openBrowser(wd,browser);
	}
    @When ("loadurl as {string}")
    public void enterUrl(String url){
		loadUrl(wd, url);
	}
    @When ("click roundtrip")
    public void clickRoundTrip(){
		MakeMyTripHomepage.clickRoundTrip(wd);
	}
    @When ("enter and select from city as {string}")
    public void enterFromCity(String fromCity) throws InterruptedException{
    	MakeMyTripHomepage.enterFromCity(wd, fromCity);
	}
    @When ("enter and select to city as {string}")
    public void enterToCity(String toCity) throws InterruptedException{
    	MakeMyTripHomepage.enterToCity(wd, toCity);
	}
    @When ("select departure date as {string}")
    public void selectDepartureDate(String departureDate){
    	MakeMyTripHomepage.selectDepartureDate(wd, departureDate);
	}
    @And ("select return date as {string}")
    public void selectReturnDate(String returnDate){
    	MakeMyTripHomepage.selectReturnDate(wd, returnDate);
	}
    @When ("click the search button")
    public void clickSearchButton(){
		MakeMyTripHomepage.clickSearchButton(wd);
	}
    @When ("close the popup module")
    public void closePopupModule(){
		MakeMyTripDetailPage.closePopupModule(wd);
	}
    @And ("select the lowest price return flight")
    public void selectLowestPriceOfFlight() throws InterruptedException{
		MakeMyTripDetailPage.selectLowestPriceOfFlight(wd);
	}
    @When ("click the booknow button")
    public void clickBooknowButton() throws InterruptedException{
		MakeMyTripDetailPage.clickBooknowButton(wd);
	}
    @And ("click the conform button")
    public void clickConformButton(){
		MakeMyTripDetailPage.clickConformButton(wd);
	}
//    When click roundtrip
//    When enter and select from city as "chennai"
//    When enter and select to city as "delhi"
//    When select departure date as "Fri Jan 20 2023"
//    And select return date as "Fri Feb 03 2023"
//    When click the search button
//    When close the popup module
//    And select the lowest price return flight
//    When click the booknow button
//    And click the conform button
   
}
