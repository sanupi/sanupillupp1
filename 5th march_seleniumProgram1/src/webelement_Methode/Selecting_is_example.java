package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_is_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","G:\\\\important software for testing\\\\chromedriver_win32\\\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		//driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
boolean result = checkbox.isSelected();
System.out.println("display the check box is select satus " +result);


	}

}
