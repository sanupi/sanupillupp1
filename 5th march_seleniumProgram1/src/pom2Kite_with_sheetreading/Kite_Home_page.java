package pom2Kite_with_sheetreading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_page {

	//data members/variable
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserId;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	//Constructor
	public Kite_Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Method
	
	public void validateUserId(String ExpectedUN)
	{
	  String actualUserId = UserId.getText();
	  String expectedUserId =ExpectedUN ;
	  
	  if(actualUserId.equals(expectedUserId))
	  {
		  System.out.println("UserId is match test case is pass");
	  }
	  
	  else
	  {
		  System.out.println("UserId is not test case is fail" );
	  }
	}
	
	public void clickLogoutButton() throws InterruptedException
	{
		UserId.click();
		Thread.sleep(200);
		LogoutButton.click();
	}
}


