package testngkeyword1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutMethod {
	 @Test(timeOut = 1500)
	  public void A() throws InterruptedException {
		  Thread.sleep(1200);
		  Reporter.log("A is running", true);
	  }
	  @Test
	  public void B() {
		  
		  Reporter.log("B is running", true);
	}
	  @Test(timeOut = 1000)
	  public void D() throws InterruptedException {
		  Thread.sleep(1200);
		  Reporter.log("D is running", true);
	  }	
	  @Test
	  public void C() {
		  
		  Reporter.log("C is running", true);
  }
}
