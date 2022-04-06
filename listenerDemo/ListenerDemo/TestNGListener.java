package ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("testcases started and testcase details are : " +result.getName());
	  }

	public void onTestSuccess(ITestResult result) {
		System.out.println("testcases success and testcase details are : " +result.getName());
	  }


	public void onTestFailure(ITestResult result) {
	    System.out.println("testcases failed and testcase details are : " +result.getName());
	  }

	public void onTestSkipped(ITestResult result) {
		System.out.println("testcases skiped and testcase details are : " +result.getName());
	  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
	  }

	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	public void onStart(ITestContext context) {
	    
	  }

	public void onFinish(ITestContext context) {
	    
	  }
}
