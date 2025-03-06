//Login into amazon
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeAmazonAssignment {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in");
		    driver.manage().window().maximize();
		    WebElement signin = driver.findElement(By.xpath("(//span)[42]"));
		    signin.click();
		    WebElement email = driver.findElement(By.xpath("(//input)[7]"));
		    email.sendKeys("cs.rajesh073@gmail.com");
		    WebElement continuebutton = driver.findElement(By.xpath("(//input)[10]"));
		    continuebutton.click();
		    WebElement password = driver.findElement(By.xpath("(//input)[9]"));
		    password.sendKeys("Rajesh073@");
		    WebElement SigninButton = driver.findElement(By.xpath("(//input)[11]"));
		    SigninButton.click();

		    
	}

}
