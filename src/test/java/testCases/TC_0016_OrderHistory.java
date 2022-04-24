package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderHistory;
import testBase.BaseClass;

public class TC_0016_OrderHistory extends BaseClass
{
	@Test
	public void test_OrderHistory() throws InterruptedException
	{
		 logger.info(" Starting TC_0016_OrderHistory");
		 
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
	        Thread.sleep(5000);
	        
	        
	        OrderHistory oh=new OrderHistory(driver);
			oh.OrderHistory();
			logger.info("Clicked on Order History");
			Thread.sleep(3000);
			
			logger.info("Finished TC_0016_OrderHistory");
	}
	

}
