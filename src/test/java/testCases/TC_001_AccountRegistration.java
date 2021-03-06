package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass
{
	

     @Test(groups={"regression","master"}) 
     public void test_account_Registration()
     {
    	 
    	 logger.info("Starting TC_001_AccountRegistration");
    	 try
    	 {
    	 driver.get(rb.getString("appURL"));
    	 driver.manage().window().maximize();
    	 
    	 logger.info("Home Page displayed");
    	 HomePage hp=new HomePage(driver);
    	 hp.clickMyaccount();
    	 logger.info("Clicked on Myaccount");
    	 hp.clickRegister();
    	 logger.info("Clicked on Register");
    	 
    	 AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
    	 regpage.setFirstName("Ravi");
    	 logger.info("Provided First Name");
    	 regpage.setLastName("Pathade");
    	 logger.info("Provided Last Name");
    	 regpage.setEmail(randomestring()+"@gmail.com");
    	 logger.info("Provided Email");
    	 regpage.setTelephone("234567");
    	 logger.info("Provided Telephone");
    	 regpage.setPassword("crfhr");
    	 logger.info("Provided Password");
    	 regpage.setConfirmPassword("crfhr");
    	 logger.info("Provided ConfirmPassword");
    	 regpage.setPrivacyPolicy();
    	 logger.info("Set Privacy Policy");
    	 regpage.clickContinue();
    	 logger.info("Clicked on Continue");
    	String confmsg=regpage.getConfirmationMsg();
    	
    	if(confmsg.equals("Your Account Has Been Created!"))
    	{
    		logger.info("Account Registration Success");
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		logger.error("Account Registration Failed");
    		captureScreen(driver,"test_account_Registration"); //capture screenshots
    		Assert.assertTrue(false); 
    	}
     }
    	 catch(Exception e)
    	 {
    		 logger.fatal("Account Registration Failed");
    		 Assert.fail();
    	 }
    		 
    	 logger.info("Finished TC_001_AccountRegistration");
    	 }
   
}
