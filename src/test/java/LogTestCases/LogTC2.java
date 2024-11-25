package LogTestCases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LogTC2 extends base
{

//	public static Logger log =Logger.getLogger("devpinoyLogger");
//	public static void main(String[] args) 
	@Test
	public void Test2()
	{

		log.debug("--> TC -2 New: Step:1");
		log.debug("TC -2 Step:2");
		log.debug("TC -2 Step:3");

	}

}
