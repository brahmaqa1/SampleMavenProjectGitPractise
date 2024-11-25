package AllPagesPOM2;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskPage 
{
	public WebDriver driver;

	//1.declaration of ele
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement ProjectsAndCustomer_Tab; 
	
	////a[text()='Open Tasks']
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement create_Customer_Btn;
	
	@FindBy(name="name")
	private WebElement CustomerName_Textbox;
	
	
	@FindBy(name="description")
	private WebElement CustomerDescription_Textbox;
	
	
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomer_Btn_In_CreateNewCustomerPage;
	
	
	@FindBy(css=".successmsg")
	private WebElement customerSuccessmsg;

	
	//2. Initilase ele
	
	public TaskPage(WebDriver driver)
	{
		//menuName =driver.findElement(By.xpath("//div[text()='Users']"));
		PageFactory.initElements(driver, this);//if u dont write, nullptr exception
		this.driver =driver;
	}
	

	//3.  utilise
	
	public void open_ProjectsAndCustomersPage()
	{
		System.out.println("open_ProjectsAndCustomersPage");
		ProjectsAndCustomer_Tab.click();
	
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(create_Customer_Btn));
		
	}
	
	
	public void create_Customer(String customerName, String custDescr)
	{
		open_ProjectsAndCustomersPage();
		
		System.out.println("Click create_Customer_Btn");
		System.out.println("driver="+driver);// log//  html
		create_Customer_Btn.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(CustomerName_Textbox));
		
		Random r= new Random();
		
		 customerName=customerName+ r.nextInt(100);
		System.out.println("Enter Customer name="+customerName);
		CustomerName_Textbox.sendKeys(customerName);
			
		System.out.println("Enter Customer description="+custDescr);
		CustomerDescription_Textbox.sendKeys(custDescr);
		
		
		System.out.println("Click create_Customer_Btn");
		CreateCustomer_Btn_In_CreateNewCustomerPage.click();
		
		
		wait.until(ExpectedConditions.visibilityOf(customerSuccessmsg));
		
		//Customer "raji" has been successfully created.
		String expected_CustSuccessmsg= "Customer \""+customerName+"\" has been successfully created.";
		
		String actual_CustSuccessmsg=customerSuccessmsg.getText();
		System.out.println("Get success msg="+actual_CustSuccessmsg);
		
		if(expected_CustSuccessmsg.equals(actual_CustSuccessmsg))
		{
			System.out.println("expected_CustSuccessmsg="+expected_CustSuccessmsg);
		}
		else
		{
			System.out.println("expected_CustSuccessmsg="+expected_CustSuccessmsg+",actual_CustSuccessmsg="+actual_CustSuccessmsg);
		}
		
		
	}	


}
