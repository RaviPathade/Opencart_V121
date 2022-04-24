package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderFooterMenuOptions;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_0025_HeaderFooterMenuOptions extends BaseClass
{
	@Test
	public void test_HeaderFooterMenuOptions() throws InterruptedException
	{
		logger.info(" Starting TC_0025_HeaderMenuFooterOptions");
		
		driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
		logger.info("HomePage Displayed");
		driver.manage().window().maximize();
		
		HeaderFooterMenuOptions hfmo=new HeaderFooterMenuOptions(driver);
		hfmo.brand();
		logger.info("Click on footer option: Brands link");
		Thread.sleep(2000);
		hfmo.cannonlink();
		logger.info("Click on Product Cannon");
		Thread.sleep(2000);
		hfmo.grid();
		logger.info("Click on Product on Grid format");
		Thread.sleep(2000);
		hfmo.productcompare();
		logger.info("Click on Product Compare");
		Thread.sleep(2000);
		
		logger.info("Finished TC_0025_HeaderMenuFooterOptions");
		
		
		
		
		
	}

}
