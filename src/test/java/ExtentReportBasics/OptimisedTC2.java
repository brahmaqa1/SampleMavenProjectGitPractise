package ExtentReportBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisedTC2 extends ListnersTest
{
//	ExtentReports exReports;
//	ExtentTest  exTest;
	
//	@BeforeTest
//	public void startExtentReport()
//	{
//		 exReports= new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults3.html");
//		  exTest= exReports.startTest("createEmployeeTC02");
//	}
	
	
	@Test
	public void createUserTC02()
	{
//		ExtentReports exReports= new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults2.html");
//		ExtentTest  exTest= exReports.startTest("createEmployeeTC02");
		System.out.println("----extentes="+exTest);
		// how to access extentest obj defined in ListnersTest
		// remove local var 
		
		exTest.log(LogStatus.PASS, "Step-1: enter user name");
		exTest.log(LogStatus.PASS, "Step-2: Enter mail id");
		exTest.log(LogStatus.PASS, "Step-3: Click Save");
		
//		exReports.endTest(exTest);
//		exReports.flush();		
	}
	
	
	@AfterTest
	public void endExtentReport()
	{
//		exReports.endTest(exTest);
//		exReports.flush();	
	}
	
	
}
