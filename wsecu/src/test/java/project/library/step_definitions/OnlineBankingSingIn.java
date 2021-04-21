package project.library.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.library.pages.OnlineBankingPage;
import project.library.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class OnlineBankingSingIn {
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();


    //this user story is parameterized and multiple passwords can be passed with ease
    @And("User enters an incorrect {string}")
    public void user_enters_an_incorrect(String string) {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        onlineBankingPage.getPasswordInputBox().sendKeys(string);
        onlineBankingPage.getSignInButton().click();
    }

    @Then("Verify that a message box pops up that says “Sorry, incorrect username”")
    public void a_message_box_pops_up_that_says_sorry_incorrect_username() {
        String actualErrorMessage = onlineBankingPage.getErrorBox().getText();
        String expectedErrorMessage = "Sorry, incorrect username.";
        Assert.assertEquals("Error Message does not match the expected message",expectedErrorMessage, actualErrorMessage);
    }


}
