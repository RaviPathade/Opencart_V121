package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword 
{
	WebDriver driver;
	
	 public ForgotPassword(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")  WebElement lnkForgotpassword;
	 
	 
	 @FindBy(xpath="//input[@id='input-email']")  WebElement txtEmail;
	 
	 @FindBy(xpath="//input[@value='Continue']")  WebElement btnContinue;
	 
	 public void clickForgotPassword()
	 {
		 lnkForgotpassword.click(); 
	 }
	 public void fEmail(String text)
	 {
		 txtEmail.sendKeys(text);
	 }
	 public void continuebutton()
 	{
		 btnContinue.click();
 	}
	 
	 
}


