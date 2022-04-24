package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart 
{
	WebDriver driver;
	
	 public ShoppingCart(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//span[text()='Shopping Cart']") WebElement shopingcart;
	 
	 @FindBy(xpath="//a[normalize-space()='Use Coupon Code']") WebElement drpselect;
		
	 @FindBy(xpath="//input[@id='input-coupon']") WebElement textbox;
		
	 @FindBy(xpath="//a[text()='Estimate Shipping & Taxes ']")  WebElement shipi;
	 
	 @FindBy(id="input-country")  WebElement select;
	 
	 @FindBy(id="input-zone") WebElement region;
	 
	 @FindBy(id="input-postcode")   WebElement postcode;
	    
	 @FindBy(xpath="//button[@id='button-quote']") WebElement getquote;
	  
	 @FindBy(xpath="//input[@name='shipping_method']")  WebElement radio;
	   
	 @FindBy(xpath="//input[@value='Apply Shipping']")  WebElement applyship;
	 @FindBy(xpath="//a[text()='Use Gift Certificate ']") WebElement gift;
		
	 @FindBy(xpath="//input[@id='input-voucher']") WebElement giftcerti;
	 @FindBy(xpath="//input[@value='Apply Gift Certificate']") WebElement applygc;
		
		
	 @FindBy(xpath="//a[normalize-space()='Continue Shopping']") WebElement con_button;
		
	 public void clickShopCart()
	 {
		 shopingcart.click();
	 }
	 
	 public void dropdwn()
	 {
		 drpselect.click();
	 }
	 
	 public void textbox(String text)
	 {
		 textbox.sendKeys(text);
	 }
	 public void drpdown2()
		{
			shipi.click();
		}
	 public void selectlist()
	 {
		 Select coun=new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
		 coun.selectByVisibleText("United Kingdom");
	 }
	   
	 public void selectlist2()
	 {
		 Select zone=new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
		 zone.selectByVisibleText("Berkshire");
	 }
	   
	 public void  select_text(String text)
		{
		   postcode.sendKeys(text);   
				}
	 
	 public void select_getquote()
		{
			getquote.click();
		}
		
		public void select_radio()
		{
			radio.click();
		}
	 public void select_applyship()
		{
			applyship.click();
		}
		public void select_gift()
		{
			gift.click();
		}
		
		public void select_giftcertifi(String text)
		{
			giftcerti.sendKeys(text);
		}
		
		public void select_buttongc() 
		{
			applygc.click();
		}
		
		public void click_continue()
		{
			con_button.click();
		}
	 
	 

	
}
