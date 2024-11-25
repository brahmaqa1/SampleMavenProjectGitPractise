package TestNGPractise;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAnnotation 
{

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("  @@BeforeClass gets -executed only once");
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
	
	// can we ahve 2beforeClass:  yes 
	@BeforeClass
	public void BeforeClass2()
	{
		System.out.println("  @@BeforeClass-2 gets -executed only once");
	}
	
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	  @@BeforeClass gets -executed only once
//	  @@BeforeClass-2 gets -executed only once
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
