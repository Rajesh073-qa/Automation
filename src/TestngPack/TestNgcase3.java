package TestngPack;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestNgcase3 
{
@BeforeTest
public void case3()
{
	System.out.println("BT");
}
//@Test
public void casen()
{
	System.out.println("BT");
}
@AfterTest
public void case3(int a)
{    
	a=12;
	System.out.println("AT");
}
@AfterMethod
public void case3(int b,double c)
{
	b=1;
	c=2.1;
	System.out.println("AC");
}
}
