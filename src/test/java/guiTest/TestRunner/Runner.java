package guiTest.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "guiTest.StepDefinition",
        plugin = "pretty",
        tags = "@TestGui",
        monochrome = true
        )

public class Runner {


}
