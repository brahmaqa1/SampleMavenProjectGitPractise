package TestNGPractise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionBasics 
{	
	@Test
	public void testA()
	{
		System.out.println("Executing  testA");		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals("Ram", "Ram");
		
		sa.assertEquals("Ram", "Sita");
		
//		sa.assertAll();
		sa.assertAll();// if we dont write, it will not fail in results
		// it wont execute next stmts after sa.assertAll();
		System.out.println("even if it fails  it gets executed");
		System.out.println("ends");
		sa.assertAll();// last stmmt 
	}

	@Test
	public void testB()
	{
		System.out.println("Executing testB");	
	}
	
	
	
}
