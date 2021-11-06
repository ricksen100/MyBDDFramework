package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  
@CucumberOptions(
		features= {"@target/failedrerun.txt"},
		glue= {"StepDefinitions","Hooks"},
		plugin= {"pretty",
				"rerun:target/failedrerun.txt"
				}
		
		)

public class FailedTest {

}
