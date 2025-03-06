//Accept Java script pop ups in the html page
package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver s=new ChromeDriver();
    s.get("file:///C:/Users/csraj/Downloads/learningHTML1.html");
    Thread.sleep(2000);
    s.switchTo().alert().accept();
    //s.switchTo().alert().dismiss();
    
	}

}