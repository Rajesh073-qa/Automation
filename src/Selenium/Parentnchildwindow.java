//Launch naukri.com Inspect continue with Google Find parent and child Id , move the control to child and close the child tab
package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentnchildwindow {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver d=new ChromeDriver();
    d.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
    d.manage().window().maximize();
    WebElement google=d.findElement(By.xpath("//span[.='Google']"));
    google.click();
    String parentid=d.getWindowHandle();
    System.out.println(parentid);
    Set<String> parentnchild=d.getWindowHandles();
    System.out.println(parentnchild);
    Iterator<String> h =parentnchild.iterator();
    String id1=h.next();
    String id2=h.next();
    System.out.println(id1);
    System.out.println(id2);
    d.switchTo().window(id2);
    Thread.sleep(2000);
    d.close();
	}

}
