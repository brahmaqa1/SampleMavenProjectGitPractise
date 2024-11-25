package LogTestCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LogTC1 extends base
{
	//public static Logger log =Logger.getLogger("devpinoyLogger");
	
	
	
//	public static void main(String[] args) 
	@Test
	public void Test1()
	{
		
		log.debug("TC-1 New:Step:1");
		log.debug("TC-1 Step:2");
		log.debug("TC-1 Step:3");
		System.out.println("ends");

	}

}
