package TestNGPractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAnnotations 
{
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println(" Before test() gets -executed only once");
	}
	
	
	@Test
	public void testA()
	{
		System.out.println("in Test A");
	}
	
	@Test
	public void testB()
	{
		System.out.println("in Test B");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println(" After test  method gets -executed only once");
	}
	// can we have 2 before test
	@BeforeTest
	public void BeforeTest2()
	{
		System.out.println(" Before test-2() gets -executed only once");
	}
	
//	 Before test() gets -executed only once
//	 Before test-2() gets -executed only once
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	 Before test() gets -executed only once
//	in Test A
//	in Test B
//	 After test  method gets -executed only once
//	PASSED: testA
//	PASSED: testB
//
//	===============================================
//	    Default test
//	    Tests run: 2, Failures: 0, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 2, Failures: 0, Skips: 0
//	===============================================

	
	
}
