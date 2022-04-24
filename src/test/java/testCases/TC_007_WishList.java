package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.WishList;
import testBase.BaseClass;

public class TC_007_WishList extends BaseClass
{
    @Test
	public void test_WishList() throws InterruptedException
	{
		logger.info("TC_007_WishList is started");
		try
		{
		 
		driver.get(rb.getString("appURL"));
		 HomePage hp=new HomePage(driver);
    	logger.info("HomePage is Displayed");
    	driver.manage().window().maximize();
    	
    	SearchPage sp=new SearchPage(driver);
        sp.searchtxt("MacBook");
        Thread.sleep(2000);
        logger.info("Enter any Product"); 
        sp.searchButton();
        Thread.sleep(1000);
        
        
        WishList wl=new WishList(driver);
        
        wl.wListClick();
        Thread.sleep(3000);
        
       wl.wListIconClick();
        Thread.sleep(3000);
        
      LoginPage lp=new LoginPage(driver);
        lp.setEmail(rb.getString("email"));
		logger.info("Provided email");
		
		lp.setPassword(rb.getString("password"));
		logger.info("Provided Password");
		
		lp.clickLogin();
		logger.info("Clicked on Login");
		Thread.sleep(5000);
        
		boolean targpage=wl.isPageExists();
		
		if(targpage)
		{
			logger.info("WishList Failed ");
			Assert.assertTrue(false);
		}
		else
		{
			logger.error("Search Success");
			captureScreen(driver, "test_WishList"); //Capturing screenshot
			Assert.assertTrue(true);
		}
		}
		catch(Exception e)
		{
			logger.fatal("WishList Failed");
			Assert.fail();
		}
		logger.info("Finished TC_007_WishList");
	}
	
	
	
	
	
	
	
	
	
}
