package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.base;

public class CreateUserTestTC02 extends base
{

//	public static void main(String[] args) throws InterruptedException 
	@Test
	public void CreateUserTestTc02()
	{
		
		String TcName = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println("TcName="+TcName);
		log.info("***** Executing TC:"+ TcName +"************");
//		// 1. open chrome browser //set property
//		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//		  
//		WebDriver driver= new ChromeDriver();
	
//		driver.get("http://localhost/login.do");
		
		WebDriver driver= openBrowser();
		
		LoginPage loginPageObj= new LoginPage(driver);
		loginPageObj.enter_UserName("admin");
		loginPageObj.enter_Password("manager");
		loginPageObj.click_LoginBtn();
		loginPageObj.verify_LoginSuccess();
		
		// 2.Home page
		HomePage homePage=new HomePage(driver);
		homePage.navigateToMenu("Tasks");			
		
		System.out.println("ends");	
		log.info("***** TC:"+ TcName +" Ends here");
	}

}
