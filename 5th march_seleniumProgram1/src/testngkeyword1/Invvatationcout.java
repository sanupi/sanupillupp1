package testngkeyword1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invvatationcout {
  @Test(invocationCount = 5)
  public void Mymethod123() {
	  
	  Reporter.log("MY method is running", true);
  }
  @AfterMethod
  public void close()
  {
	  Reporter.log("method is colse", true);
  }
  
}
