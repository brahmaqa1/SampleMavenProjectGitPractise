package TestNGPractise;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

//@Listeners(TestNGPractise.ListnersTest.class)  Remove listenrs Annot
// define listner in testng.xml
public class TestingListners2
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
	


}
