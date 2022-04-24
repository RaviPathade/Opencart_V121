package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsLetter
{
	WebDriver driver;
	
	 public NewsLetter(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//a[text()='Subscribe / unsubscribe to newsletter']") WebElement newsletter;
	 
	 @FindBy(xpath="//input[@value='1']") WebElement radio_button;
	 
	 @FindBy(xpath="//a[text()='Back']") WebElement btnback;
	 
	 
	 public void newsletter()
	 {
		 newsletter.click();
	 }
	 public void radioBtn()
	 {
		 radio_button.click();
	 }
	 public void backhome()
	 {
		btnback.click();
	 }
	 
	 
}
