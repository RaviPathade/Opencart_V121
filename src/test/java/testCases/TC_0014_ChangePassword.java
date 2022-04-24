package testCases;

import org.testng.annotations.Test;

import pageObjects.ChangePassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_0014_ChangePassword extends BaseClass
{
    @Test
	public void test_ChangePwd() throws InterruptedException
	{
    	logger.info("TC_0014_ChangePassword is started");
    	
    	
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
    	
        ChangePassword cp=new ChangePassword(driver);
        cp.changePwd();
        logger.info("Clicked on ChangePassword");
        Thread.sleep(2000);
        
        cp.before_Pwd("harekrishna123");
        logger.info("Clicked on password");
        Thread.sleep(2000);
        
        cp.conf_Pwd("harekrishna123");
        logger.info("Clicked on ConfirmPassword");
        Thread.sleep(1000);
        
        cp.continbutton();
        logger.info("Clicked on Continue");
        Thread.sleep(1000);
        
        logger.info("Finished TC_0014_ChangePassword");
        
        
        
	}
	
	
}
