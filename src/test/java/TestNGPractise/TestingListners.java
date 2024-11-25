package TestNGPractise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGPractise.ListnersTest.class)
public class TestingListners
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
	}
//	onStart  - only once executed 
//	onTestStart
//	--> Executing testA
//	onTestSuccess
	
//	onTestStart
//	--> Executing testB
//	onTestSuccess
//	onFinish  --only once executed 
	
//	PASSED: testA
//	PASSED: testB

}
