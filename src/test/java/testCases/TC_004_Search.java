 package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_Search extends BaseClass 
{
     @Test
	public void test_Search() throws InterruptedException
	{
		logger.info("TC_004_Search Started");
		try
		{
		driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
		logger.info("HomePage is Displayed");
		driver.manage().window().maximize();
		
       SearchPage sp=new SearchPage(driver);
      sp.searchtxt("i-Mac");
      Thread.sleep(2000);
      logger.info("Enter any Product"); 
      sp.searchButton();
      Thread.sleep(1000);
      
         boolean tarpage=sp.isPageExists();
		//Thread.sleep(1000);
    	 if(tarpage)
    	 {
    		 logger.info("search is failed");
    		 captureScreen(driver,"test_Search");
    		 Assert.assertFalse(true);
    	 }
    	 else
    	 {
    		 logger.error("search is success");
    		
    		 Assert.assertTrue(true);
    	 }
		}
		catch(Exception e)
		{
			logger.fatal("search is failed");
			Assert.fail();
		}
		logger.info("Finished TC_004Search");
	
	}
	
	
	
	
}
