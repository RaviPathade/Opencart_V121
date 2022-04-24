package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompare
{

	WebDriver driver;
	
	public ProductCompare(WebDriver driver)
	{
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath="//button[3]")  WebElement btnComProd;
	 @FindBy(xpath="//a[@id='compare-total']")  WebElement  lnkPdtComp;
	  
	 
	 
	 
	 public void clickComProdt()
	 {
		 btnComProd.click();
	 }
	 
	 public void clickPdtComp()
	 {
		 lnkPdtComp.click();
	 }
	 
	
	 }
	
	 
	
	
	
	
	
	
	
	
	
	

