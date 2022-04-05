package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass
{
      @Test(groups={"sanity","master"})
	public void test_Login() throws InterruptedException 
	{
		logger.info("TC_002_Login is started");
		
		try
		{
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
		boolean  targetpage=lp.isMyAccountPageExists();
	   
		if(targetpage)
		{
			logger.info("Login Success");
			
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Login Failed");	
			captureScreen(driver,"test_Login");
			Assert.assertTrue(false);
		}
		}
		
		catch(Exception e)
		{
			logger.fatal("Login Failed");
			Assert.fail();
		}
		logger.info("Finished TC_002_Login");
	}
}
		
	
	
	

