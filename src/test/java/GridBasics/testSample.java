package GridBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testSample {

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("starts");
		
//		
//		URL url = new URL("http://localhost:4444/wd/hub");
//		
////		WebDriverManager.chromedriver().setup();
//		
////		DesiredCapabilities dc= DesiredCapabilities.chrome();
////		dc.setBrowserName("chrome");
////		dc.setPlatform(Platform.ANY);
//		
//		RemoteWebDriver driver = new RemoteWebDriver(url, dc);		
////		selenium.WebDriverException: Error forwarding the new session Empty pool of VM for setup Capabilities {browserName: chrome, version: }
//		
//		
////		driver.get("http://google.com");
////		driver.findElement(By.name("q")).sendKeys("Ram");
//		
//		driver.get("http://gmail.com");
//		driver.findElement(By.id("identifierId")).sendKeys("brahma.qa2@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		
		
		System.out.println("Ends");
	}

}
