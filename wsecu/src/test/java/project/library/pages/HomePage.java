package project.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "digital-banking-username")
    private WebElement usernameInputBox;

    @FindBy(css = "input[class='button']")
    private WebElement singInButton;

    public WebElement getUsernameInputBox() {
        return usernameInputBox;
    }

    public WebElement getSingInButton() {
        return singInButton;
    }
}
