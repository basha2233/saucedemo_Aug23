package pageFactory;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import TestData.ReadExcel;
import base.Testbase;
import util.webutils;

public class HomePage extends Testbase {
	
	@FindBy(xpath="//div[contains(text(),\"Swag Labs\")]")
	public WebElement Signin;
	
	@FindBy(xpath="//input[contains(@id,\"user-name\")]")
	public WebElement username;
	
	@FindBy(xpath="//input[contains(@id,\"password\")]")
	public WebElement password;
	
	@FindBy(xpath="//input[contains(@id,\"login-button\")]")
	public WebElement loginbtn;
	
public HomePage(WebDriver driver)
{
	try {
	Testbase.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void getTitle()
{
	try {
		 driver.navigate().to(webutils.url);
		 String signin= Signin.getText();
		
		 //Extent
		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 webutils.report = new ExtentReports(System.getProperty("user.dir")+"\\Extent\\ExtentReportResults"+dateName+".html");
		 System.out.println(signin);
		 	 
		 if(signin.equals("Swag Labs1"))
		 {
			//Extent report call
			 
			 webutils.test= webutils.report.startTest("Title");
			 webutils.test.log(LogStatus.PASS, "Navigated to the specified URL");
			 System.out.println("Signin verified");
		 }
		 else
		 {
			
			//Extent test call
			 webutils.test = webutils.report.startTest("Title");
			 webutils.test.log(LogStatus.FAIL, "Navigated to the specified URL");
			 System.out.println("Signin verified");
			 //assertequals statement for failing the test 
			 assertEquals("Swag Labs1", signin,"Title not matching");
			//Extent screenshot code added in listner
		 }
		 
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
}

public void login()
{
	try {
		// wait statement from utils
		webutils.Explicity_Wait_visibility(username);
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbtn.click();
		
		//Extent
		webutils.test = webutils.report.startTest("Login");
		webutils.test.log(LogStatus.PASS, "Login Pass");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

public void readExcel() throws IOException
{
	 try {
		//ReadExceldata
		 ReadExcel re=new ReadExcel();
		 re.readExcel();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
