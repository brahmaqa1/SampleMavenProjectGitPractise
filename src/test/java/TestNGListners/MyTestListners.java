package TestNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListners implements ITestListener
{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("onStart");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult res) {
		System.out.println("***** onTestFailure **********");
		System.out.println("onTestFailure getName=" +res.getName());
//		System.out.println("onTestFailure getTestName=" +res.getTestName());
//		System.out.println("onTestFailure getTestName=" +res.getTestName().toString());
//		System.out.println("onTestFailure getStatus=" +res.getStatus());
		
//		System.out.println("getMethodName ="+ res.getMethod().getMethodName());
		System.out.println("onTestFailure,getMessage="+res.getThrowable().getMessage());
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult res) {
		System.out.println("***************");
		System.out.println("onTestStart getName=" +res.getName());
//		System.out.println("onTestStart getTestName=" +res.getTestName());
//		System.out.println("onTestStart getStatus=" +res.getStatus());
		
//		System.out.println("getMethodName ="+ res.getMethod().getMethodName());
//		System.out.println("getThrowable="+res.getThrowable().getMessage());
//		onTestStart getName=createEmp
//				onTestStart getTestName=null
//				onTestStart getStatus=16
//				getMethodName =createEmp
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
