package Testng_grouping;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test(groups= {"shubhangi","swati"},priority=1)
  public void RKulkarni () {
	  System.out.println("family from malkondji");
  }
  
	  @Test(groups= {"shrihari","sonali"},priority=2)
	  public void  MKulkarni () {
		  System.out.println("family from suslad");
	  }
	  @Test(groups= {"shrihari",},priority=3)
	  public void  sKulkarni () {
		  System.out.println("son of suslad family");
		  
	  }
	  @Test(groups= {"shubhangi",},priority=4)
	  public void Kulkarni () {
		  System.out.println("daughter of malkondji family");
	  }
}
