package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Program2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		
		Thread.sleep(300);
		
File source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

File destination = new File("G:\\important software for testing\\Screenshot\\myscreenshot123.png");

FileHandler.copy(source1, destination);
	}

}
