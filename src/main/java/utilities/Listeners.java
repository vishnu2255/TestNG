package utilities;

import org.testng.IInvokedMethod;

import org.testng.IInvokedMethodListener;

import org.testng.ISuite;

import org.testng.ISuiteListener;

import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestNGMethod;

import org.testng.ITestResult;

import org.testng.Reporter;

public class Listeners implements ITestListener, ISuiteListener,IInvokedMethodListener{


    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    public void onStart(ISuite iSuite) {

        System.out.println("suite started "+iSuite.getName());

    }

    public void onFinish(ISuite iSuite) {
        System.out.println("suite finished "+iSuite.getName());
    }

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("test started "+iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test success"+iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("test failed "+iTestResult.getName()+" , " +iTestResult.getStatus());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("test skipped "+iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("Test started "+iTestContext.getName());
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test finished "+iTestContext.getName());
    }
}
