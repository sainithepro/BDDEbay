package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"Steps"},
		plugin = {"pretty","html:Report1"},
		dryRun = false,
		monochrome = true
		//tags = "@P2"
	   //name = {"Logo"}    
		)
public class TestRunner {
}
