package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBook
{
	WebDriver driver;
    public AddressBook(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
    @FindBy(xpath="//a[text()='Address Book']") WebElement addressbook;
	
	
	@FindBy(xpath="//a[normalize-space()='New Address']") WebElement newaddress;
	
	 
	@FindBy(xpath="//a[text()='Back']") WebElement backbutton;
    
	public void address_book()
    {
 	   addressbook.click();
    }
    public void newaddress_book()
    {
 	   newaddress.click();
    }
    
    public void back_button()
    {
 	   backbutton.click();
    }
    
}
