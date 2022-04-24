package testCases;

import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_009_ForgotPassword extends BaseClass
{
    @Test
	public void test_ForgotPassword() throws InterruptedException
	{
    	logger.info("TC_009_ForgotPassword is Started");
		
		driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
	   	   logger.info("HomePage is Displayed");
	       	driver.manage().window().maximize();
		
	       	hp.clickMyaccount();
	       	logger.info("Clicked on My Account");
		     hp.clickLogin();
		     logger.info("Clicked on Login");
		
		     LoginPage lp=new LoginPage(driver);
				
				lp.setEmail(rb.getString("email"));
				logger.info("Provided email");
		
				ForgotPassword fp=new ForgotPassword(driver);
				
				fp.clickForgotPassword();
				 Thread.sleep(3000);
		          fp.fEmail("akash2000@gmail.com");
		     Thread.sleep(3000);
		          logger.info("Provided confirmation email");
		   	   Thread.sleep(2000);
		   	   
		   	   fp.continuebutton();
		   	 logger.info("Finished TC_009_ForgotPassword");
			   Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
