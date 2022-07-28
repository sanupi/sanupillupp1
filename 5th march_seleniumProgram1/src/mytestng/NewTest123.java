package mytestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest123 {
  @Test
  public void method12() {

		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
		if(checkbox1.isSelected())
		{
			Reporter.log("checkbox is selected ", true);
		}
		else
		{
			Reporter.log("Checkbox is not selected", true);
		}
  }
}
