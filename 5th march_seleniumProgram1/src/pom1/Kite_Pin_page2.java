package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_page2 {
	
	//data member/variable
	@FindBy(id="pin") private WebElement PinNumber;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement  SubmitButton;

	
	//constructor declaration
	
	public Kite_Pin_page2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void SendPinNumber()
	{
	PinNumber.sendKeys("982278");	
	}
	public void ClickSubmitButton()
	{
		SubmitButton.click();
	}
	
}
