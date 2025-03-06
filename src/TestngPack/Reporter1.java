//WAP to print all logs in the emailable report using Reporter.log
package TestngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter1 {

	@Test
	public void google()
	{
		   ChromeDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.amazon.in");
		    WebElement link=driver.findElement(By.linkText("Australia"));
		    Point XandY= link.getLocation();
		    double X= XandY.getX();
		    double Y= XandY.getY();
		    System.out.println(X);
		    System.out.println(Y);
		    Reporter.log("Test Case 1 last line");
		    
		
	}

}
