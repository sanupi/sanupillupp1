package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable_method_example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();     
		driver.manage().window().maximize();      
		driver.get("https://www.discoveryplus.in/");    
		Thread.sleep(8000);   
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();  
		  Thread.sleep(2000);  
		  WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));    
		  boolean result = OTPButton.isEnabled();    
		  System.out.println("OTP button status is "+result); 

	}

}
