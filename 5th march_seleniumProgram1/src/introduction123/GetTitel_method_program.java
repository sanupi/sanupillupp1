package introduction123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitel_method_program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.javatpoint.com/");
		Thread.sleep(100);

		String Titel = driver.getTitle();
		System.out.println(Titel);
		System.out.println(driver.getTitle());

	}

}
