package testCases;

import org.testng.annotations.Test;

import pageObjects.ProductCompare;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_006_ProductCompare extends BaseClass
{
	
	@Test
	public void test_ProductCompare() throws InterruptedException
	{
		
		logger.info("TC_006_ProductCompare is started");
		driver.get(rb.getString("appURL"));
		logger.info("HomePage Displayed");
		driver.manage().window().maximize();
		
		SearchPage sp=new SearchPage(driver);
		sp.searchtxt("iMac");
	      Thread.sleep(2000);
	      logger.info("Enter any Product"); 
	      sp.searchButton();
	      Thread.sleep(1000);
	      logger.info("product displayed on HomePage");
		
	      ProductCompare pc=new ProductCompare(driver);
	    
	      pc.clickComProdt();
	      Thread.sleep(2000);
	      logger.info("products comparing");
	      pc.clickPdtComp();
	      Thread.sleep(3000);	
		
	}
	
	
	
	
	
	
}
