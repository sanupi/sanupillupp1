package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_eanable_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\important software for testing\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
				
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(8000);
			
				
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		  
		WebElement OTPbutton = driver.findElement(By.xpath("//button[@type='submit']"));

		if(OTPbutton.isEnabled())
		{
			OTPbutton.click();
		}
		else
		{
			System.out.println("enter the mobile no");
		}

			driver.findElement(By.name("mobileNumber")).sendKeys("8645124525");
			
			if(OTPbutton.isEnabled())
			{
				OTPbutton.click();
			}
			else
			{
			
			System.out.println("otp button failed to click");
	}

}
}
