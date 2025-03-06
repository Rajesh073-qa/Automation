//WAP to utilise priority parameter in TestNG
package TestngPack;

import org.testng.annotations.Test;

public class TestNgpriority1 
{
	@Test(priority=2)
	public void BCD()
	{
		System.out.println("Test 1");
	}
	@Test
	public void asd()
	{
		System.out.println("Test 2");
	}
	@Test(priority=1)
	public void ABC()
	{
	    System.out.println("Test 3");	
	}
}
