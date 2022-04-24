package testCases;

import org.testng.annotations.Test;

import pageObjects.AddToCart;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class TC_0010_ShoppingCart extends BaseClass 
{
    @Test
	public void test_shopCart() throws InterruptedException
	{
    	logger.info("TC_0010_ShoppingCart is started");
    	
    	driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
	   	   logger.info("HomePage is Displayed");
	       	driver.manage().window().maximize();
	       	
	       	SearchPage sp=new SearchPage(driver);
	        sp.searchtxt("iPhone");
	        Thread.sleep(2000);
	        logger.info("Enter any Product"); 
	        sp.searchButton();
	        Thread.sleep(2000);
	        AddToCart ac=new AddToCart(driver);
	        ac.addToCart();
		    logger.info("product is added to cart");
		   Thread.sleep(3000);
		   
		   ShoppingCart sc=new ShoppingCart(driver);
		   sc.clickShopCart();
		   Thread.sleep(2000);
		   
		   sc.dropdwn();
		   logger.info("Use Coupon Code Clicked");
		   Thread.sleep(2000);
		   sc.textbox("first121");
		   logger.info("Entered use Coupon Code");
		   
		   sc.drpdown2();
		   logger.info("Estimated Shipping and Taxes clicked");
		   Thread.sleep(1000);
		   
		   sc.selectlist();
		   logger.info("Country is selected");
    	    Thread.sleep(3000);
    	
    	    sc.selectlist2();
    	    logger.info("zone is selected");
    	    Thread.sleep(3000);
    	    
    	  sc.select_text("456789");
    	  logger.info("Selected PostCode");
    	  Thread.sleep(1000);
    	  
    	  sc.select_getquote();
    	  logger.info("getquote clicked");
    	  Thread.sleep(2000);
    	  
    	  sc.select_radio();
    	  logger.info("Selected radio button");
    	  Thread.sleep(2000);
    	  
    	  sc.select_applyship();
    	  logger.info("applyshiping is clicked");
    	  Thread.sleep(5000);
    	    
    	    sc.select_gift();
    	    logger.info("Selected Use Gift Certificate");
    	    Thread.sleep(1000);
    	    sc.select_giftcertifi("55ffewfwe");
    	    logger.info("Entered Gift certificate cade entered in the text box");
    		  Thread.sleep(1000);
    	    sc.select_buttongc();
    	    logger.info("clicked Entered Apply Gift Certificate");
    		  Thread.sleep(1000);
    		  sc.click_continue();
    		  logger.info("Clicked on Continue shopping");
    		  Thread.sleep(2000);
    	
    	    
    	    
    	    
    	    
    	    
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
