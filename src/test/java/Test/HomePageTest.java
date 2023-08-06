package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import TestData.ReadExcel;
import base.Testbase;
import pageFactory.HomePage;

public class HomePageTest extends Testbase {

@Test(priority=0)
public void TestpageTitle()
{
	try
	{
	 HomePage hp = new HomePage(driver);	
	 hp.getTitle();
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
}
@Test(priority=1)
public void Login()
{
	try
	{
	 HomePage hp = new HomePage(driver);	
	 hp.login();
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	
}
@Test(priority=2)
public void readExcel() throws IOException
{
	try {
		HomePage hp = new HomePage(driver);
		hp.readExcel();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
