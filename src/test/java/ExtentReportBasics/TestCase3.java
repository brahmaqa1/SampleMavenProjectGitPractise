package ExtentReportBasics;

import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase3 
{
	ExtentReports exReports;
	ExtentTest  exTest;
	
	@BeforeTest
	public void startExtentReport()
	{
		System.out.println("date and ime="+ new Date());
		 exReports= new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults3.html");
		  exTest= exReports.startTest("createEmployeeTC02");
	}
	
	
	@Test
	public void testA()
	{
//		ExtentReports exReports= new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults2.html");
//		ExtentTest  exTest= exReports.startTest("createEmployeeTC02");
		
		exTest.log(LogStatus.PASS, "TC-2 Step-1: enter user name");
		exTest.log(LogStatus.PASS, "TC-2 Step-2: Enter mail id");
		exTest.log(LogStatus.PASS, "TC-2 Step-3: Click Save");
		
//		exReports.endTest(exTest);
//		exReports.flush();		
	}
	
	@Test
	public void testB()
	{		
		exTest.log(LogStatus.PASS, "Tc03 Step-1: enter user name");
		exTest.log(LogStatus.PASS, "Tc03 :Step-2: Enter mail id");
	}
	@AfterTest
	public void endExtentReport()
	{
		exReports.endTest(exTest);
		exReports.flush();	
	}
	
	
}
