package testngkeyword1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProrityKeyword {
  @Test(priority = -3)
  public void A() {
	  
	  Reporter.log("A is running", true);
  }
  @Test(priority = -6)
  public void B() {
	  
	  Reporter.log("B is running", true);
}
  @Test(priority = 1)
  public void D() {
	  
	  Reporter.log("D is running", true);
  }	
  @Test(priority = 0)
  public void C() {
	  
	  Reporter.log("C is running", true);
}
}