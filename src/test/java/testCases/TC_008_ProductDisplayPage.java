package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDisplayPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_008_ProductDisplayPage extends BaseClass
{
	@Test
   public void test_ProductDisplayPage() throws InterruptedException
   {
		logger.info("TC_008_ProductDisplayPage is started");
		
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
        
        ProductDisplayPage pg=new ProductDisplayPage(driver);
        
        pg.clickImg();
        Thread.sleep(1000);
        logger.info("click on img");
		
        pg.clickProduct();
        Thread.sleep(1000);
        logger.info("click the product");
        
        pg.clickReview();
        Thread.sleep(2000);
        logger.info("click the review");
        
        boolean tarpage=pg.isPageExists();
        
        if(tarpage)
        {
        	logger.info("ProductDisplayPage  success");
   			Assert.assertTrue(true);
        }
        else
        {
        	logger.error("ProductDisplayPage failed");
			captureScreen(driver, "test_ProductDisplayPage"); //Capturing screenshot
			Assert.assertTrue(false);
        }
		}
        catch(Exception e)
    	{
    		logger.fatal("ProductDisplayPage  Failed");
    		Assert.fail();
    	}
    	
    	logger.info("Finished TC_008_ProductDisplayPage");
   }
	
	
	

}
