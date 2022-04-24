package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart 
{
	WebDriver driver;
	
	 public AddToCart(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//input[@placeholder='Search']")  WebElement txtSearch;
		
	 @FindBy(xpath="//button[@class='btn btn-default btn-lg']")  WebElement searchbutton;
	 
	 @FindBy(xpath="//span[text()='Add to Cart']")  WebElement addtocart;
	 @FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
		WebElement viewcart;
		
		@FindBy(xpath="//strong[normalize-space()='View Cart']")
		WebElement view;
	 
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		WebElement msgconfm;
	 
	 public void searchtxt(String text)
	 {
		 txtSearch.sendKeys(text);
	 }
	 
	 public void searchButton()
	 {
		 searchbutton.click();
	 }
	 public void addToCart()
	 {
		 addtocart.click();
	 }

	/*	public void viewcart()
	{
		viewcart.click();
		}
	
	public void view()
	{
		view.click();
	} */
	/*public String getConfirmationMsg()
    {
  	  try
  	  {
  		  return (msgconfm.getText());
  	  }
  	  catch(Exception e)
  	  {
  		  return(e.getMessage());
  			  
  	  }*/
	 
	 public boolean getConfirmationMsg()
	 {
		 try
		 {
		 return(msgconfm.isDisplayed());
		 }
		 catch(Exception e)
		 {
			 return(false);
		 }
	 }	
}
