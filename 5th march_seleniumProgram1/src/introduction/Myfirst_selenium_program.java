package introduction;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Myfirst_selenium_program
{

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver","G:\\important software for testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		

	}
//	@Test(timeOut = 1000)
//	public void ABC() throws InterruptedException {
//		Thread.sleep(1200);
//		Reporter.log("ABC method is running", true);
	}


