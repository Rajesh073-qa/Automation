//WAP to utilise timeOut parameter in TestNG
package TestngPack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgTimeout 
{
	@Test(timeOut=23000)
public void launch()
{
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in");
    Reporter.log("Test Case 1 last line");
}
}
