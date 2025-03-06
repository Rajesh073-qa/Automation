package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
	    d.get("https://www.amazon.in");
	    d.manage().window().maximize();
	    WebElement dropdown= d.findElement(By.id("searchDropdownBox"));
	    Select s1=new Select(dropdown);
	    s1.selectByVisibleText("Books");
	    
	    WebElement drive=d.findElement(By.linkText("Canada"));
	    Point location=drive.getLocation();
	    double x=location.getX();
	    System.out.println(x);
	    double y=location.getY();
	    System.out.println(y);
	    d.close();
	    
	    WebElement d1=d.findElement(By.id("searchDropdownBox"));
	    Select s13=new Select(d1);
	    s13.selectByVisibleText("Books");
	    
	    List<WebElement> auto=d.findElements(By.id("searchDropdownBox"));
	    int size=auto.size();
	    System.out.println(size);
	    auto.get(2).click();
	    
	    
	    WebElement d1d=d.findElement(By.id("searchDropdownBox"));
        Actions f=new Actions(d);
        f.moveToElement(d1d).perform();
        f.doubleClick(d1d).perform();
      
        
	}

}
