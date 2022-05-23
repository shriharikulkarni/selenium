package testNG_Priority;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class NewTest3 {
	@BeforeSuite
    public void j() {
	System.out.println("this is j method");	
  }
	@AfterSuite
    public void k() {
	System.out.println("this is k method");	
}
}