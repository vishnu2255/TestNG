package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    Logger logger = Logger.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//*[@id=\"nav-secondaire\"]/div[1]/ul/li[4]/a/span")
    WebElement loansBtn;

    @FindBy(how = How.XPATH,using = "")
    @CacheLookup
    WebElement dummy;

    //*[@id="nav-secondaire"]/div[1]/ul/li[4]/ul/li[2]/section[1]/ul/li[2]/a
    //*[@id="nav-secondaire"]/div[1]/ul/li[4]/a/span
    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }

    public void navigateToCalPage()
    {
        try {

            waitUtils.getElementAfterMediumWait(loansBtn).click();
//            loansBtn.click();
            driver.findElement(By.linkText("Mortgage payment calculator")).click();

            logger.info("navigated to calc page");
        }catch (NoSuchElementException e)
        {
            System.out.println(e);
        }
    }

}
