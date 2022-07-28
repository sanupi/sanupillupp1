package pom2Kite_with_sheetreading;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException  {
		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File MyFile = new File("G:\\important software for testing\\5th march excelsheet1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		String UN = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLogin_page Login= new KiteLogin_page(driver);
		Login.sendusername(UN);
		Login.sendpassword(PWD);
		Login.clickloginbutton();
	
		Kite_Pin_page2  EnterPin = new Kite_Pin_page2(driver);
		EnterPin.SendPinNumber(PIN);
		EnterPin.ClickSubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Kite_Home_page Home= new Kite_Home_page(driver);
		Home.validateUserId(UN);
		Home.clickLogoutButton();
		Thread.sleep(1000);

		driver.close();
	}

}
