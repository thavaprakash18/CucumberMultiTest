package com.thava.testCasesEmployeeList;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thava.base.Base;
import com.thava.employeePages.EmployeeDetailPage;
import com.thava.employeePages.EmployeeListPage;
import com.thava.employeePages.LoginPage;
import com.thava.employeePages.RecruitmentCanditateDetails;
import com.thava.employeePages.RecruitmentVacancyViewPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefination extends Base{
	public static WebDriver wd;
	
	@Given ("open browser as {string}")
	public void openBrowser(String browser){
		 wd=openBrowser(wd, browser);

	}
    @When ("load loginpage url as {string}")
	public void loadLoginPageUrl(String url) {
		loadUrl(wd, url);
		
	}
    @When ("enter username as {string}")
	 public void enterUsername(String username){
		 LoginPage.enterUsername(wd, username);
	 }
    @And ("enter password as {string}")
	 public void enterPassword(String password){
		 LoginPage.enterPassword(wd, password);
	 }
     @And ("click login")
	 public void clickLoginButton(){
		 LoginPage.clickLoginButton(wd);
	 }
     @When("load employee list page url as {string}")
     public void load_employee_list_page_url_as(String url) {
       loadUrl(wd, url);
     }
     @When("click add button")
     public void click_add_button() {
        EmployeeListPage.clickAddButton(wd);
     }
     @When("enter firstname as {string}")
     public void enter_firstname_as(String firstName) {
        EmployeeListPage.enterFirstname(wd, firstName);
     }
     @When("enter middlename as {string}")
     public void enter_middlename_as(String middleName) {
    	 EmployeeListPage.enterMiddleName(wd, middleName);
     }
     @When("enter lastname as {string}")
     public void enter_lastname_as(String lastName) {
         EmployeeListPage.enterLastName(wd, lastName);
     }
     @When("click on save button")
     public void click_on_save_button() throws InterruptedException {
        EmployeeListPage.clickSaveButton(wd);
     }
     @When("load employee detail page url as {string}")
     public void load_employee_detail_page_url_as(String url) {
        loadUrl(wd, url);
     }
     @When("enter the firstname as {string}")
     public void enter_the_firstname_as(String firstName) {
        EmployeeDetailPage.enterFirstname(wd, firstName);
     }
     @When("click search button")
     public void click_search_button() throws InterruptedException {
         EmployeeDetailPage.clickSearchButton(wd);
     }
     @When("takescreenshot the search result")
     public void takescreenshot_the_search_result() throws IOException {
         EmployeeDetailPage.takeScreenShotSearchResult(wd);
     }
     @When("print the results in console")
     public void print_the_results_in_console() {
         EmployeeDetailPage.getDetailsAndPrint(wd);
     }
     @When("load recruitment candidate datail page url as {string}")
     public void load_recruitment_candidate_datail_page_url_as(String url) {
         loadUrl(wd, url);
     }
     @When("get the first three datails from the table and write in excel")
     public void get_the_first_three_datails_from_the_table_and_write_in_excel() throws IOException {
       RecruitmentCanditateDetails.getDetailsAndWriteInExcel(wd);
     }
     @When("load recruitment vacancy view page url as {string}")
     public void load_recruitment_vacancy_view_page_url_as(String url) {
         loadUrl(wd, url);
     }
     @When("click all checkboxs")
     public void click_all_checkboxs() throws InterruptedException {
         RecruitmentVacancyViewPage.clickAllCheckBoxes(wd);
     }
     @When("takescreenshot after selecting all checkboxs")
     public void takescreenshot_after_selecting_all_checkboxs() throws IOException {
    	 RecruitmentVacancyViewPage.takeScreenShotVacancyDetails(wd);
     }

}
