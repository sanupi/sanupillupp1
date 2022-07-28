package pom1;

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
	
	public void sendusername() 
	{
		UserName.sendKeys("ELR321");
	}
	public void sendpassword()
	{
		PassWord.sendKeys("Dhana1111");
	}
	public void clickloginbutton()
	{
		Loginbutton.click();
	}
}