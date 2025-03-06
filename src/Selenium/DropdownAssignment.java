package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssignment {

	public static void main(String[] args) {
		 ChromeDriver s=new ChromeDriver();
		    s.get("https://www.amazon.in");
		    s.manage().window().maximize();
		    WebElement dropdown=s.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		    Select s1=new Select(dropdown);
		    System.out.println(s1.getOptions());		    
		    s1.selectByVisibleText("Books");
		    WebElement searchfield=s.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		    searchfield.sendKeys("Humans");
		    searchfield.sendKeys(Keys.ENTER);
		    
		    
	}

}
