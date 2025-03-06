//TestNG annotation case1
package TestngPack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {

@Test
public void Tst()
    {
	System.out.println("test");
	}
@BeforeSuite
public void BS()
{
System.out.println("BS");
}

}
