//WAP to utilise invocationCount parameter in TestNG
package TestngPack;

import org.testng.annotations.Test;

public class InvocationCount
{
	@Test(invocationCount=3)
	public void BCD()
	{
		System.out.println("Test 1");
	}
	@Test
	public void asd()
	{
		System.out.println("Test 2");
	}
	@Test(enabled=false)
	public void ABC()
	{
	    System.out.println("Test 3");	
	}
}
