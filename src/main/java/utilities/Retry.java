package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int cntr = 0;
    int tmp = 4;

    public boolean retry(ITestResult iTestResult) {

        if(cntr<tmp)
        {
            cntr++;
            return true;
        }
        return false;

    }

}
