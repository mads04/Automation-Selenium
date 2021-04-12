package Frameworks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void T3()
	{
		System.out.println("TestNG T3 test program Executed");

	}
	
	@Test(groups="smoke")
	public void T4()
	{
		System.out.println("TestNG T4 test program Executed");

	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("TestNG Before method test program Executed");

	}

}
