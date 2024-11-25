package ExtentReportBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ListnersTest implements ITestListener
{
	public ExtentReports exReports;
	public static  ExtentTest exTest;
	static Date d = new Date();
	public static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	
	
	public void onFinish(ITestContext arg0) {
		 System.out.println("onFinish ");
		 
		 exReports.endTest(exTest);
			exReports.flush();	
	}

	public void onStart(ITestContext arg0) {
		System.out.println("onStart");
		String ExtentReportsFilePath= System.getProperty("user.dir")+fileName;
		exReports= new ExtentReports(ExtentReportsFilePath);// executes only one 
		System.out.println("Extente reports are genarted-"+ExtentReportsFilePath);
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("onTestFailure");		
	}

	public void onTestSkipped(ITestResult arg0) {		 
		System.out.println("onTestSkipped");
	}

	public void onTestStart(ITestResult res) {		 
//		System.out.println("onTestStart=getTestName"+res.getTestName());
		System.out.println("onTestStart getName="+res.getName());
//		System.out.println("onTestStart getClass="+res.getClass());
		
//		  exTest= exReports.startTest("createEmployeeTC02");
		  exTest= exReports.startTest(res.getName());
		  System.out.println("exTest="+exTest);

	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
	}

	

}
