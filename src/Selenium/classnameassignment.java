//Launch google and type country name using class name locator
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class classnameassignment {

	public static void main(String[] args) throws InterruptedException {
     EdgeDriver n=new EdgeDriver();
     n.manage().window().maximize();
     n.get("https://www.google.com");
     WebElement s=n.findElement(By.className("gLFyf"));
     s.sendKeys("India");
     Thread.sleep(2000);
     s.sendKeys(Keys.ENTER);
	}

}
