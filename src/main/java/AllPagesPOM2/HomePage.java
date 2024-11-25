package AllPagesPOM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.base;

public class HomePage extends base
{
	public WebDriver driver;

	//1.declaration of ele
	
	private WebElement menuName; 
	
	@FindBy(id="logoutLink")
	private WebElement logout_Link; 
		
	
	//2. Initilase ele
	
	public HomePage(WebDriver driver)
	{
		//menuName =driver.findElement(By.xpath("//div[text()='Users']"));
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	

	//3.  utilise 
	
	public void navigateToMenu(String menuName)
	{
		log.info("Click on menu="+menuName);
		String menuNamexpath= "//div[text()='" +menuName + "']";
		System.out.println("Click on menu="+menuName);
		 driver.findElement(By.xpath(menuNamexpath)).click();
		 
		 if(menuName.equals("Users"))
		 {
			 menuName="User";
		 }
		 wait_For_Title(menuName);
	}
	
	public void wait_For_Title(String title)
	{
		log.info("wait_For_Title contains given="+title);
		System.out.println("wait_For_Title contains given="+title);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		//boolean res=wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		boolean res=wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void logout()
	{
		log.info("logout from actitime");
		System.out.println("logout from actitime");
		logout_Link.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		// wait user name field  ??????
//		LoginPage log= new LoginPage(driver);		
		
//		boolean res = wait.until(ExpectedConditions.visibilityOf())
//		
//		if(res)
//		{
//			System.out.println("Logout from actitime is done successfully");
//		}
//		else
//		{
//			System.out.println("Logout from actitime is done successfully");
//		}
		
		if(driver==null)
		{
			System.out.println("Close browser");
//			driver.close();
		}
				
	}

}
