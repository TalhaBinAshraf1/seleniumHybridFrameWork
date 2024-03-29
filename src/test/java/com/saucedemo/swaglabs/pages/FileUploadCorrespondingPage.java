package com.saucedemo.swaglabs.pages;

import com.saucedemo.swaglabs.configuretion.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadCorrespondingPage extends BasePage {


    public FileUploadCorrespondingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='File Uploaded!']")
    public WebElement  fileUploadCorrespondingPageHeader;
    public WebElement getFileUploadCorrespondingPageHeader() {
        return fileUploadCorrespondingPageHeader;
    }


}
