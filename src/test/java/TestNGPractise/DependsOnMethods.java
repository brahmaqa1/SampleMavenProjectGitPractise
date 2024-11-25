package TestNGPractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{

	@Test
	public void login()
	{
	   System.out.println("login test");
	   // if failed
	   assertEquals("Ram", "Swathi");
	}
	
//	@Test(dependsOnMethods = "login")
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void createOrder()
	{
		System.out.println("createOrder test gets executed even if depedent method failed");
	}
	

//	login test
//	createOrder test gets executed even if depedent method failed
//	PASSED: createOrder
//	FAILED: login
//	java.lang.AssertionError: expected [Swathi] but found [Ram]
//		
//
//	===============================================
//	    Default test
//	    Tests run: 2, Failures: 1, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 2, Failures: 1, Skips: 0
//	===============================================


	
}
