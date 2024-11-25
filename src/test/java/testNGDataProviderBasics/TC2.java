package testNGDataProviderBasics;

import java.util.Hashtable;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC2 {
	
	@Test(dataProvider = "getData",dataProviderClass = TestDataProvider.class)
//	public void createUser(String user,String pwd)
	public void testB(Hashtable<String, String> data)
	{
//		System.out.println("in Test A,user ="+user +",pwd="+pwd);		
//		Reporter.log("in Test A,user="+user +",pwd="+pwd);
		System.out.println("Executing data="+data);
		System.out.println("data="+data.get("firstname"));
	}

}
