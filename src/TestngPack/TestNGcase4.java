package TestngPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGcase4 
{
	@BeforeSuite
    public void first()
    {
	System.out.println("Beforesuite");
    }
	@BeforeTest
	public void second()
	{
		System.out.println("BeforeTest");
	}
	@Test
	public void third()
	{
		System.out.println("Test");
	}
	@AfterTest
	public void four()
	{
		System.out.println("AfterTest");
	}
}
