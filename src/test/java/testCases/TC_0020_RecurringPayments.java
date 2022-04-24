package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RecurringPayments;
import testBase.BaseClass;

public class TC_0020_RecurringPayments extends BaseClass
{

	@Test
	public void test_RecurringPayment() throws InterruptedException
	{
		logger.info(" Starting TC_0020_RecurringPayment");
		
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
        Thread.sleep(2000);
		
		RecurringPayments rp=new RecurringPayments(driver);
		rp.Recurring_Payment();
		logger.info("Clicked on Recurring Payement");
		Thread.sleep(2000);
		
		logger.info("Finished TC_0020_RecurringPayment");
	}
	
	
}
