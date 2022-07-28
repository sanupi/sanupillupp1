package testngkeyword1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProrityUse1 {
  @Test(priority = -123)
  public void A() {
	  Reporter.log("A is running", true);
  }
  @Test(priority = 0123)
  public void B() {
	  Reporter.log("B is running", true);
  }
  @Test(priority = -444)
  public void c() {
	  Reporter.log("c is running", true);
  }
}
