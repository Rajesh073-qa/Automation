//Use all 9 annotations in a program and check the order of execution
package TestngPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allAnnotation 
{
@BeforeSuite
public void BS()
{
	System.out.println("BS");
}
@BeforeTest
public void Bt()
{
	System.out.println("Bt");
}
@BeforeClass
public void BC()
{
	System.out.println("BC");
}
@BeforeMethod
public void BM()
{
	System.out.println("BM");
}
@Test
public void test()
{
	System.out.println("test");
}
@AfterMethod
public void AM()
{
	System.out.println("AM");
}
@AfterClass
public void AC()
{
	System.out.println("AC");
}
@AfterTest
public void AT()
{
	System.out.println("AT");
}
@AfterSuite
public void AS()
{
	System.out.println("AS");
}
}
