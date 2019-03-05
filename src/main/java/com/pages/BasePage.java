package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtils;

public class BasePage {


    protected WaitUtils waitUtils;
    protected WebDriver driver;


    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
        PageFactory.initElements(driver,this);

    }

}

