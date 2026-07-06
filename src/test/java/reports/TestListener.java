package reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener{
	 ExtentReports extent = ExtentManager.getReport();
	    ExtentTest test;

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("onTestStart : " + result.getName());

	        test = extent.createTest(result.getName());

	        System.out.println("Test object created : " + (test != null));
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        System.out.println("onTestFailure : " + result.getName());
	        System.out.println("test object : " + test);

	        if (test != null) {
	            test.fail(result.getThrowable());
	        }
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
}
