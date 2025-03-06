package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchassignment {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://www.google.com");
    d.findElement(By.id("APjFqb")).sendKeys("first president of india");
    d.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    String t= d.getTitle();
    for( int i=0; i<=t.length(); i++)
    {
    	Thread.sleep(2000);
    	char s=t.charAt(i);
    	System.out.println(s);
    }
	}

}
