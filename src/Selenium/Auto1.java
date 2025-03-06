//"Launch Google.co.in Type India Find number of autosuggestions Select 6th autosuggestion"
package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto1 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.google.com");
		    driver.manage().window().maximize();
		    WebElement search=driver.findElement(By.id("APjFqb"));
		    search.sendKeys("India");
		    Thread.sleep(2000);
		    List<WebElement> lists =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		    int count=lists.size();
		    lists.get(3).click();
		    WebElement hover=driver.findElement(By.linkText("Hello, sign in"));
		    Actions a1=new Actions(driver);
		    a1.moveToElement(hover).perform();
		    
	}

}
