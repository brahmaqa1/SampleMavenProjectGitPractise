package POMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPagesPOM2.*;
import AllPages.LoginPage;
import AllPagesPOM2.TaskPage;

public class CreateCustomerTC02 {

	public static void main(String[] args) throws InterruptedException {
		// 1. open chrome browser //set property
		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");		//		  
		WebDriver driver= new ChromeDriver();
	
		driver.get("http://localhost/login.do");
		
		LoginPage loginPageObj= new LoginPage(driver);
//		loginPageObj.enter_UserName("admin");
//		loginPageObj.enter_Password("manager");
//		loginPageObj.click_LoginBtn();
//		loginPageObj.verify_LoginSuccess();
		loginPageObj.login("admin", "manager");
		
		// 2.Home page
		HomePage homePage=new HomePage(driver);
	
		homePage.navigateToMenu("Tasks");
//		Thread.sleep(5000);
		
		TaskPage taskPage= new TaskPage(driver);
		taskPage.create_Customer("Sam", "Sarayu Descr");
		
	
		
		homePage.logout();
		
		System.out.println("ends");
		

	}

}
