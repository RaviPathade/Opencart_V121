package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountInformation;
import testBase.BaseClass;

public class TC_0013_MyAccountInformation extends BaseClass
{
	@Test
	public void test_MyAccountInfo() throws InterruptedException
	{
		logger.info("TC_0013_MyAccountInformation is started");
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
		
		lp.clickLogin();
		logger.info("Clicked on Login");
        Thread.sleep(5000);
        
        MyAccountInformation ma=new  MyAccountInformation(driver);
		
        ma.editInfo();
        logger.info("Clicked on MyEditInformation");
        Thread.sleep(2000);
		
       ma.edit_tele("5876446");
        logger.info("Edit Telephone number");
	     Thread.sleep(3000);
        
	     ma.clickConti();
	     Thread.sleep(3000);
	     
	    String  expmsg=ma.isAccountSuccPExists();
	    
	    if(expmsg.equals("Success: Your account has been successfully updated."))
	    {
	    	logger.info("Successfully edited MyAccountInformation");
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	logger.error("not able edit info");
	    	captureScreen(driver,"test_MyAccountInfo");
	    	Assert.assertTrue(false);
	    }
		}
	    catch(Exception e)
		{
			logger.fatal("MyAccountInformation failed");
			Assert.fail();
		}
		logger.info("Finished TC_0013_MyAccountInformation");
	    
	    
	    
	}
	

}
