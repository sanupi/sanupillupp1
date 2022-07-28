package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathstudy_methode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
	Thread.sleep(100);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poonamshiwankar@gmail.com");

		

	}

}
