package testCases;

import org.testng.annotations.Test;

import pageObjects.Affiliate;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_0022_Affiliate extends BaseClass
{
	@Test
	public void test_Affiliate() throws InterruptedException
	{
		logger.info(" Starting TC_0022_Affiliate");
		
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
        
        Affiliate al=new Affiliate(driver);
		al.edit_affiliate();
		logger.info("Clicked on editaffiliate");
		Thread.sleep(1000);
		
		al.companyname("REDHAT");
		logger.info("Enter CompanyName");
		Thread.sleep(1000);
		
		al.websitename("xyz.com");
		logger.info("Enter websitename");
		Thread.sleep(1000);
		
		al.taxx("100000");
		logger.info("Enter tax");
		Thread.sleep(1000);
		al.paymentmethod();
		logger.info("Select Payment Mehtod");
		Thread.sleep(1000);
		al.payeename("Ramdev");
		logger.info("Enter Cheque Payee Name");
		Thread.sleep(2000);
		al.contbutton();
		Thread.sleep(2000);
		logger.info("Finishe TC_0022_Affiliate");
		
		
	}

}
