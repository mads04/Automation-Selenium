package Frameworks;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void T1()
	{
		System.out.println("TestNG T1 test program Executed");

	}
	
	@Test
	public void T2()
	{
		System.out.println("TestNG T2 test program Executed");

	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("TestNG Before Test test program Executed");

	}

}
