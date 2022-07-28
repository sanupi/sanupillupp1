package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable_example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","G:\\important software for testing\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myvi.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			Thread.sleep(1000);
			WebElement OTPbutton = driver.findElement(By.xpath("//button[text()='send OTP']"));
		driver.findElement(By.id("mobile")).sendKeys("9850602505");
		if(OTPbutton.isEnabled())
		{
			OTPbutton.click();
		}
		else
		{
		
		System.out.println("send otp is enable");
}
		
		
		
		
		
		
		



	}

}
