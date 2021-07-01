package SeleniumTestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners 	implements ITestListener {
	

	public void onTestStart(ITestResult result) 
	{
		System.out.println("***************** Test started:" + result.getName());
		
	}
	
	public void onTestSuccess (ITestResult result) 
	{
		System.out.println("***************** Test successfull:" + result.getName());
		
	}
	
	public void onTestFailure (ITestResult result) 
	{
		System.out.println("***************** Test Failed:" + result.getName());
		
	}
	
	public void onTestSkipped (ITestResult result) 
	{
		System.out.println("***************** Test skipped:" + result.getName());
		
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("***************** Test completed:" + context.getName());

	}
	
}
