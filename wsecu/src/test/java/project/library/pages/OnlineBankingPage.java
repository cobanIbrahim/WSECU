package project.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBankingPage extends BasePage{
    @FindBy(css = "[name='username']")
    private WebElement UsernameInputBox;

    @FindBy(css = "[name='password']")
    private WebElement PasswordInputBox;

    @FindBy(css = "div[class='ng-binding ng-scope']")
    private WebElement ErrorBox;

    @FindBy(css = "button[type='submit']")
    private WebElement SignInButton;

    public WebElement getUsernameInputBox() {
        return UsernameInputBox;
    }

    public WebElement getPasswordInputBox() {
        return PasswordInputBox;
    }

    public WebElement getErrorBox() {
        return ErrorBox;
    }

    public WebElement getSignInButton() {
        return SignInButton;
    }
}
