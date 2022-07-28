package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\important software for testing\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poonamshiwankar@gmail.com");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("poonam");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	

	}

}
