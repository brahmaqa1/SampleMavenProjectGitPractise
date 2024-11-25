package LogTestCases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class base 
{
	public static Logger log =Logger.getLogger("devpinoyLogger");
	
	
	public static void main(String[] args) {
		
		log.debug("TC-1:Step:1");
		log.debug("TC-1 Step:2");
		log.debug("TC-1 Step:3");
		System.out.println("ends");

	}

}
