package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features =  {"features/GoogleSearchWithExamples.feature"},
		glue = {"stepdefinition"},
	//	dryRun = false
		dryRun = true
		
		)



public class TestRunner {


}
