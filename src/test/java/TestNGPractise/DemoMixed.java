package TestNGPractise;

import org.testng.annotations.Test;

public class DemoMixed extends AllAnnotationsMixed2
{
	
	// can we inherit annotation method
	@Test
	public void TestA()
	{
		System.out.println("in DemoMixed");
	}

	
//	 BeforeSuite gets -executed only once
//	 BeforeTest() gets -executed only once
//	 BeforeClass gets -executed only once
//	 BeforeMethod() gets -executed every timee
//	in DemoMixed	
//	 AfterMethod()() gets -executed every timee
	
//	 AfterClass gets -executed only once
//	 After test  method gets -executed only once
//	PASSED: TestA
//
//	===============================================
//	    Default test
//	    Tests run: 1, Failures: 0, Skips: 0
//	===============================================
//
//	 AfterSuite gets -executed only once   -----------***
//
//	===============================================
//	Default suite
//	Total tests run: 1, Failures: 0, Skips: 0
//	===============================================




}
