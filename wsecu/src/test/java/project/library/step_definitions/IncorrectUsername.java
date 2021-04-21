package project.library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.library.pages.HomePage;
import project.library.utilities.ConfigurationReader;
import project.library.utilities.Driver;

public class IncorrectUsername {
    HomePage homePage = new HomePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }
    @When("User enters an invalid username")
    public void user_enters_an_invalid_username() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getUsernameInputBox())).sendKeys("Dummy User");
    }

    @When("User clicks to the Sign In button")
    public void user_clicks_to_the_sign_in_button() {
        homePage.getSingInButton().click();
    }

    @Then("Verify that the user is redirected to online banking page")
    public void user_is_redirected_to_online_banking_page() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Online Banking"));
    }
}
