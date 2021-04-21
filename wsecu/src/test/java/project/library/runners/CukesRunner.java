package project.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "project/library/step_definitions",
        dryRun = false,
        tags = "@Test"
)
public class CukesRunner {
}