package TestNGFailRetryBasics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TC1 
{
	@Test(retryAnalyzer = MyRetry.class)
	public static void testA()
	{
		System.out.println("Executing testA-");
		assertEquals("Ram", "Sita");
		System.out.println("ends testA-");
	}

}
