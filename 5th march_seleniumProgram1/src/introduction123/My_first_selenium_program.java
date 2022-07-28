package introduction123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_first_selenium_program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				" G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.javatpoint.com/");

		Thread.sleep(100);
		driver.navigate().to("https://vctcpune.com/");
		Thread.sleep(100);
		driver.navigate().back();
		Thread.sleep(100);

		driver.navigate().forward();

		Thread.sleep(100);
		driver.navigate().refresh();
		Thread.sleep(100);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		// driver.close();
		// driver.quit();

	}

}
