package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{

	 WebDriver driver;
	 
	 public SearchPage(WebDriver driver) 
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//input[@placeholder='Search']")  WebElement txtSearch;
	
	 @FindBy(xpath="//button[@class='btn btn-default btn-lg']")  WebElement searchbutton;
	 
	 
	 @FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")  WebElement  msg;
	 
	 public void searchtxt(String text)
	 {
		 txtSearch.sendKeys(text);
	 }
	 
	 public void searchButton()
	 {
		 searchbutton.click();
	 }
	 
	 public boolean isPageExists()
	 {
		 try
		 {
		 return(msg.isDisplayed());
		 }
		 catch(Exception e)
		 {
			 return(false);
		 }
		 
		 
	 }
	 
	 
}
