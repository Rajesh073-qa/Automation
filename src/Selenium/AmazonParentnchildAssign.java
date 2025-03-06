// Launch Amazon .in Type shoes select 1st shoe and close the child
package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonParentnchildAssign {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver d=new ChromeDriver();
    d.get("https://www.amazon.in");
    d.manage().window().maximize();
    WebElement search=d.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("Shoes");
    search.sendKeys(Keys.ENTER);
    WebElement product=d.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
    product.click();
    Set<String> k= d.getWindowHandles();   
    Iterator<String> f=k.iterator();
    String id1=f.next();
    String id2=f.next();
    d.switchTo().window(id2);
    Thread.sleep(2000);
    d.close();
	}

}
