package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import reports.ExtentManager;

public class TestListener implements ITestListener {

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest test = ExtentManager.getExtentReports()
                .createTest(result.getMethod().getMethodName());

        extentTest.set(test);
    }

    @Override
    public void onTestFailure(ITestResult result) {

        if (extentTest.get() != null) {
            extentTest.get().fail(result.getThrowable());
        }
    }
}
