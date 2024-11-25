package TestNGPractise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodAnnotation1 
{

	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("  BeforeMethod() gets -executed every time");
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
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println(" @AfterMethod  method gets -executed every time ");
	}

	
	// Can we have 1 
	@BeforeMethod
	public void BeforeMethod2()
	{
		System.out.println("  BeforeMethod-2() gets -executed every time");
	}
	
	//note:  it executes all BeforeMethod s once
//	  BeforeMethod() gets -executed every time
//	  BeforeMethod-2() gets -executed every time
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	  BeforeMethod() gets -executed every time
//	in Test A
//	 @AfterMethod  method gets -executed every time 
	
//	  BeforeMethod() gets -executed every time
//	in Test B
//	 @AfterMethod  method gets -executed every time 
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


//
//
//	===============================================
//	Default suite
//	Total tests run: 2, Failures: 0, Skips: 0
//	==============================================
	
}
