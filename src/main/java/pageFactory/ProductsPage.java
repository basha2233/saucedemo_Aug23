package pageFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import base.Testbase;
import util.webutils;

public class ProductsPage 
{
	@FindBy(xpath="//div[@class=\"header_secondary_container\"]//span[@class=\"title\"]")
	public WebElement Products;
	
	public ProductsPage(WebDriver driver)
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

	public void VerifyProductspage()
	{
		try {
		String products = Products.getText();
		System.out.println(products);
		assertEquals("Products", products, "Product name is not matching");
		
		//Extent
		 webutils.test = webutils.report.startTest("Products");
		webutils.test.log(LogStatus.PASS, "Products Pass");
		System.out.println("Products page");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
