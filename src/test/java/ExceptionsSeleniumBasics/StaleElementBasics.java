package ExceptionsSeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementBasics {

	public static void main(String[] args) {
		// 1. open chrome browser //set property
		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumSoftwares\\Alldrivers\\chromedriver_win32V96\\chromedriver.exe");		//		  
		WebDriver driver= new ChromeDriver();	
		driver.get("file:///D:/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		
		// get all links names
		
		List<WebElement>  allLinks=	driver.findElements(By.tagName("a"));

		for(int i=0;i<=allLinks.size()-1 ;i++)
		{
			allLinks.get(i).click();
			
			driver.navigate().back();
			
		}

		System.out.println("Ends ");
	}
}
