package GridBasics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	@Parameters("browser")
	@Test
	public  void testLogin(String browser) throws MalformedURLException
	{
		System.out.println("Browser="+browser + " at time="+new Date());

//		DesiredCapabilities cap= null;
//
//		if(browser.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			cap =  DesiredCapabilities.firefox();			
//			cap.setBrowserName("firefox");
//			cap.setPlatform(Platform.ANY);
//		}
//		else if(browser.equals("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			cap =  DesiredCapabilities.chrome();			
//			cap.setBrowserName("chrome");
//			cap.setPlatform(Platform.ANY);
//		}
//		else if(browser.equals("iexplore"))
//		{
//			WebDriverManager.iedriver().setup();
//			cap =  DesiredCapabilities.internetExplorer();
//			cap.setBrowserName("iexplore");
//			cap.setPlatform(Platform.ANY);
//		}
//		RemoteWebDriver driver=  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub") ,cap);
//		String myurl ="http://gmail.com";
//		System.out.println("Open url="+myurl + " at time="+new Date());
//		driver.get(myurl);
//		driver.findElement(By.id("identifierId")).sendKeys("brahma.qa2@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();

//		driver.quit();
		System.out.println("ends here at time="+new Date());
	}

}
