package utilities.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {

    private static String browser = getBrowser("") ;

    private static String getBrowser(String bro)
    {
        String browser = null;

        if(bro == null)
        {
            browser = "firefox";
        }
        return browser;
    }

     static WebDriver getDriver(String browser)
    {
        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            return getChromeDriver();
        } else if ("safari".equals(browser.toLowerCase())) {
            return null;
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            return getFirefoxDriver();
        }
       return null;
    }

    private static WebDriver getFirefoxDriver()
    {
//        File resourcesDirectory = new File("src/test/resources");
//        resourcesDirectory.getAbsolutePath();
//        String path = resourcesDirectory.getAbsolutePath() + "\\drivers\\geckodriver.exe";
        //setting relative path
//        System.setProperty("webdriver.gecko.driver",path);

        System.setProperty("webdriver.gecko.driver","/Users/vishnupatlolla/IdeaProjects/geckodriver");
        WebDriver driver = new FirefoxDriver();

        return driver;
    }



    private static WebDriver getChromeDriver()
    {
//        File resourcesDirectory = new File("src/test/resources");
//        resourcesDirectory.getAbsolutePath();
//        String path = resourcesDirectory.getAbsolutePath() + "\\drivers\\geckodriver.exe";
        //setting relative path
//        System.setProperty("webdriver.gecko.driver",path);

        System.setProperty("webdriver.chrome.driver","/Users/vishnupatlolla/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();

        return driver;
    }


}
