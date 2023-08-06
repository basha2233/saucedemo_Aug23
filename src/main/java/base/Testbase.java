package base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import util.webutils;

public class Testbase 
{

public static WebDriver driver;

@BeforeTest
public void loadbrowser() throws IOException
{	

	System.setProperty("webdriver.chrome.driver", "N://Testing//chromedriver.exe");  
    driver =new ChromeDriver();  
    System.out.println("Step 1: Driver loaded");
    driver.manage().window().maximize();
    System.out.println("Step 2: window maximised");
    System.out.println("Step 3: Homepage class inherited");
	
    
}
@AfterTest
public void closeDriver()
{
	//Extent
			webutils.report.endTest(webutils.test);
			webutils.report.flush();
			System.out.println("Finish");
	// driver.close();

}


}
