package TestNGPractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMultipleMethods2 
{

	@Test
	public void loginTest1()
	{
	   System.out.println("login test-1");
	   // if failed
//	   assertEquals("John", "Swathi");
	}
	

	@Test
	public void loginTest2()
	{
	   System.out.println("login test-1");
	   // if failed
	   assertEquals("Sam", "Abc");
	}
	
//	@Test(dependsOnMethods = "login")
//	@Test(dependsOnMethods = "login",alwaysRun = true)
	@Test(dependsOnMethods = {"loginTest2","loginTest1"},alwaysRun = true)
	public void createOrder()
	{
		System.out.println("createOrder test gets executed even if depedent method failed");
	}
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	login test-1
//	login test-1
//	createOrder test gets executed even if depedent method failed
//	PASSED: loginTest1
//	PASSED: createOrder
//	FAILED: loginTest2
//	java.lang.AssertionError: expected [Abc] but found [Sam]
//		at org.testng.Assert.fail(Assert.java:96)
//	
//	===============================================
//	    Default test
//	    Tests run: 3, Failures: 1, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 3, Failures: 1, Skips: 0
//	===============================================



	
}
