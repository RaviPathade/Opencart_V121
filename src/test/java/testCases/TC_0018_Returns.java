package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Returns;
import testBase.BaseClass;

public class TC_0018_Returns  extends BaseClass
{
	@Test
	public void test_Returns() throws InterruptedException
	{
		
		logger.info("Starting TC_0018_Returns");
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
		
        Returns rt=new Returns(driver);
        rt.return_item();
        Thread.sleep(1000);
		logger.info("Click on Returns");
		
		logger.info("Finished TC_0018_Returns");
	}

	
	
	
	
}
