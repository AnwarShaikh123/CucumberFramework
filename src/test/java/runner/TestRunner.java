package runner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = {"utility", "stepDefinition"},
        plugin = {"pretty", "html:target/cucumber.html.reports","json:cucumber.json"}
)

public class TestRunner {
}

