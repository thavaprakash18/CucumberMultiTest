@employee
Feature: validate the employee list add and get the details

Background:
Given open browser as "chrome"
When load loginpage url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When enter username as "Admin"
And enter password as "admin123"
And click login

@employeeListAddDelete
Scenario: validate the employee list add and get details
When load employee list page url as "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"
And click add button
When enter firstname as "thalapathy"
And enter middlename as "joseph"
And enter lastname as "vijay"
When click on save button
When load employee detail page url as "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"
And enter the firstname as "thalapathy"
And click search button
When takescreenshot the search result
And print the results in console

@recruitmentViewCandidateDetails
Scenario: validate the recruitment candidates details table  and get data write to excel
When load recruitment candidate datail page url as "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates"
When get the first three datails from the table and write in excel

@recruitmentViewJobVacancy
Scenario: validate the recruitment job vacany checkbox
When load recruitment vacancy view page url as "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewJobVacancy"
And click all checkboxs
And takescreenshot after selecting all checkboxs

 