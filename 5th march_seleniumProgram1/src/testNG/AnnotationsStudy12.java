package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy12 {
	@Test
	  public void MYtest2() {
		  Reporter.log("MYtest2 method is running", true);
		  
	  }
	  @Test
	  public void MYtest3()
	  {
		  Reporter.log("MYtest 3 is running", true);
	  }
	  @BeforeMethod
	  public void Loing()
	  {
		  Reporter.log("BeforeMethod is running", true);
	  }
	  @AfterMethod
	  public void logout()
	  {
		  Reporter.log("After method is running", true);
	  }
	  @BeforeClass
	  public void LounchBrowers()
	  {
		  Reporter.log("Beforeclass is running", true);
		  
	  }
	  @AfterClass
	  public void closeBrowers()
	  {
		  Reporter.log("Afterclass is running", true);
	  }
}
