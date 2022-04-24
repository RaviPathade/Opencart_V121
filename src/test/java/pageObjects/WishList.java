package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList 
{


	 WebDriver driver;
	
	 public WishList(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	// @FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[3]//button[2]//i[1]") WebElement wishlist;
	 @FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
		WebElement wishlist;
	 
	 @FindBy(xpath="//span[normalize-space()='Wish List (1)']") WebElement wishlticon;
	 
	 @FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
		WebElement notfoun;
	 
	 
	 public void wListClick()
	 {
		 wishlist.click();
	 }
	 public void wListIconClick()
	 {
		 wishlticon.click();
	 }
	 
	 public boolean isPageExists() 
	 {
		 try
		 {
		 return(notfoun.isDisplayed());
		 }
		 catch(Exception e)
		 {
			 return(false);
		 }
	 }
	 
	 
}
