//WAP to utilise isselected(0)
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver d=new ChromeDriver();
		    d.get("file:///C:/Users/csraj/Downloads/learningHTML1.html");
		    d.switchTo().alert().accept();
		    WebElement checkbox=d.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		    boolean a=checkbox.isSelected();
		    System.out.println(a);
		    if(checkbox.isSelected()==true)
		    {
		    	System.out.println("Checkbox is not selected");
		    }
		    else
		    {
		    	System.out.println("Checkbox is not selected so performing some action below");
		    	checkbox.click();
		    	Thread.sleep(1000);
		    	d.close();
		    }
		  

	}

}
