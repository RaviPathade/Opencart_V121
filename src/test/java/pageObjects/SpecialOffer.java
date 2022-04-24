package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialOffer 
{
WebDriver driver;
	
	public SpecialOffer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Specials']") WebElement specials;
	
	@FindBy(xpath="//span[text()='Add to Cart']") WebElement addcart;
	
	@FindBy(xpath="//button[contains(text(),'Add to Cart')]") WebElement acart;
	
	public void specialoffer()
    {
   	 specials.click();
    }
    
    public void addtocart()
    {
   	 addcart.click();
    }
    public void add_cart()
    {
   	 acart.click();
    }
}
