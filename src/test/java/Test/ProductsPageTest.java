package Test;

import org.testng.annotations.Test;

import pageFactory.HomePage;
import pageFactory.ProductsPage;

public class ProductsPageTest 
{
  @Test(priority=3)
  public void verify_Productspage()
  {
	  try {
	  ProductsPage productspage = new ProductsPage(HomePage.driver);
	  productspage.VerifyProductspage();
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }

}
