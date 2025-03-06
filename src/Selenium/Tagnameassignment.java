//Launch facebook and type your email in email text area using tag name
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagnameassignment {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement d=driver.findElement(By.tagName("input type"));
		d.sendKeys("cs.rajesh073@gmail.com");
		WebElement e=driver.findElement(By.tagName("input type"));
		e.sendKeys("9448787954");
    
	}

}
