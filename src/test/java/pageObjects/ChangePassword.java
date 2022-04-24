package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword 
{
	 WebDriver driver;
		
	 public ChangePassword(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	
	
	@FindBy(xpath="//a[text()='Change your password']") WebElement changepwd;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement before_pwd;
	
	@FindBy(xpath="//input[@id='input-confirm']") WebElement conf_pwd;
	
	@FindBy(xpath="//a[text()='Back']") WebElement backhomepage;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement contin;
	
	public void changePwd()
	{
		changepwd.click();	
	}
	
	public void before_Pwd(String text)
	{
		
		before_pwd.click();
		before_pwd.sendKeys(text);
	}
	public void conf_Pwd(String text)
	{
		conf_pwd.click();
		conf_pwd.sendKeys(text);
	}
	
	public void backHomepage()
	{
		backhomepage.click();
	}
	public void continbutton()
    {
    	contin.click();
    }
	
	
	
	
}
