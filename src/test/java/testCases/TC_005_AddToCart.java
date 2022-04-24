package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCart;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_005_AddToCart extends BaseClass
{
    @Test
	public void test_AddToCart() throws InterruptedException
	{
		logger.info("TC_005_AddToCart is started");
		try
		{
		driver.get(rb.getString("appURL"));
		logger.info("HomePage Displayed");
		driver.manage().window().maximize();
	      
	      AddToCart ac=new AddToCart(driver);
	      ac.searchtxt("imac");
	      Thread.sleep(3000);
	      logger.info("Enter any product");
	      ac.searchButton();
	      Thread.sleep(3000);
		    ac.addToCart();
		    logger.info("product is added to cart");
		   Thread.sleep(3000);
		   
		
		//Thread.sleep(3000);
		 
		boolean expmg=ac.getConfirmationMsg();//
			   
		    if(expmg)
	        	
	 		{
	        	 logger.info("Search page is Success ");
	 			  Assert.assertTrue(true);
	 		}
	 		else
	 		{
	 			logger.error("Add cart  Page Failed ");
				captureScreen(driver, "test_search"); 
				
				Assert.assertTrue(false);
	 		}
		}
		catch(Exception e)
		{
			logger.fatal("addtocart is failed");
			Assert.fail();
		}
		 logger.info("TC_005_AddToCart is finished");
	}
	
}
