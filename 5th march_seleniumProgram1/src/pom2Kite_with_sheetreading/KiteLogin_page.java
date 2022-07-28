package pom2Kite_with_sheetreading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin_page {
	// data members //variable
	@FindBy(id = "userid")  private WebElement UserName;
	
	@FindBy(id="password")private WebElement  PassWord;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement  Loginbutton;
	
	//Constructor 
	
	public  KiteLogin_page (WebDriver driver)
	{
    PageFactory.initElements(driver, this);
	}
	
	// methods
	
	public void sendusername(String UN) 
	{
		UserName.sendKeys(UN);
	}
	public void sendpassword(String PWD)
	{
		PassWord.sendKeys(PWD);
	}
	public void clickloginbutton()
	{
		Loginbutton.click();
	}
}