package TestNGPractise;

import org.testng.annotations.Test;

public class TestMethodRunBasics1 
{	
	@Test
	public void MobileLogin()
	{
		System.out.println("Executing  test methods starts 'Mobile'- Mobile Login");		
	}

	@Test
	public void GmailLogin()
	{
		System.out.println("Executing GmailLogin");	
	}
	
	@Test
	public void MobileCreateOrder()
	{
		System.out.println("Executing test methods starts 'Mobile' -Mobile CreateOrder");	
	}
	
}
