//WAP to utilise isenabled()
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver d=new ChromeDriver();
    d.get("file:///C:/Users/csraj/Downloads/learningHTML1.html");
    d.switchTo().alert().accept();
    WebElement lastname=d.findElement(By.id("121"));
    boolean a=lastname.isEnabled();
    Thread.sleep(1000);
    System.out.println(a);
    
    if(lastname.isEnabled()==true)
    {
    	System.out.println("Element is enabled");
    }
    else
    	System.out.println("Element is disabled");
        d.close();
	}
	
	
	

}
