package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="steps"
		,stepNotifications=true
		,monochrome=true
		,plugin={"pretty", "summary", "json:target/cucumber.json"}
		,tags="@smoke"
		)
public class TestRunner {

}
