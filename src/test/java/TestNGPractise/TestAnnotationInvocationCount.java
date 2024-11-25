package TestNGPractise;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationInvocationCount 
{
		
	@Test(invocationCount = 3)
//	@Test(invocationCount = 0) // does not execute
	public void testA()
	{
		System.out.println("in Test A");
		Reporter.log("in TestA log");
	}
	//Care:   3 Test 
	
//	in Test A
//	in Test A
//	in Test A
//	PASSED: testA
//	PASSED: testA
//	PASSED: testA
//
//	===============================================
//	    Default test
//	    Tests run: 3, Failures: 0, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 3, Failures: 0, Skips: 0
//	===============================================


	
}
