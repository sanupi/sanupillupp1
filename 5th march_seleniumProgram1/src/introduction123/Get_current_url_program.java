package introduction123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_current_url_program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/");

		String URL = driver.getCurrentUrl();

		System.out.println(URL);
		Thread.sleep(1000);
		driver.close();

	}

}
