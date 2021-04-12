package Frameworks;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void T5()
	{
		System.out.println("TestNG T5 test program Executed");

	}
	
	@Test(groups="smoke")
	public void T6()
	{
		System.out.println("TestNG T6 test program Executed");

	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("TestNG Before class test program Executed");

	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("TestNG BeforeSuite test program Executed");

	}
	


}
