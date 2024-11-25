package JavaBasics;

import java.util.Hashtable;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConvertArraytoHashTable {

	@DataProvider
	public static Object [] [] getData()
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
	//public void login(String user,String pwd)
	public void login(Hashtable<String, String> data)
	{
		System.out.println("in Test A,user ="+data.get("Ram") );
		
//		Reporter.log("in Test A,user="+user +",pwd="+pwd);		
	}

}
