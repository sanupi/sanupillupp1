package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnatationStudy {
  @Test
  public void MYtest() {
	  Reporter.log("Test method is running", true);
	  
  }
  @Test
  public void MYtest1()
  {
	  Reporter.log("MYtest1 is running", true);
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

