package DownloadFileBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificateError {

	public static void main(String[] args) {


		//		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//
		//
		//		WebDriver driver = new ChromeDriver();
		//		driver.get("https://expired.badssl.com/");
		//		String getTitle=driver.getTitle();
		//		System.out.println("getTitle="+getTitle);
		//getTitle=Privacy error
		//Your connection is not private
		//		Attackers might be trying to steal your information from expired.badssl.com (for example, passwords, messages, or credit cards)

		//******************************
//		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//
//		
//		// Create the object of DesiredCapabilities class using chrome
//		DesiredCapabilities capability=DesiredCapabilities.chrome();
//		 
//		// Set ACCEPT_SSL_CERTS variable to true
//		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		 
//		
//		WebDriver driver=new ChromeDriver(capability);
//		  driver.get("https://expired.badssl.com/"); //Care":???? not handled.. getting SSL erro getTitle=Privacy error
//					  String getTitle=driver.getTitle();
//					  System.out.println("getTitle="+getTitle);
		
		//*******************************************************

		//Create instance of ChromeOptions Class 
		//		ChromeOptions chromeOptions= new ChromeOptions(); 
		//		chromeOptions.setAcceptInsecureCerts(true);
		//		  
		//		  //Creating instance of Chrome driver by passing reference of ChromeOptio object 
		//		  WebDriver driver = new ChromeDriver(chromeOptions);		  
		//		    
		//		  driver.get("https://expired.badssl.com/"); 
		//		  String getTitle=driver.getTitle();
		//		  System.out.println("getTitle="+getTitle);

		//getTitle=expired.badssl.com  
		// we dont get any erro 
		//		  Your connection is not private
		//			Attackers might be trying to steal your information from expired.badssl.com (for example, passwords, messages, or credit cards)

		//******************************************

		// firefox browser
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver = new FirefoxDriver();
		//		driver.get("https://expired.badssl.com/");
		//		String getTitle=driver.getTitle();
		//		System.out.println("getTitle="+getTitle);
		//getTitle=expired.badssl.com  //   Note:  no error ; handled in firefox by default

		//*****************
		//		 old version" 
		//	    FirefoxProfile fp = new FirefoxProfile();
		//			fp.setAcceptUntrustedCertificates(true);
		//			fp.setAssumeUntrustedCertificateIssuer(false);
		//			
		//			pass into webdriver
		//		   WebDriver driver = new FirefoxDriver(fp);

		// new version 
//		WebDriverManager.firefoxdriver().setup();
//		//Creating an object of the FirefoxOptions Class
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//
//		//Using the setAcceptInsecureCerts() method to pass parameter as False
//		firefoxOptions.setAcceptInsecureCerts(false);
//
//		WebDriver driver = new FirefoxDriver(firefoxOptions);
//
//		driver.get("https://expired.badssl.com/"); // error .WebDriverException:
////		Warning: Potential Security Risk Ahead
//		String getTitle=driver.getTitle();
//		System.out.println("getTitle="+getTitle);
		
		
		//*****************
//		// Create the object of DesiredCapabilities class using chrome
//		DesiredCapabilities capability=DesiredCapabilities.firefox();
//		 
//		// Set ACCEPT_SSL_CERTS variable to true
//		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
////		 
//		WebDriverManager.firefoxdriver().setup();
//		
//		WebDriver driver = new FirefoxDriver(capability);
//		driver.get("https://expired.badssl.com/");  // handled 
//	String getTitle=driver.getTitle();// getTitle=expired.badssl.com
//	System.out.println("getTitle="+getTitle);
		
		//***********************
//		WebDriverManager.firefoxdriver().setup();
//		//Creating an object of the FirefoxOptions Class
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//
//		//Using the setAcceptInsecureCerts() method to pass parameter as False
//		firefoxOptions.setAcceptInsecureCerts(true);
//
//		WebDriver driver = new FirefoxDriver(firefoxOptions);
//
//		driver.get("https://expired.badssl.com/"); 
////		Warning: Potential Security Risk Ahead
//		String getTitle=driver.getTitle();
//		System.out.println("getTitle="+getTitle);
//		getTitle=expired.badssl.com

		//*************************************
		//  IE 
		// certificate err
		// IE
		
//		WebDriverManager.iedriver().setup();
//		WebDriver driver2 = new InternetExplorerDriver();
//		driver2.get("https://expired.badssl.com/"); 
////		"main" org.openqa.selenium.SessionNotCreatedException: Unexpected error launching Internet Explorer. IELaunchURL() returned HRESULT 800700C1 ('%1 is not a valid Win32 application.') for URL 'http://localhost:3888/'
////		Build info: version
//		
//		String getTitle=driver2.getTitle();
//		System.out.println("getTitle="+getTitle);
		
		//  *********************
		// Create the object of DesiredCapabilities class using internetExplorer
//		DesiredCapabilities capability=DesiredCapabilities.internetExplorer();
//		 
////		// Set ACCEPT_SSL_CERTS variable to true
//		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//////		 
//		WebDriverManager.iedriver().setup();
////		
//		WebDriver driver = new InternetExplorerDriver(capability);
//		driver.get("https://expired.badssl.com/");  // ???   org.openqa.selenium.SessionNotCreatedException: Un
//	String getTitle=driver.getTitle();// 
//	System.out.println("getTitle="+getTitle);
		
		//****************
//		WebDriverManager.iedriver().setup();
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("https://expired.badssl.com/"); 
//		
//		String getTitle=driver.getTitle();
//		System.out.println("getTitle="+getTitle);
		
		//driver.navigate().to("javascript:document.getElementById('overridelink').click()");


	}

}
