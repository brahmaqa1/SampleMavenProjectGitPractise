package TestNGPractise;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

@Listeners(TestNGPractise.ListnersTest.class)
public class TestingListners3WithOutListnersAnnotation
{	
	@Test
	public void testA()
	{
		System.out.println("--> Executing testA");		
	}
	
	@Test
	public void testB()
	{
		System.out.println("--> Executing testB");
		Assert.assertEquals("Ram", "Sita");
		System.out.println("ends testB");
	}

//	@Test(enabled = false) // not coming in results 
	@Test
	public void testC()
	{
		
		System.out.println("-->   testC");
		
	}
	
//	onStart
//	onTestStart
//	--> Executing testA
//	onTestSuccess
	
//	onTestStart
//	--> Executing testB
//	onTestFailure    --   failed 
//	onFinish
	
//	PASSED: testA
//	FAILED: testB
//	java.lang.AssertionError: expected [Sita] but found [Ram]

}
