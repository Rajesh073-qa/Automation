//WAP to perform drag and drop Postman in Gotechminds ->Automate me->drag and drop page
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=d.findElement(By.id("div1"));
		WebElement drop=d.findElement(By.id("div2"));
		Actions a1=new Actions(d);
		a1.dragAndDrop(drag, drop).perform();
	}

}
