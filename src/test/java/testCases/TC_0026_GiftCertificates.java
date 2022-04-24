package testCases;

import org.testng.annotations.Test;

import pageObjects.GiftCertificates;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_0026_GiftCertificates extends BaseClass
{
	 @Test
	public void test_GiftCertificates() throws InterruptedException
	{
		 logger.info(" Starting TC_0026_GiftCerticate");
		
		 driver.get(rb.getString("appURL"));
		 HomePage hp=new HomePage(driver);
		 logger.info("HomePage Displayed");
		 driver.manage().window().maximize();
		 
		 GiftCertificates gc=new GiftCertificates(driver);
		 gc.gift();
		 logger.info("Click on footer option: Gift Certicate link");
		 Thread.sleep(1000);
		 gc.recname("Mahesh");
		 logger.info("Enter the Recipient's Name");
		 
		 gc.email("mahesh@123gmail.com");
		 logger.info("Enter the Recipient's email");	
		 
		 gc.yourname("Sach");
		 logger.info("Enter the Your Name");
		 Thread.sleep(2000);	
		 
		 gc.youremail("sach@gmail.com");
		 logger.info("Enter the Your Email");
			
		 gc.radiobutton();
		 logger.info("click on Christmas Radio Button");
		 
		 gc.message("Gift Card");
		 logger.info("click on Message");
		 Thread.sleep(2000);
		 
		 gc.ramount("5");
		 logger.info("click on Amount");
		 Thread.sleep(2000);
		 
		 gc.chkagree();
		 logger.info("click on Agree Check Box");
		 Thread.sleep(2000);
		 
		 gc.continuebutton();
		 logger.info("click on Continue Button");
		 Thread.sleep(2000);
		 logger.info("Finished TC_0026_GiftCertificates");
		 
	}
	 
}
