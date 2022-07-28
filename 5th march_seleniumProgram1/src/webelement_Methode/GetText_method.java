package webelement_Methode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\important software for testing\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		
	    WebElement Element1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
//as pan gheu shakto
	  //  System.out.println(Element1.getText());
	         
	   String MyText = Element1.getText();
	   System.out.println(MyText);
	
	String actualText = Element1.getText();
	
	 String expectedText = "Facebook helps you connect and share with the people in your life.";
      
	 
	 if(actualText.equals(expectedText))
	 {
    System.out.println("text is matching TC is pass");
     }
	 else
	 {
       
System.out.println("text is not matching TC is fial");

	}

	}
}
