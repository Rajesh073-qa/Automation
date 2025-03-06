package TestngPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGcase7 
{
	@Test
	public void BCD()
	{
		System.out.println("Test 1");
	}
	@Test
	public void ABC()
	{
	    System.out.println("Test 2");	
	}
	@BeforeSuite
	public void BCDe()
	{
		System.out.println("BeforeSuite 1");
	}
	@AfterSuite
	public void BCDef()
	{
		System.out.println("AftereSuite 2");
	}
}
