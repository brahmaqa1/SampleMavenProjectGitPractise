package POMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPages.HomePage;
import AllPages.LoginPage;

public class LoginTestTC01POM 
{

	public static void main(String[] args) throws InterruptedException {
		// 1. open chrome browser //set property
		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//		  
		WebDriver driver= new ChromeDriver();
	
		driver.get("http://localhost/login.do");
		
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
