//Goto flip kart Type shoes count number of autosuggestions  and click onto the last optionpackage Selenium;
package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazAutoAssign {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver s=new ChromeDriver();
	    s.get("https://www.flipkart.com");
	    s.manage().window().maximize();
	    WebElement search=s.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("shoes");
	    Thread.sleep(2000);
	    List<WebElement> autolist=s.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int count=autolist.size();
	    System.out.println(count);
	    autolist.get(7).click();
	}

}
