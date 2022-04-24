package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage
{

	WebDriver driver;
	
	 public ProductDisplayPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	@FindBy(xpath="//img[@title='iPhone']") WebElement img;
	
    @FindBy(xpath="//a[normalize-space()='iPhone']") WebElement product;
	
	@FindBy(xpath="//a[normalize-space()='Write a review']") WebElement review;
		
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement conti;
			
	public void clickImg()
	{
		img.click();
	}
	public void clickProduct()
	{
		product.click();
	}
	public void clickReview()
	{
		review.click();
	}
	
	public boolean isPageExists()
	{
		try
		{
		return(conti.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
	
	
	
}
