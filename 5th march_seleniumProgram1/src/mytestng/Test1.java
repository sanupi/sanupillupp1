package mytestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void mYmethod1() {
	  System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkbox1.click();
		if(checkbox1.isSelected())
		{
			System.out.println("checkbox is selected test case is pass");
		}
		else
		{
			System.out.println("checkbox is not selected test case is fail");
		}
  }
}
