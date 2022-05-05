package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\usrin\\eclipse-workspace\\MarvelCucumberProjectAutomation\\src\\main\\java\\Features\\Login.feature"
		,glue= {"StepDefinitions"}
		)
public class TestRunner {

}
