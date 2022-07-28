package iframe_program_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_w3Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\\\important software for testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@type='button']")).click();
    Thread.sleep(1000);
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();


	}

}
