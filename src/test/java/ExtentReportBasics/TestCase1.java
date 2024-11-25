package ExtentReportBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase1 
{
	
	
	@Test
	public void loginTC01()
	{
		ExtentReports exReports= new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		ExtentTest  exTest= exReports.startTest("My Login TC01");
		
		exTest.log(LogStatus.PASS, "Step-1: enter user name");
		exTest.log(LogStatus.PASS, "Step-2: enter password");
		exTest.log(LogStatus.PASS, "Step-3: Click Login button");
		
		exReports.endTest(exTest);
//		exReports.flush();// if we dont write,  it does not create html results or not
		exReports.flush();
		exTest.log(LogStatus.PASS, "After Flush : it does not displat this stmts in extebt reports");
	}
	
}
