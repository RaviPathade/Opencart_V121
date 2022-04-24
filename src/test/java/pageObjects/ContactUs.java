package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs
{

	WebDriver driver;
	
	public ContactUs(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Contact Us']") WebElement contactus;
	
	

    @FindBy(xpath="//textarea[@name='enquiry']") WebElement enquiry;
    @FindBy(xpath="//input[@value='Submit']")  WebElement submit;
   
    
    public void contact_us()
    {
    	contactus.click();
	         }
	
  
    public void enquirymssg(String text)
    {
   	 enquiry.sendKeys(text);
    }
    public void submitbutton()
    {
   	 submit.click();
    }
    
}
