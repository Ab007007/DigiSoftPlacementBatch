package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features =  {"features/"},
		glue = {"stepdefinition"},
//		tags = "@s1 and not @s3",
//		tags = "@s1 or @s3",
//		tags = "@s1 and @s3",
		tags = "@production1 and @s123",
		dryRun = false,
//		dryRun = true,
		plugin = {"junit:target/junit/Report.xml",
				   "json:target/json/Report.json",
				   "html:target/html/Report.html"}
		
		)



public class TestRunner {


}
