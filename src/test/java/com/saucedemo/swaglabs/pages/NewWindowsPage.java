package com.saucedemo.swaglabs.pages;

import com.saucedemo.swaglabs.configuretion.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowsPage extends BasePage {
    public NewWindowsPage(WebDriver driver) {
        super(driver);
    }

    //header
    @FindBy(css = "h3")
    public WebElement nHeader1;
    public WebElement getNHeader1() {
        return nHeader1;
    }
}
