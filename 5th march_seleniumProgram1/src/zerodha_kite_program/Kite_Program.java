package zerodha_kite_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));

username.sendKeys("ELR321");
password.sendKeys("Dhana1111");
Loginbutton.click();

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

WebElement pin = driver.findElement(By.id("pin"));
WebElement continubutton = driver.findElement(By.xpath("//button[@type='submit']"));

pin.sendKeys("982278");
continubutton.click();

WebElement UserId = driver.findElement(By.xpath("//span[@class='user-id']"));

String actualuserID = UserId.getText();
String ExpecteduserID="ELR321";
if(actualuserID.equals(ExpecteduserID))
{
	  System.out.println("UserId is match test case is pass");
}

else
{
	  System.out.println("UserId is not test case is fail" );
}

UserId.click();
Thread.sleep(1000);
WebElement logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
logoutbutton.click();
Thread.sleep(1000);

driver.close();
	}

}
