package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_0023_ContactUs extends BaseClass
{
	@Test
	public void test_ContactUs() throws InterruptedException
	{
		logger.info("TC_0023_ContactUs is started");
	
		
		
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
        
        ContactUs cu=new ContactUs(driver);
        cu.contact_us();
        logger.info("click on Contact Us Link");
		Thread.sleep(2000);
        
		
		cu.enquirymssg("This is an enquiry of an iphone");
		logger.info("Entered Enquiry Message");
		Thread.sleep(2000);
		
		cu.submitbutton();
		logger.info("click on Submit Button");
		Thread.sleep(2000);
		logger.info("Finished TC_0023_ContactUs");
		
		
		
        
	}

}
