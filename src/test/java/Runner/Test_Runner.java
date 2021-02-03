package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Login"}, 
glue = {"StepDefinition"},
tags = "@Login", 
monochrome = true,//to make console output in better format
dryRun = false,//to check all methods have been implemented properly
strict = true//to check if we missed any steps
		)


public class Test_Runner {

}
