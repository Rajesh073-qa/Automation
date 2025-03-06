package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver c=new ChromeDriver();
     c.manage().window().maximize();
     c.get("https://www.amazon.in");
     WebElement BestSeller= c.findElement(By.partialLinkText("Best"));
     BestSeller.click();
     WebElement HotDeal=c.findElement(By.partialLinkText("Hot New"));
     HotDeal.click();
     System.out.println(c.getTitle());
     Thread.sleep(2000);
     c.quit();
     
	}

}
