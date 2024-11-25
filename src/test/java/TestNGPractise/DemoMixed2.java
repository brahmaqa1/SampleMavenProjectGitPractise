package TestNGPractise;

import org.testng.annotations.Test;

public class DemoMixed2 extends AllAnnotationsMixed2
{
	
	// can we inherit annotation method
	@Test
	public void TestA()
	{
		System.out.println("in DemoMixed-TestA");
	}

	@Test
	public void TestB()
	{
		System.out.println("in DemoMixed-TestB");
	}
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	 BeforeSuite gets -executed only once
//	 BeforeTest() gets -executed only once
//	 BeforeClass gets -executed only once
	
//	 BeforeMethod() gets -executed every timee
//	in DemoMixed-TestA	
//	 AfterMethod()() gets -executed every timee
	
//	 BeforeMethod() gets -executed every timee
//	in DemoMixed-TestB
//	 AfterMethod()() gets -executed every timee
	
//	 AfterClass gets -executed only once
//	 After test  method gets -executed only once
//	PASSED: TestA
//	PASSED: TestB
//
//	===============================================
//	    Default test
//	    Tests run: 2, Failures: 0, Skips: 0
//	===============================================
//
//										 AfterSuite gets -executed only once ****
//
//	===============================================
//	Default suite
//	Total tests run: 2, Failures: 0, Skips: 0
//	===============================================



}
