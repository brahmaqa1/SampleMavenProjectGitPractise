package TestNGPractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNg 
{

	// so far we are executing java class with help of main()
	@Test
	public void testA()
	{
		System.out.println("in Test A");
		Reporter.log("in Test A");
		Reporter.log("in Test A");
	}
	
	@Test
	public void testB()
	{
		System.out.println("in Test B");
		Reporter.log("in Test B");
		Reporter.log("in Test A");
	}
	
	/*
	 * [RemoteTestNG] detected TestNG version 6.14.3 in Test A in Test B PASSED:
	 * testA PASSED: testB
	 * 
	 * =============================================== Default test Tests run: 2,
	 * Failures: 0, Skips: 0 ===============================================
	 * 
	 * 
	 * =============================================== Default suite Total tests
	 * run: 2, Failures: 0, Skips: 0 ==============================================
	 */
	
}
