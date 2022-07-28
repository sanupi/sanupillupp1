package pom1;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException  {
		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		KiteLogin_page Login= new KiteLogin_page(driver);
		Login.sendusername();
		Login.sendpassword();
		Login.clickloginbutton();
	
		Kite_Pin_page2  EnterPin = new Kite_Pin_page2(driver);
		EnterPin.SendPinNumber();
		EnterPin.ClickSubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Kite_Home_page Home= new Kite_Home_page(driver);
		Home.validateUserId();
		Home.clickLogoutButton();

		driver.close();
	}

}
