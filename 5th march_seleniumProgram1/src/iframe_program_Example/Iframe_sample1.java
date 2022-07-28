package iframe_program_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\\\important software for testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//switch selenium focus from main page to frame 
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		
		//current focus on frame now
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();//this element are present in iframe(need to switch  focus from main page to frame) 
        //to take a action on main page again,we need to switch focus on selenium frame to main page
		
		//parent frame();//default content();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		//selenium focus on frame o main page
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();

	}

}
