package project.library.pages;

import org.openqa.selenium.support.PageFactory;
import project.library.utilities.Driver;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
        //Windows should be maximize in order to interact with all Elements
        Driver.getDriver().manage().window().maximize();

    }
}
