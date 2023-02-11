package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@validRoundtrip",monochrome=true,features="src/test/resources/makeMyTripFeature",glue="tripTestCases",plugin={"pretty","html:report/trip.html"})
public class RunnerMakeMyTrip {

}





