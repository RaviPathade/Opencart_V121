package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCart;
import pageObjects.Checkout;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_0011_CheckOut extends BaseClass
{
	 @Test
	public void test_checkout() throws InterruptedException
	{
		logger.info("TC_0011_CheckOut is started");
		try
		{
		driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
	   	   logger.info("HomePage is Displayed");
	       	driver.manage().window().maximize();
	       	
	       	SearchPage sp=new SearchPage(driver);
	        sp.searchtxt("iPhone");
	        Thread.sleep(2000);
	        logger.info("Enter any Product"); 
	        sp.searchButton();
	        Thread.sleep(2000);
	        AddToCart ac=new AddToCart(driver);
	        ac.addToCart();
		    logger.info("product is added to cart");
		   Thread.sleep(3000);
		   
		   Checkout co=new Checkout(driver);
		    co.viewcart();
		    logger.info("click on the view cart");
		    Thread.sleep(3000);
		    co.shop_cart();
		    logger.info("click on the shopping cart"); 
		    Thread.sleep(2000);
		    co.check_out();
		    logger.info("click on the Checkout"); 
		    Thread.sleep(1000);
		    
		  boolean  targepage=co.isPageExists();
		  
		  if(targepage)
		  {
			  logger.info("Checkout Failed");
		    	captureScreen(driver, "test_checkout");
				Assert.assertTrue(false); 
		  }
		  else
		  {
			  logger.error("Checkout Success");
				
				Assert.assertTrue(true);
		  }
		}
		catch(Exception e)
		{
			logger.fatal("Checkout Failed");
			Assert.fail();
		}
		logger.info(" Finished TC_0011_Checkout");
	}
	
	
	
	
	
}
