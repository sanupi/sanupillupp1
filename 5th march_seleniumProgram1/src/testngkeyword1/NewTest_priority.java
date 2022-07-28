package testngkeyword1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest_priority {
	
	@Test(priority = -3)
	
	  public void Poonam() {
		  Reporter.log("A is running", true);
	  }
	  @Test(priority = -3)
	  public void Poonika() {
		  Reporter.log("B is running", true);
	  }
}
