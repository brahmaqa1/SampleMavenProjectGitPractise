package TestNGPractise;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidePractise 
{
	@DataProvider
	public Object [] [] getData()
	{
		Object  [] []dataArr = new Object [3][2];
		// 3- how many times we have to execute test
		// 2 represents how many parameters we have to pass ot sets of data
		dataArr [0][0] = "Ram";
		dataArr [0][1] = "mercury";
		
		dataArr [1][0] = "Swathi";
		dataArr [1][1] = "mercury";
		
		dataArr [2][0] = "John";
		dataArr [2][1] = "mercury";
		
		return dataArr;
	}
	
	
	@Test(dataProvider = "getData")
	public void login(String user,String pwd)
	{
		System.out.println("in Test A,user ="+user +",pwd="+pwd);
		
		Reporter.log("in Test A,user="+user +",pwd="+pwd);		
	}
	
//	[RemoteTestNG] detected TestNG version 6.14.3
//	in Test A,user =Ram,pwd=mercury
//	in Test A,user =Swathi,pwd=mercury
//	in Test A,user =John,pwd=mercury
//	PASSED: login("Ram", "mercury")
//	PASSED: login("Swathi", "mercury")
//	PASSED: login("John", "mercury")
//
//	===============================================
//	    Default test
//	    Tests run: 3, Failures: 0, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 3, Failures: 0, Skips: 0
//	===============================================


	
	
}
