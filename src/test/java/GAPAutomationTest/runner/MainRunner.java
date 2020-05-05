package GAPAutomationTest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/GAPAutomationTest/featureFiles"},
		glue = {"GAPAutomationTest.steps"},
		monochrome = true,
		tags = {"@Login, @CreateUser, @EmployeesList"},
		plugin = {}
		)

public class MainRunner {
	
	

}
