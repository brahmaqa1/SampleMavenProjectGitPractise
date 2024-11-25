package testNGDataProviderBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviderBasics1 
{

	@Test(dataProvider = "getData",dataProviderClass = TestDataProvider.class)
	public void login(String user,String pwd)
	{
		System.out.println("in Test A,user ="+user +",pwd="+pwd);
		
		Reporter.log("in Test A,user="+user +",pwd="+pwd);	
		
	}

}
