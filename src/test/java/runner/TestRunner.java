package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//Features tell the cucumber  where all feature files are located
		//glue tells cucumber where all StepDefinitions classes are located
		// With tags we will run one scenario, multiple scenario, or entire features
		//dryRun checks if there are any missing steps in StepDefinition class
		//Monochrome will make console readable
		//strict will mark scenario failed of there are any pending steps.
		//plugin will be used for generating a readable report
	features = "classpath:features",	
	glue = "stepDefinitions", 
	tags = "@test", 
	dryRun =  false,
	monochrome =  true,
	strict = true,
	plugin = {"pretty"},
	publish = true
	
		)

public class TestRunner {

}
