package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_0012_MyAccount extends BaseClass

{
    @Test
	public void test_MyAccount() throws InterruptedException
	{
    	logger.info("TC_0012_MyAccount is started");
    	
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
        
       
       MyAccount ma=new MyAccount(driver);
       hp.clickMyaccount();
       logger.info("Click on MyAccount");
       
       ma.orderHistory();
       logger.info("Click on OrderHistory ");
       Thread.sleep(3000);
       
       hp.clickMyaccount();
       
    	ma.logOut();
    	Thread.sleep(3000);
		logger.info("Click on LogOut");
		
		ma.sitemap();
		logger.info("Click on SiteMap Link");
		Thread.sleep(3000);
		
		 logger.info("Finished TC_0012_MyAccount");
	}
	
	
}
