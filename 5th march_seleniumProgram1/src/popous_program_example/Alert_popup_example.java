package popous_program_example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\\\important software for testing\\\\chromedriver_win32\\\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(1000);
	Alert  Alt=driver.switchTo().alert();
	System.out.println(Alt.getText());
	Thread.sleep(1000);
	Alt.accept();
	
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	Thread.sleep(1000);
	Alert  Alt1=driver.switchTo().alert();
	System.out.println(Alt1.getText());
	Thread.sleep(1000);
	Alt.accept();
	
	
	

		

	}

}
