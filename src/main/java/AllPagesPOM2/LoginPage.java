package AllPagesPOM2;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.base;



public class LoginPage extends base
{
	
	public WebDriver driver;
//	public static Logger log =LogManager.getLogger(base.class.getName());
	
	//1.declaration of ele
	@FindBy(name="username")
	private WebElement username_TextboxEle; 	
	
	@FindBy(name="pwd")
	private WebElement pwdEle;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	
	//2. Initilase ele
	
	public LoginPage(WebDriver driver)
	{
//		username_TextboxEle =driver.findElement(By.name("username"));
//		pwdEle = driver.findElement(By.name("pwd"));
//		loginBtn = driver.findElement(By.id("loginButton"));// ok
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	//3.utilise
	public void enter_UserName(String userName)
	{
		log.info("Enter user="+userName);
		System.out.println("Enter user="+userName);
//		log.debug("Enter user="+userName);
		username_TextboxEle.sendKeys(userName);
	}
	
	public void enter_Password(String pwd)
	{
		log.info("Enter pwd="+pwd);
		System.out.println("Enter pwd="+pwd);
//		log.debug("Enter pwd="+pwd);
		pwdEle.sendKeys(pwd);
	}
	
	
	public void click_LoginBtn()
	{
		log.info("click login btn");
		System.out.println("click login btn");
		loginBtn.click();		
	}
	
	public void login(String user,String pwd)
	{
		enter_UserName(user);
		enter_Password(pwd);
		click_LoginBtn();
		verify_LoginSuccess();
	}
	
	public boolean verify_LoginSuccess()
	{
		//actiTIME -  Enter Time-Track
		WebDriverWait wait= new WebDriverWait(driver, 20);
		//boolean res=wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		boolean res=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		//             e "actiTIME -  Enter Time-Track". 
		//Current title: "actiTIME - Enter Time-Track" (tried for 10 second(s) with 500 milliseconds interval)
	
		
		if(res)
		{
			log.info("Home page appears ");
			System.out.println("Home page appears ");
		}
		else
		{
			System.out.println("Home page does not appear ");
		}
		
		return res;		
	}

}
