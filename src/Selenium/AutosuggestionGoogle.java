package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionGoogle {

		public static void main(String[] args) throws InterruptedException {
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.google.com");
		    driver.manage().window().maximize();
		    WebElement search=driver.findElement(By.id("APjFqb"));
		    search.sendKeys("India");
		    Thread.sleep(2000);
		    List<WebElement> lists =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		    int count= lists.size();
		    System.out.println(count);
		    lists.get(6).click();	    
	}

}
