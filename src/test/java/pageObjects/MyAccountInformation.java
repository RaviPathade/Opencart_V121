package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountInformation 
{

	WebDriver driver;
	
	 public MyAccountInformation(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[text()='Edit your account information']") WebElement editinfo;
	 
	 @FindBy(xpath="//input[@id='input-telephone']") WebElement txtbox;
	 
	 @FindBy(xpath="//input[@value='Continue']") WebElement conti;
	 
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")  WebElement confmsg;
	 
	 public void editInfo()
	 {
		 editinfo.click();
	 }
	 
	 public void edit_tele(String text)
	 {
		 txtbox.clear();
		 txtbox.sendKeys(text);
	 }
	 
	 public void clickConti()
	 {
		 conti.click();
	 }
	 
	 public String isAccountSuccPExists()
	 {
		 try
		 {
		 return(confmsg.getText());
		 }
		 catch(Exception e)
		 {
			 return(e.getMessage());
		 }
	 }
	 
	 
}
