package sivapack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		plugin= {"pretty","json:target/src/test/java/multipledemo/cucumber-reports.json"})

public class demo1 {
	
}
