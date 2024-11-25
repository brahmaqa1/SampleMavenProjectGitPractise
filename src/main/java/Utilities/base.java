package Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	public static Logger log =Logger.getLogger("devpinoyLogger");


	public WebDriver openBrowser()
	{
		// 1. open chrome browser //set property
		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//		  
		WebDriver driver= new ChromeDriver();	
		driver.get("http://localhost/login.do");
		log.info("driver="+driver);
		return driver;		
	}


	public String getCurrentMethodName()
	{
		String nameofCurrMethod = new Throwable()
				.getStackTrace()[0]
						.getMethodName();

		System.out.println("Name of current method: "
				+ nameofCurrMethod);
		return nameofCurrMethod;//TcName=getCurrentMethodName

	}

}
