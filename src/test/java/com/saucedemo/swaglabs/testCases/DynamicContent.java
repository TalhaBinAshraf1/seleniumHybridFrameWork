package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.DynamicContentPages;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicContent extends BaseClass {
    @Test
    public void dynamicContent(){
        TheInternet ti =new TheInternet(driver);
        DynamicContentPages dcp =new DynamicContentPages(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        //TC-2 Header Validation
        if(ti.getDynamicContent().isDisplayed()){
            String dynamicContentText = ti.getDynamicContent().getText();
            Assert.assertTrue(true,dynamicContentText);
            System.out.println("Header is valid");

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getDynamicContent().click();

        //TC-3 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DYNAMIC_CONTENT_LINK);
        System.out.println("Link is validate");
        sleepTest(2000);

        dcp.getClick().click();
        sleepTest(5000);

        //TC-3 Row count
        List<WebElement> row = driver.findElements(By.className("row"));
        int numberOfRows = row.size();
        System.out.println("Total rows : " + numberOfRows);

        String beforeXpath = "/html//div[@id='content']/div/div[@class='row']/div[@id='content']/div[";
        String afterXpath = "]";

        driver.navigate().back();
        sleepTest(1000);
        // //*[@id="content"]/div[1]/div[1]
        ///html//div[@id='content']/div/div[@class='row']/div[@id='content']/div[1]/div[2]
    }
}
