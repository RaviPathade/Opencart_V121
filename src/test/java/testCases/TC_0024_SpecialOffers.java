package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SpecialOffer;
import testBase.BaseClass;

public class TC_0024_SpecialOffers extends BaseClass
{

	@Test
	public void test_SpecialOffers() throws InterruptedException
	{
		logger.info("Starting TC_0024_SpecialOffers");
		
		driver.get(rb.getString("appURL"));
		logger.info("HomePage Displayed");
		driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		logger.info("Clicked on myAccount");
		
		hp.clickLogin();
		logger.info("Clicked on Login");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		logger.info("Provided email");
		
		lp.setPassword(rb.getString("password"));
		logger.info("Provided Password");
		
		
		lp.clickLogin();
		logger.info("Clicked on Login");
        Thread.sleep(3000);
        
        SpecialOffer so=new SpecialOffer(driver);
        so.specialoffer();
        logger.info("Click on Specials Link");
		Thread.sleep(3000);
		so.addtocart();
		logger.info("Click on Add to Cart");
		Thread.sleep(3000);
		so.add_cart();
		logger.info("Add to Cart");
		Thread.sleep(2000);
        
		logger.info("Finished TC_0024_SpecialOffers");
	}
}
