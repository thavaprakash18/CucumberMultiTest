package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@employee",monochrome=true,features="src/test/resources/employeeListFeature",glue="testCasesEmployeeList",plugin={"pretty","html:reports/employee.html"})
public class RunnerEmployeeList {

}

























