package TestNGPractise;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting2 {

	@Parameters("Browser")
	@Test
	public void testA(String mybrowser)
	{
		WebDriver driver = null;
		// test parallel running or not 
		System.out.println("browser="+mybrowser +" executed at :"+new Date());	
		if(mybrowser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();  
			driver = new ChromeDriver();
		}
		else  if(mybrowser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
			if(mybrowser.equalsIgnoreCase("ie"))
			{
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			else
			{
				System.out.println("invalid browser");
			}
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("ram");

	}
}
