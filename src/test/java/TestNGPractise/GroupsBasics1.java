package TestNGPractise;

import org.testng.annotations.Test;

public class GroupsBasics1 
{	
	@Test(groups = "Smoke")
	public void testA()
	{
		System.out.println("TestA- Smoke -Groups");		
	}

	@Test(groups = "Regression")
	public void testB()
	{
		System.out.println("TestB- Regression -Groups");		
	}
	
	@Test(groups = "Smoke")
	public void testC()
	{
		System.out.println("TestC- Smoke -Groups");		
	}
	
}
