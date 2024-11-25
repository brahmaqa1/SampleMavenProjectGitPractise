package TestNGPractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class AllAnnotationsMixed
	{
		// suite > Test> Classes > beforemthod
		@BeforeSuite
		public void BeforeSuite()
		{
			System.out.println(" BeforeSuite gets -executed only once");
		}
		
		
		@BeforeTest
		public void BeforeTest()
		{
			System.out.println(" BeforeTest() gets -executed only once");
		}
		
		@BeforeClass
		public void BeforeClass()
		{
			System.out.println(" BeforeClass gets -executed only once");
		}
		
		@BeforeMethod
		public void BeforeMethod()
		{
			System.out.println(" BeforeMethod() gets -executed every timee");
		}
		
		@Test
		public void testA()
		{
			System.out.println("in Test A");
		}
		
		@Test
		public void testB()
		{
			System.out.println("in Test B");
		}
		
		@AfterTest
		public void AfterTest()
		{
			System.out.println(" After test  method gets -executed only once");
		}

		@AfterMethod
		public void AfterMethod()
		{
			System.out.println(" AfterMethod()() gets -executed every timee");
		}
		
		@AfterClass
		public void AfterClass()
		{
			System.out.println(" AfterClass gets -executed only once");
		}
		
		@AfterSuite
		public void AfterSuite()
		{
			System.out.println(" AfterSuite gets -executed only once");
			// 
		}
		
//		[RemoteTestNG] detected TestNG version 6.14.3
//		 BeforeSuite gets -executed only once
//		 BeforeTest() gets -executed only once
//		 BeforeClass gets -executed only once
//		 BeforeMethod() gets -executed every time
//		in Test A
//		 AfterMethod()() gets -executed every time
		
//		 BeforeMethod() gets -executed every time
//		in Test B
//		 AfterMethod()() gets -executed every time
//		 AfterClass gets -executed only once
//		 After test  method gets -executed only once
//		PASSED: testA
//		PASSED: testB
//
//		===============================================
//		    Default test
//		    Tests run: 2, Failures: 0, Skips: 0
//		===============================================
//
//		 AfterSuite gets -executed only once
//
//		===============================================
//		Default suite
//		Total tests run: 2, Failures: 0, Skips: 0
//		===============================================
	
		
	}

	
