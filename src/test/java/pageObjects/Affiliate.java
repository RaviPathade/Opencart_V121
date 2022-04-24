package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Affiliate 
{
	WebDriver driver;
	
	 public Affiliate(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//a[text()='Edit your affiliate information']") WebElement editaffiliate;
		
	 @FindBy(xpath="//input[@name='company']") WebElement company;
			
	 @FindBy(xpath="//input[@id='input-website']") WebElement website;
		
	 @FindBy(xpath="//input[@name='tax']") WebElement tax;
		
	 @FindBy(xpath="//input[@name='payment']") WebElement payment;
		
	 @FindBy(xpath="//input[@name='cheque']") WebElement payee;
				
	 @FindBy(xpath="//input[@value='Continue']") WebElement contin;
		
	 
	 
	 public void edit_affiliate() 
		{
			editaffiliate.click();
		}
	 public void companyname(String text)
		{
			company.sendKeys(text);
		}
		
		public void websitename(String text)
		{
		     website.sendKeys(text);
		}
		public void taxx(String text)
		{
			tax.sendKeys(text);
		}
		public void paymentmethod()
		{
		    payment.click();
		}
		
		public void payeename(String text)
		{
			payee.clear();
		    payee.sendKeys(text);
		}
		public void contbutton()
		{
		    contin.click();
		}
	
}
