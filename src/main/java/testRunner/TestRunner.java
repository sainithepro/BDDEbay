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
	   //name = {"Logo"}    only pickup scenarios which have this name in them
		)
public class TestRunner {
}
