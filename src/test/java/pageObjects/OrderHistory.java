package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory 
{

	WebDriver driver;
	
	public OrderHistory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Order History']")
	WebElement orderhistory;
	
	public void OrderHistory()
	{
		orderhistory.click();
	}
	
	
	
}
