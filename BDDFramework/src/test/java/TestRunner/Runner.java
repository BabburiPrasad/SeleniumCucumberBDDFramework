package TestRunner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//import org.testng.annotations.DataProvider;

/*
 *		features options is to locate the .feature files in project folder structure
 *		glue it's similar to features. glues code helps to locate step-definitions
 *		dryRun = true - will check all the steps present on feature file have code block in step-definitions file or not
 *		plugin option used to generate output reports. Using "Pretty" we can generate html, xml and json reports
 * 		monochrome = true, will generates reports, console output in much more readable format
 * 
 * 
 * */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features", 
		glue = { "StepDefinitions" },
		dryRun = true,
		plugin = { "Pretty","http:target/BDDFramework/src/test/resources/Reports" },
		monochrome = true
		)

public class Runner {

}
