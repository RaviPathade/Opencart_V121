package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{WebDriver driver;

public MyAccount(WebDriver driver)
{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
}
 


  @FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Order History']")  
   WebElement orderHistory;

  @FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")   WebElement logout;

  @FindBy(xpath="//a[text()='Site Map']")  WebElement sitemap;
	

   public void orderHistory()
   {
	   orderHistory.click();
   }
   public void logOut()
   {
	   logout.click();
   }
   
   public void sitemap()
   {
	   sitemap.click();
   }
}
