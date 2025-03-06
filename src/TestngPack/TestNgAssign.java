package TestngPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAssign 
{
	@Test
	public void BCD()
	{
		System.out.println("Test 1");
	}
	@Test
	public void asd()
	{
		System.out.println("Test 2");
	}
	@Test
	public void ABC()
	{
	    System.out.println("Test 3");	
	}
	@BeforeMethod
	public void BCDef()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void BCDe()
	{
		System.out.println("AfterMethod");
	}
}
