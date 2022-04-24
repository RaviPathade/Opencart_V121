package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RewardPoints;
import testBase.BaseClass;

public class TC_0017_RewardPoints extends BaseClass
{
	@Test
	public void test_rewardpoints() throws InterruptedException
	{
		logger.info("TC_0017_RewardPoints is starting");
		
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
		
		//Thread.sleep(5000);
		lp.clickLogin();
		logger.info("Clicked on Login");
        Thread.sleep(5000);
		
		RewardPoints rp=new RewardPoints(driver);
		rp.reward_point();
		logger.info("Clicked on reward point");
		Thread.sleep(1000);
		
		logger.info("finished TC_0017_RewardPoints");
		
	}
	
	
	
	
	
	
	
	
	
}
