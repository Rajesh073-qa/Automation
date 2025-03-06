package amazonTestSuite;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AmazonOpennClose
{
	ChromeDriver d;

	@BeforeTest
	public void open()
	{
		 d=new ChromeDriver();
		 d.get("https://www.amazon.in");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void close() throws InterruptedException
	{ 
		Thread.sleep(2000);
		d.quit();
	}

}
