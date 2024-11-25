package TestNGListners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TC1 {

	@Test
	public void login()
	{
		System.out.println("in login");
	}
	
	@Test
	public void createEmp()
	{
		System.out.println("in createEmp");
		assertEquals("Ram", "Sita");
	
	}
	
}
