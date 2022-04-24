package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecurringPayments 
{

	 WebDriver driver;
		
	 public RecurringPayments(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
     }
	 
	 @FindBy(xpath="//a[text()='Recurring payments']") WebElement recurringpayment;
		
	 
	 public void Recurring_Payment()
		{
		 recurringpayment.click();
		}
	 
}
