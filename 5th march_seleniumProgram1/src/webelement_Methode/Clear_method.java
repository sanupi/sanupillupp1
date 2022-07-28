package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","G:\\important software for testing\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poonamshiwankar@gmail.com");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		
		// chagale disanyasathi ani prat used karnya sathiii.
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		
		username.sendKeys("poonam shiwankar");
		Thread.sleep(1000);
	    username.clear();
		
		Thread.sleep(1000);
		
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("123456");
		
        Thread.sleep(1000);
        
        password.clear();
       driver.close();
	}

}
