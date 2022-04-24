package testCases;

import org.testng.annotations.Test;

import pageObjects.Currency;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_0027_Currency extends BaseClass
{
	@Test
	public void test_Currency() throws InterruptedException
	{
		logger.info(" Starting TC_0027_Currency");
		 driver.get(rb.getString("appURL"));
		 HomePage hp=new HomePage(driver);
		 logger.info("HomePage Displayed");
		 driver.manage().window().maximize();
		 
		 Currency cu=new Currency(driver);
		 cu.clickCurrency();
		 logger.info("Click on currency");
		 Thread.sleep(2000);
		 
		 cu.clickUsDollar();
		 logger.info("Click on US Dollar");
		 Thread.sleep(3000);
		 logger.info("Finsihed TC_0027_Currency");
		 
		 
	}
}
