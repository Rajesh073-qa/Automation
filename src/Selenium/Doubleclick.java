package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws AWTException {
    ChromeDriver d=new  ChromeDriver();
    d.get("https://www.amazon.in");
    d.manage().window().maximize();
    WebElement s=d.findElement(By.linkText("Mobiles"));
    Actions a1=new Actions(d);
    a1.doubleClick(s).perform();
    
    
    
    
    a1.contextClick(s).perform();
    Robot V1=new Robot();
    V1.keyPress(KeyEvent.VK_DOWN);
    
    
	}

}
