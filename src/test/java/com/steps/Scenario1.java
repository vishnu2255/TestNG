package com.steps;

import com.pages.CalculatorPage;
import com.pages.HomePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import utilities.WebDriver.DriverFactory;

import java.util.HashMap;
import java.util.Map;


public class Scenario1{

    Logger logger = Logger.getLogger(Scenario1.class.getName());

    private HomePage homePage;
    private CalculatorPage calculatorPage;
    private WebDriver driver ;
    private DriverFactory df;

    @DataProvider(name="vals")
    public static Object[] cREDS(){

//        Map<String,String> map = new HashMap<String, String>();
//
//        map.put("y1","1200");
//        map.put("y2","1300");

        return new Object[] {"1200" , "1300"};

    }

//    @Parameters({"browser"})
    Scenario1() {

        // String te = bro;
//        super(bro);
    }

    @Test
    void onCalPage(){
        homePage = new HomePage(driver);
        calculatorPage = new CalculatorPage(driver);


        homePage.navigateToCalPage();
        logger.info("on calculator page");
        Reporter.log("Navigated to Calc Page!!");

    }

//    @Parameters({"val"})
    @Test(dependsOnMethods = {"onCalPage"} , dataProvider = "vals")
    void test(String val){
        calculatorPage.enterInputAmount(val);
    }


    @Parameters({"browser"})
    @BeforeTest
    void launch(String brow){

        df = new DriverFactory();
        df.initializeDriver(brow);

        this.driver = df.getDriver();

        driver.get("https://ia.ca/individuals");
        Assert.assertTrue(driver.getCurrentUrl().contains("individuals"),"not on home page");
        logger.info("Driver Launched");

    }

    @AfterTest
    void dest(){

        df.destroyDriver();
        logger.info("driver killed");
    }

}
