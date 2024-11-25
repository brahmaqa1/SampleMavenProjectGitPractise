package TestNGPractise;

import java.util.Date;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CrossBrowserTesting {

		
	 @Test
	 public void testA()
	 {
		 // test parallel running or not 
		 System.out.println("stmt1 executed at :"+new Date());		 
//		 stmt1 executed at :Fri Dec 24 00:03:23 IST 2021
//		 stmt1 executed at :Fri Dec 24 00:03:23 IST 2021
//		 stmt1 executed at :Fri Dec 24 00:03:23 IST 2021
		 
	 }
	 
}
