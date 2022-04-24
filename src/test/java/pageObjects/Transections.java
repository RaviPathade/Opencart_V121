package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transections 
{

	 WebDriver driver;
		
	 public Transections(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Transactions']") WebElement transections;
		
	 public void tran_sections()
		{
			transections.click();
		}
	 
}
