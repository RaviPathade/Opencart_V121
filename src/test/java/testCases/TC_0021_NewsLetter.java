package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.NewsLetter;
import testBase.BaseClass;

public class TC_0021_NewsLetter extends BaseClass
{
    @Test
	public void test_NewsLetter() throws InterruptedException
	{
		
    	logger.info(" Starting TC_022_NewsLetter");
    	
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
        NewsLetter nl=new NewsLetter(driver);
        nl.newsletter();
        logger.info("Clicked on NewsLetter");
        Thread.sleep(1000);
        nl.radioBtn();
        logger.info("Clicked on radiobutton");
        Thread.sleep(2000);
         nl.backhome();
         logger.info("Clicked on backbutton");
         Thread.sleep(1000);
         
         logger.info("Finished TC_0021_NewsLetter");
	}
	
	
	
	
}
