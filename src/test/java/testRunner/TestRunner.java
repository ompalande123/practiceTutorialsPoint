package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/scenarios", glue = "stepDefinitions",

        monochrome=true, plugin= {"pretty", "html:target/cucumber-reports"},
        tags= "@textPage_Validations"


)
public class TestRunner extends AbstractTestNGCucumberTests {

}