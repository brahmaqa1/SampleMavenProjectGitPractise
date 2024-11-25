package ExtentReportBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase2 
{
	
	
	@Test
	public void createEmployeeTC02()
	{
		ExtentReports exReports= new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults2.html");
		ExtentTest  exTest= exReports.startTest("createEmployeeTC02");
		
		exTest.log(LogStatus.PASS, "Step-1: enter user name");
		exTest.log(LogStatus.PASS, "Step-2: Enter mail id");
		exTest.log(LogStatus.INFO, "Step-3: Click Save");
		exTest.log(LogStatus.FAIL, "Step-3:Employee not created");
		
		exReports.endTest(exTest);
		exReports.flush();
		
	}
	
}
