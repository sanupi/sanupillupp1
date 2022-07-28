package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDiaplay_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\\\important software for testing\\\\chromedriver_win32\\\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement Element2 = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate Training Center')]"));
String MYtext1 = Element2.getText();

System.out.println(MYtext1);
String actualText = Element2.getText();

String expextedText = "VELOCITY COTPORATE TRANING CENTER";
if(actualText.equals(expextedText))
{
	System.out.println("if result is match then display the true");
	}
else
{
	System.out.println("if result is not match then display the flase");//he as kaa
}


	}

}
