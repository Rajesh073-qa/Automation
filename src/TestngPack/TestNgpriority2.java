package TestngPack;

import org.testng.annotations.Test;

public class TestNgpriority2 
{
	@Test(priority=-100)
	public void BCD()
	{
		System.out.println("Test 1");
	}
	@Test
	public void asd()
	{
		System.out.println("Test 2");
	}
	@Test(priority=100)
	public void ABC()
	{
	    System.out.println("Test 3");	
	}
}
