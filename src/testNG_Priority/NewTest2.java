package testNG_Priority;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	@BeforeClass
    public void x() {
	System.out.println("this is x method");	
  }
	@AfterClass
    public void p() {
	System.out.println("this is p method");	
}
	@AfterTest
    public void l() {
	System.out.println("this is l method");	
}
	@BeforeTest
    public void m() {
	System.out.println("this is m method");	
}
	@BeforeMethod
    public void n() {
	System.out.println("this is n method");	
}
	@AfterMethod
    public void s() {
	System.out.println("this is s method");	
}
}
