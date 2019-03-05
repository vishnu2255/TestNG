package utilities.WebDriver;

import com.pages.CalculatorPage;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;


public class DriverFactory {

    static Logger log = Logger.getLogger(DriverFactory.class.getName());
    protected static WebDriver driver;

    public DriverFactory()
    {
        //initializeDriver(browser);
    }

    public void initializeDriver(String browser)
    {
        if(driver == null)
        {
            driver  =  SelectDriver.getDriver(browser);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
          //  driver.manage().window().maximize();

        }
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public void destroyDriver()
    {
        if(driver != null)
        {
            driver.quit();
            driver = null;
        }
    }
}
