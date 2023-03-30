package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import ExtentManager.ExtentManager;
import Resources.baseClass;

public class ListenerClass extends ExtentManager implements ITestListener {

	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getName());// Result getName

	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS);
		test.log(Status.PASS, "Test case passed is" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "Test CASE Failed is " + result.getName()); // To add name in extent report

			test.log(Status.FAIL, "Test CASE Failed is " + result.getThrowable()); // To throw excpetion

			String screenshotPath = "";

			try {

				screenshotPath = baseClass.getScreenshot(baseClass.driver, result.getName());
				test.addScreenCaptureFromPath(screenshotPath);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "test case skipped is" + result.getName());
		}

	}
}
