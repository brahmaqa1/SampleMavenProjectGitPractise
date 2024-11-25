package  TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.base;


public class LoginTestTC01  extends base
{
	public WebDriver driver;
	
//	public static void main(String[] args)  {
	@Test
	public void loginTestTC01() throws InterruptedException
	{		
		// 
		log.info("***** Executing TC:"+"LoginTestTC01 ************");
		// optimise get current Class name
//		String TcName= getCurrentMethodName();
		String TcName = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println("TcName="+TcName);
		log.info("***** Executing TC:"+ TcName +"************");
		
		System.out.println("Testing *************");
		
//		// 1. open chrome browser //set property
//		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//		  
//		WebDriver driver= new ChromeDriver();
//	
//		driver.get("http://localhost/login.do");
		driver= openBrowser();		
		
		LoginPage loginPageObj= new LoginPage(driver);
		loginPageObj.enter_UserName("admin");
		loginPageObj.enter_Password("manager");
		loginPageObj.click_LoginBtn();
		loginPageObj.verify_LoginSuccess();
		
		// 2.Home page
		HomePage homePage=new HomePage(driver);
		homePage.navigateToMenu("Users");
		
		Thread.sleep(5000);
		homePage.navigateToMenu("Time-Track");
		Thread.sleep(5000);
		
		homePage.navigateToMenu("Tasks");
		Thread.sleep(5000);
		
		
		homePage.navigateToMenu("Reports");
		Thread.sleep(5000);
		
		// 
		driver.close();
		
		System.out.println("ends");
		

	}

}
