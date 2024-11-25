package TestNGPractise;

import org.testng.annotations.Test;

public class GroupsBasics2 
{	
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("Test1- Smoke -Groups");		
	}

	@Test(groups = "Regression")
	public void test2()
	{
		System.out.println("Test2- Regression -Groups");		
	}
	
	@Test(groups = "Smoke")
	public void test3()
	{
		System.out.println("Test3- Smoke -Groups");		
	}
	
}
