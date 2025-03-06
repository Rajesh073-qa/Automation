//Launch flipkart and click onto the cross button
package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipAutoAssign {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver d=new ChromeDriver();
     d.manage().window().maximize();
     d.get("https://www.flipkart.com");
     WebElement close =d.findElement(By.xpath("//span[.='✕']"));
     close.click();
	
	WebElement search= d.findElement(By.name("q"));
	search.sendKeys("shoes");
	Thread.sleep(1000);
	List<WebElement> list= d.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	int count=list.size();
	System.out.println(count);
	list.get(1).click();
	}
    

}

