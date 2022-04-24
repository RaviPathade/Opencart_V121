package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Currency 
{
	 WebDriver driver;
		
	 public Currency(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath="//span[text()='Currency']") WebElement currency;
	 
	 @FindBy(xpath="//button[text()='$ US Dollar']") WebElement usdollar;

	 public void clickCurrency()
	 {
		 currency.click();
	 }
	 public void clickUsDollar()
	 {
		 usdollar.click();
	 }
	 
}

