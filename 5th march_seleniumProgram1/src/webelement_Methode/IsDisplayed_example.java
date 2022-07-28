package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","G:\\\\important software for testing\\\\chromedriver_win32\\\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
WebElement Textbox = driver.findElement(By.id("displayed-text"));
boolean Result = Textbox.isDisplayed();
System.out.println("Text box status is "+Result);//true

Textbox.sendKeys("hi my name is poonam");//show text

Thread.sleep(1000);
driver.findElement(By.id("hide-textbox")).click();

boolean Result1 = Textbox.isDisplayed();
System.out.println("tab status is display "+Result1);//hide then show thats way false


//////karun pahile
Thread.sleep(100);

WebElement Tab = driver.findElement(By.id("openwindow"));
boolean Result2 = Tab.isDisplayed();
System.out.println("Tab status is display "+Result2);//disate open window mhanun true




	}

}
