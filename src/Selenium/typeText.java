package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class typeText {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://www.google.com");
    d.findElement(By.id("APjFqb")).sendKeys("India");
    Thread.sleep(1000);
    d.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    String a=d.getTitle();
    System.out.println(a);
    d.close();
  
	}

}
