//After performing postman drag and drop, move postman back and drag some other element and drop.
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=d.findElement(By.id("drag7"));
		WebElement drop=d.findElement(By.id("div2"));
		Actions a1=new Actions(d);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		WebElement drag1=d.findElement(By.id("drag7"));
		WebElement drop1=d.findElement(By.xpath("(//div[@id='div1'])[7]"));
		Thread.sleep(2000);
		a1.dragAndDrop(drag1, drop1).perform();
		WebElement drag2=d.findElement(By.id("drag11"));
		WebElement drop2=d.findElement(By.id("div2"));
		a1.dragAndDrop(drag2, drop2).perform();
	}

}
