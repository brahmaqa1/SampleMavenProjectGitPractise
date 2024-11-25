package TestNGPractise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeSuiteAnnotation1 
{

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("  @BeforeSuite gets -executed only once");
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
	
	// can we ahve 2before suite
	@BeforeSuite
	public void BeforeSuite2()
	{
		System.out.println("  @BeforeSuite-2 gets -executed only once");
	}
	
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	  @BeforeSuite gets -executed only once
//	in Test A
//	in Test B
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
