package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazLoginRelativeXpathAss {

	public static void main(String[] args) {
		 ChromeDriver s=new ChromeDriver();
		    s.get("https://www.amazon.in");
		    s.manage().window().maximize();
		    WebElement Signin = s.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		    Signin.click();
		    
	}

}
