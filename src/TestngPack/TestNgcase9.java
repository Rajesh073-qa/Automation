package TestngPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgcase9 
{
	@Test
	public void BCD()
	{
		System.out.println("Test 1");
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
	@Test
	public void ABC()
	{
	    System.out.println("Test 2");	
	}
	
}
