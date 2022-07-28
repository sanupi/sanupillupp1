package testngkeyword1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertfailMethoduseDependsonMethod {
  @Test
  public void M1() {
	  Assert.fail();
	  Reporter.log("M1 method is running", true);
  }
  @Test(dependsOnMethods = {"M1"})
  public void M2()
  {
	  Reporter.log("M2 method is running", true);
  }
  @Test
  public void M3()
  {
	  Reporter.log("M3 method is running", true);
  }
}
