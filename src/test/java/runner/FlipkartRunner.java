package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@validAddToCartAndRemove",monochrome=true,features="src/test/resources/feature",glue="testCases",plugin={"pretty","html:report/flipkart.html"})
public class FlipkartRunner {

}

