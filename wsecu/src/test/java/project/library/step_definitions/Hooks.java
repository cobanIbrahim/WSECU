package project.library.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.library.utilities.Driver;

public class Hooks {
    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot using selenium
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // attach to report
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
