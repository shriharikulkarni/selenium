package testNG_Priority;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	@Test(priority=1)
	public void a() {
		System.out.println("this is a method");	  
	}
	@Test(priority=2)
	public void b() {
		System.out.println("this is b method");	  
	}
	@Test(priority=4)
	public void e() {
		System.out.println("this is c method");
	}
	@Test(priority=3)
	public void c(){
		System.out.println("this is e method");
	}
	@BeforeClass
	public void z() {
		System.out.println("this is z method");	
	}
	@AfterClass
	public void y() {
		System.out.println("this is y method");	
	}
}
