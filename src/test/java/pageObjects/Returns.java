package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Returns
{

	WebDriver driver;
	
	 public Returns(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 
	 @FindBy(xpath="//a[text()='View your return requests']") WebElement return_item;
	 
	 
	 public void return_item()
	 {
		 return_item.click();
	 }
}
